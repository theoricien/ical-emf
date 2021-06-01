package ical.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.eclipse.emf.ecore.EObject;

import iCal.*;
import iCal.AlarmC;
import iCal.AlarmType;
import iCal.Calendar;
import iCal.Component;
import iCal.ComponentAction;
import iCal.ComponentAlarmAudioProperty;
import iCal.ComponentAlarmDispProperty;
import iCal.ComponentAlarmEmailProperty;
import iCal.ComponentAlarmTime;
import iCal.ComponentRequired;
import iCal.DateT;
import iCal.EventC;
import iCal.JournalC;
import iCal.MonthT;
import iCal.TimeZoneC;
import iCal.ToDoC;
import iCal.VacationC;
import iCal.iCalFormat;
import iCal.tzprop;
import iCal.tzpropOptional;
import iCal.util.ICalSwitch;

public class GenerateiCalSwitch extends ICalSwitch<Boolean> {
	private PrintWriter pw;
	
	public GenerateiCalSwitch() {
		super();
	
	}

	@Override
	public Boolean caseiCalFormat(iCalFormat object) 
	{
		File file = new File(object.getFileName()+".ics"); 
        file.setWritable(true);
        file.setReadable(true);
		try 
		{
			pw = new PrintWriter(file);
			doSwitch(object.getCalendar());
			pw.close();
			System.err.println("Fichier génerer à : "+file.getAbsolutePath());
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		return true;
	}
	
	public String parseDate (DateT date)
	{
		int day = date.getDay();
		AMonthT amonth = date.getMonth();
		String month = "";
		if (amonth instanceof MonthT)
		{
			int month_index = ((MonthT) amonth).getValue();
			month = Integer.toString((month_index % 12) + 1);
			if (month.length() == 1)
			{
				month = "0" + month;
			}
		} else {
			String val = ((MonthNameT) amonth).getValue();
			if (val.equals("Janvier"))
			{ month = "01"; }
			else if (val.equals("Fevrier"))
			{ month = "02"; }
			else if (val.equals("Mars"))
			{ month = "03"; }
			else if (val.equals("Avril"))
			{ month = "04"; }
			else if (val.equals("Mai"))
			{ month = "05"; }
			else if (val.equals("Juin"))
			{ month = "06"; }
			else if (val.equals("Juillet"))
			{ month = "07"; }
			else if (val.equals("Aout"))
			{ month = "08"; }
			else if (val.equals("Septembre"))
			{ month = "09"; }
			else if (val.equals("Octobre"))
			{ month = "10"; }
			else if (val.equals("Novembre"))
			{ month = "11"; }
			else if (val.equals("Decembre"))
			{ month = "12"; }
		}
		
		String year = "";
		
		if (date.getYear() == null)
		{ year = "2021"; }
		else 
		{ year = Integer.toString(date.getYear()); }
		
		String hours = "";
		
		if (date.getHours() == null)
		{ hours = "00"; }
		else 
		{ hours = Integer.toString(date.getHours()); }
		
		String minutes = "";
		
		if (date.getMinutes() == null)
		{ minutes = "00"; }
		else 
		{ minutes = Integer.toString(date.getMinutes()); }
		
		String seconds = "";
		
		if (date.getSeconds() == null)
		{ seconds = "00"; }
		else 
		{ seconds = Integer.toString(date.getSeconds()); }
		
		Date d = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        String format = year + "-" + month + "-" + day + "-" + hours + ":" + minutes + ":" + seconds;
        
        return formatter.format(format);         
	}
	
	public String dtstamp ()
	{
		Date d = new Date();
		Timestamp ts = new Timestamp(d.getTime());  
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        
        return formatter.format(ts);      
	}

	@Override
	public Boolean caseEventC(EventC object) {
		pw.println("BEGIN:VEVENT");
		
		if (object.getUid() != null)
		{ pw.println("UID:" + object.getUid()); }
		else
		{ pw.println("UID:" + UUID.randomUUID().toString()); }
		
		pw.println("DTSTAMP:" + this.dtstamp());
		pw.println("DTSTART:" + this.parseDate(object.getDtstart()));
		
		if (object.getDtend() != null)
		{ pw.println("DTEND:" + this.parseDate(object.getDtend())); }
		
		if (object.getSummary() != null)
		{ pw.println("SUMMARY:" + object.getSummary()); }
		
		//pw.println("CLASS:" + object.getClass_());

		//pw.println("DESCRIPTION:" + object.getDescription());
		//pw.println("STATUS:" + object.getStatus());
		//pw.println("URL:" + object.getUrl());
		//pw.println("PRIORITY:" + object.getPriority());
		//pw.println("TRANSP:" + object.getTransp());
		//pw.println("RRULE:"+object.getRrule());
		
		if (object.getCategories() != null && object.getCategories().size() > 0)
		{
			pw.print("CATEGORIES:");

			int x = 0;
			for(String s : object.getCategories())
			{
				if(x == 0) {
					pw.print(s);
					x = 1;
				}
				else {
					pw.print(", "+ s) ;
				}
			}
			pw.println("");
		}

		for(AlarmC c : object.getAlarmc())
		{
			doSwitch(c);
		}
		pw.println("END:VEVENT");
		return true;
	}

	@Override
	public Boolean caseToDoC(ToDoC object) {
		pw.println("BEGIN:VTODO");
		pw.println("UID:"+object.getUid());
		pw.println("DTSTAMP:"+object.getDtstamp());
		pw.println("DTSTART:"+object.getDtstart());
		pw.println("DUE:"+object.getDtend());
		pw.println("SUMMARY:"+object.getSummary());
		pw.println("CLASS:"+object.getClass_());
		pw.println("DESCRIPTION:"+object.getDescription());
		pw.println("SUMMARY:"+object.getSummary());
		pw.println("STATUS:"+object.getStatus());
		pw.println("URL:"+object.getUrl());
		pw.println("PRIORITY:"+object.getPriority());
		pw.println("RRULE:"+object.getRrule());

		pw.print("CATEGORIES:");
		int x = 0;
		for(String s : object.getCategories())
		{
			if(x == 0) {
				pw.print(s);
				x = 1;
			}
			else {
				pw.print(", "+ s) ;
			}
		}

		for(AlarmC c : object.getAlarmc())
		{
			doSwitch(c);
		}
		pw.println("END:VTODO");
		return true;
	}

	@Override
	public Boolean caseCalendar(Calendar object) 
	{
		pw.println("BEGIN:VCALENDAR");
		pw.println("VERSION:2.0");
		pw.println("PRODID:-//Software Engineering//Projet M1 1.0//FR");
		//pw.println("METHOD:"+object.getMethod());
		//pw.println("VERSION:"+object.getVersion());
		//pw.println("CALSCALE:"+object.getCalscale());

		for(Component c : object.getComponent())
		{
			doSwitch(c);
		}

		pw.println("END:VCALENDAR");
		return true;
	}

	@Override
	public Boolean caseComponentAction(ComponentAction object) {
		// TODO Auto-generated method stub
		return super.caseComponentAction(object);
	}

	@Override
	public Boolean caseJournalC(JournalC object) {
		pw.println("BEGIN:VJOURNAL");
		pw.println("UID:"+object.getUid());
		pw.println("DTSTAMP:"+object.getDtstamp());
		pw.println("DTSTART:"+object.getDtstart());
		pw.println("SUMMARY:"+object.getSummary());
		pw.println("DESCRIPTION:"+object.getDescription());
		pw.println("SUMMARY:"+object.getSummary());
		pw.println("STATUS:"+object.getStatus());
		pw.println("URL:"+object.getUrl());

		
		for(String s : object.getX_prop())
		{
			pw.print(s);
		}

		pw.println("END:VJOURNAL");
		return true;
	}

	@Override
	public Boolean caseVacationC(VacationC object) {
		pw.println("BEGIN:VFREEBUSY");

		pw.println("ORGANIZER:"+object.getOrganizer());
		pw.println("CONTACT:"+object.getContact());
		pw.println("ATTENDEE:"+object.getAttendee());
		pw.println("DTSTART:"+object.getDtstart());
		pw.println("DTEND:"+object.getDtend());
		pw.println("DTSTAMP:"+object.getDtstamp());
		for(String s : object.getFreebusy())
		{
			pw.println("FREEBUSY:"+s);
		}
		pw.println("URL:"+object.getUrl());
		pw.println("UID:"+object.getUid());
		pw.println("COMMENT:"+object.getComment());

		pw.println("END:VFREEBUSY");

		return true;
	}

	@Override
	public Boolean caseComponentRequired(ComponentRequired object) {
		// TODO Auto-generated method stub
		return super.caseComponentRequired(object);
	}

	@Override
	public Boolean caseTimeZoneC(TimeZoneC object) {
		pw.println("BEGIN:VTIMEZONE");

		pw.println("TZID:"+object.getTzid());
		pw.println("TZUR:"+object.getTzurl());
		for(tzprop c : object.getStandardc())
		{
			pw.println("BEGIN:STANDARD");
			doSwitch(c);
			pw.println("END:STANDARD");

		}
		for(tzprop c : object.getDaylightc())
		{
			pw.println("BEGIN:DAYLIGHT");
			doSwitch(c);
			pw.println("END:DAYLIGHT");

		}
		pw.println("END:VTIMEZONE");

		return true;
	}

	@Override
	public Boolean casetzprop(tzprop object) {
		pw.println("TZOFFSETTO:"+object.getTzoffseto());
		pw.println("TZOFFSETFROM:"+object.getTzoffsetfrom());
		pw.println("DTSTART;"+object.getDtstart());
		pw.println("RRULE:"+object.getRrule());
		for(tzpropOptional c : object.getOpt())
		{
			doSwitch(c);
		}
		return true;
	}

	@Override
	public Boolean caseAlarmC(AlarmC object) {
		pw.println("BEGIN:VALARM");
		pw.println("DESCRIPTION:"+object.getDescription());
		pw.println("TRIGGER;"+object.getTrigger());
		pw.println("DURATION:"+object.getAction()); //todo
		pw.println("ACTION:"+object.getAction());
		pw.println("ATTACH;"+object.getAttach());
		doSwitch(object.getTime());

		doSwitch(object.getType());

		pw.println("END:VALARM");
		return true;
	}

	@Override
	public Boolean caseComponentAlarmTime(ComponentAlarmTime object) {
		if(object.getDuration()!="") pw.println("DURATION:"+object.getDuration());
		if(object.getRepeat()!="") pw.println("REPEAT:"+object.getRepeat());

		return true;
	}

	@Override
	public Boolean caseComponentAlarmAudioProperty(ComponentAlarmAudioProperty object) {
		pw.println("ATTACH;"+object.getAttach());
		return true;
	}

	@Override
	public Boolean caseComponentAlarmDispProperty(ComponentAlarmDispProperty object) {
		pw.println("DESCRIPTION:"+object.getDescription());
		return true;
	}

	@Override
	public Boolean caseComponentAlarmEmailProperty(ComponentAlarmEmailProperty object) {
		pw.println("ATTACH;"+object.getAttach());
		pw.println("ATTENDEE:"+object.getAttendee());
		pw.println("DESCRIPTION:"+object.getDescription());

		return true;
	}


	@Override
	public Boolean casetzpropOptional(tzpropOptional object) {
		pw.println("TZNAME:"+object.getTzname());
		pw.println("RDATE:"+object.getRdate());
		pw.println("COMMENT:"+object.getComment());

		return true;
	}


	
	
}
