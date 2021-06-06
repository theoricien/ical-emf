package ical.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
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
		File file = new File(parseString(object.getFileName())+".ics"); 
        file.setWritable(true);
        file.setReadable(true);

		try 
		{
			pw = new PrintWriter(file);
			doSwitch(object.getCalendar());

			pw.close();
			System.out.println("Fichier génerer à : "+file.getAbsolutePath());
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		return true;
	}
	
	public Boolean parseIntMonth(int month_index ) {
		String month = "";
		month = Integer.toString((month_index % 12) + 1);
		if (month.length() == 1)
		{
			month = "0" + month;
		}
		pw.print(month);
		return true;
	}
	
	public Boolean parseStringMonth(String val) {
		String month = "";
		
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
		pw.print(month);
				
		return true;
	}
	
	public Boolean caseDateT (DateT date)
	{
		//Year
		if (date.getYear() == null)
		{ pw.print("2021");}
		else 
		{ pw.print(Integer.toString(date.getYear()));}
		
		//Month
		if (date.getMonth() != null ){parseIntMonth(date.getMonth());} 
		else if (date.getMonth_name() != null) {parseStringMonth(date.getMonth_name());}
		else {pw.print("00");}
		
		//Day
		if (date.getDay() == null)
		{ pw.print("01");}
		else 
		{ 
			if (Integer.toString(date.getDay()).length() == 1)
			{pw.print("0" +Integer.toString(date.getDay()));}
			else {pw.print(Integer.toString(date.getDay()));}
		}
		
		//Separation
		pw.print("T");
		
		//Hour
		if (date.getHours() == null)
		{ pw.print("00");}
		else 
		{ 		
			if (Integer.toString(date.getHours()).length() == 1)
			{pw.print("0" +Integer.toString(date.getHours()));}
			else {pw.print(Integer.toString(date.getHours()));}
		}
		
		//Minute
		if (date.getMinutes() == null)
		{ pw.print("00");}
		else 
		{ 
			if (Integer.toString(date.getMinutes()).length() == 1)
			{pw.print("0" +Integer.toString(date.getMinutes()));}
			else {pw.print(Integer.toString(date.getMinutes()));}
			}

		//Second
		if (date.getSeconds() == null)
		{ pw.print("00");}
		else 
		{ 
			if (Integer.toString(date.getSeconds()).length() == 1)
			{pw.print("0" +Integer.toString(date.getSeconds()));}
			else {pw.print(Integer.toString(date.getSeconds()));}
			}
		
		//Fin Date
		pw.println("Z");
		
        return true;

    
	}
	
	public String parseString(String s ) {
		return s.substring(1,s.length()-1);
	}
	
	public String dtstamp ()
	{
		Date d = new Date();
		Timestamp ts = new Timestamp(d.getTime());  
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy MM dd:HH mm ss.");
        String date = formatter.format(ts).replace(" ", "");
        date = date.replace(":", "T");
        date = date.replace(".", "Z");

        return date;      
	}

	@Override
	public Boolean caseEventC(EventC object) {
		pw.println("BEGIN:VEVENT");
		
		if (object.getUid() != null)
		{ pw.println("UID:" + object.getUid()); }
		else
		{ pw.println("UID:" + UUID.randomUUID().toString()); }

		pw.println("DTSTAMP:" + this.dtstamp());

		if (object.getDtstart() != null)
		{ 
			pw.print("DTSTART:" );
			doSwitch(object.getDtstart());
		}

		if (object.getDtend() != null)
		{ 
			pw.print("DTEND:");
			doSwitch(object.getDtend()); 
		}

		if (object.getSummary() != null)
		{pw.println("SUMMARY:" + this.parseString(object.getSummary())); }

		if(object.getLocation()!=null)
		{pw.println("LOCATION:"+this.parseString(object.getLocation()));}

		if(object.getClass_()!=null)
		{pw.println("CLASS:" + this.parseString(object.getClass_()));}

		if( object.getDescription() != null)
		{pw.println("DESCRIPTION:" + this.parseString(object.getDescription()));}

		if( object.getStatus() != null)
		{pw.println("STATUS:" + object.getStatus());}
		
		if( object.getUrl() != null)
		{pw.println("URL:" + this.parseString(object.getUrl()));}
		
		if( object.getPriority() != null)
		{pw.println("PRIORITY:" + this.parseString(object.getPriority()));}
		
		if( object.getTransp() != null)
		{pw.println("TRANSP:" + this.parseString(object.getTransp()));}

		if( object.getRrule().size() > 0 )
		{
			pw.println("RRULE:");
			int x = 0;
			for(String s : object.getRrule())
			{
				if(x == 0) {
					pw.print(this.parseString(s));
					x = 1;
				}
				else {
					pw.print(","+ this.parseString(s)) ;
				}
			}
			pw.println("");
		}

		if (object.getCategories() != null && object.getCategories().size() > 0)
		{
			pw.print("CATEGORIES:");

			int x = 0;
			for(String s : object.getCategories())
			{
				if(x == 0) {
					pw.print(this.parseString(s));
					x = 1;
				}
				else {
					pw.print(","+ this.parseString(s)) ;
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
		
		if(object.getUid() != null){pw.println("UID:"+this.parseString(object.getUid()));}
		
		pw.println("DTSTAMP:"+this.dtstamp());
		
		if(object.getDtstart() != null) {
		pw.print("DTSTART:");
		doSwitch(object.getDtstart());}
		
		if(object.getDue() != null) {
		pw.print("DUE:");
		doSwitch(object.getDue());}
		
		if(object.getSummary() != null) {pw.println("SUMMARY:"+this.parseString(object.getSummary()));}
		
		if(object.getClass_() != null) {pw.println("CLASS:"+object.getClass_());}
		
		if(object.getDescription() != null) {pw.println("DESCRIPTION:"+this.parseString(object.getDescription()));}
		
		if(object.getStatus() != null) {pw.println("STATUS:"+object.getStatus());}
		
		if(object.getUrl() != null) {pw.println("URL:"+this.parseString(object.getUrl()));}
		
		if(object.getPriority() != null) {pw.println("PRIORITY:"+this.parseString(object.getPriority()));}
		
		if(object.getRrule().size() > 0) {
			pw.print("RRULE:");
			int x = 0;
			for(String r : object.getRrule())
			{
				if(x == 0) {
					pw.print(this.parseString(r));
					x = 1;
				}
				else {pw.print(","+ this.parseString(r)) ;}
			}
			pw.println("");
		}

		if(object.getCategories().size() > 0 ) {
			pw.print("CATEGORIES:");
			int x = 0;
			for(String s : object.getCategories())
			{
				if(x == 0) {
					pw.print(this.parseString(s));
					x = 1;
				}
				else {pw.print(","+ this.parseString(s)) ;}
			}
			pw.println("");
		}

		for(AlarmC c : object.getAlarmc()){doSwitch(c);}
		
		pw.println("END:VTODO");
		return true;
	}

	@Override
	public Boolean caseCalendar(Calendar object) 
	{
		pw.println("BEGIN:VCALENDAR");
		
		if(object.getProdid() != null) {pw.println("PRODID:"+this.parseString(object.getProdid()));}
		else {pw.println("PRODID:-//Software Engineering//Projet M1 1.0//FR");}
		
		if(object.getMethod() != null) pw.println("METHOD:"+this.parseString(object.getMethod()));
		
		if(object.getVersion() == null) {pw.println("VERSION:2.0");}
		else {pw.println("VERSION:"+this.parseString(object.getVersion()));}
		
		if(object.getCalscale() != null) {pw.println("CALSCALE:"+this.parseString(object.getCalscale()));}

		for(Component c : object.getComponent()){doSwitch(c);}

		pw.println("END:VCALENDAR");
		return true;
	}


	@Override
	public Boolean caseJournalC(JournalC object) {
		pw.println("BEGIN:VJOURNAL");
		if(object.getUid()!=null) pw.println("UID:"+this.parseString(object.getUid()));
		pw.println("DTSTAMP:"+this.dtstamp());
		if(object.getDtstart()!=null) { pw.print("DTSTART:");doSwitch(object.getDtstart());}
		if(object.getDescription()!=null)pw.println("DESCRIPTION:"+this.parseString(object.getDescription()));
		if(object.getSummary()!=null)pw.println("SUMMARY:"+this.parseString(object.getSummary()));
		if(object.getStatus()!=null)pw.println("STATUS:"+this.parseString(object.getStatus()));
		if(object.getUrl()!=null)pw.println("URL:"+this.parseString(object.getUrl()));

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

		if(object.getOrganizer()!=null)pw.println("ORGANIZER:"+this.parseString(object.getOrganizer()));
		if(object.getContact()!=null)pw.println("CONTACT:"+this.parseString(object.getContact()));
		
		if(object.getAttendee().size() == 1) {pw.println("ATTENDEE:"+object.getAttendee().get(0));}
		else if(object.getAttendee().size() > 1){
			pw.println("ATTENDEE");
			for(String s : object.getAttendee()) {
				pw.println(";"+s);
			}
		}
		
		if(object.getDtstart()!=null) {
		pw.print("DTSTART:");
		doSwitch(object.getDtstart());}
		
		if(object.getDtend()!=null) {
		pw.print("DTEND:");
		doSwitch(object.getDtend());}
		
		pw.println("DTSTAMP:"+this.dtstamp());
		
		for(String s : object.getFreebusy())
		{
			pw.println("FREEBUSY:"+s);
		}
		if(object.getUrl()!=null)pw.println("URL:"+this.parseString(object.getUrl()));
		if(object.getUid()!=null)pw.println("UID:"+this.parseString(object.getUid()));
		if(object.getComment()!=null)pw.println("COMMENT:"+object.getComment());

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

		if(object.getTzid()!=null)pw.println("TZID:"+this.parseString(object.getTzid()));
		if(object.getTzurl()!=null)pw.println("TZUR:"+this.parseString(object.getTzurl()));
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
		if(object.getTzoffseto()!= null) {pw.println("TZOFFSETTO:"+this.parseString(object.getTzoffseto()));}
		if(object.getTzoffsetfrom()!= null) {pw.println("TZOFFSETFROM:"+this.parseString(object.getTzoffsetfrom()));}
		if(object.getDtstart()!= null) {pw.println("DTSTART;"+this.parseString(object.getDtstart()));}
		if(object.getRrule() != null) {pw.println("RRULE:"+this.parseString(object.getRrule()));}
		for(tzpropOptional c : object.getOpt()){doSwitch(c);}
		return true;
	}

	@Override
	public Boolean caseAlarmC(AlarmC object) {

		pw.println("BEGIN:VALARM");
		if(object.getDescription() != null){pw.println("DESCRIPTION:"+object.getDescription());}
		
		pw.println("TRIGGER;"+this.parseString(object.getTrigger()));
		pw.println("ACTION:"+this.parseString(object.getAction()));
		if(object.getAttach()!= null ){pw.println("ATTACH;"+this.parseString(object.getAttach()));}
		if(object.getTime() != null){doSwitch(object.getTime());}
		doSwitch(object.getType());
		pw.println("END:VALARM");

		return true;
	}

	@Override
	public Boolean caseComponentAlarmTime(ComponentAlarmTime object) {
		if(object.getDuration()!="") pw.println("DURATION:"+this.parseString(object.getDuration()));
		if(object.getRepeat()!="") pw.println("REPEAT:"+this.parseString(object.getRepeat()));

		return true;
	}

	@Override
	public Boolean caseComponentAlarmAudioProperty(ComponentAlarmAudioProperty object) {
		if(object.getAttach()!=null)pw.println("ATTACH:"+this.parseString(object.getAttach()));
		return true;
	}

	@Override
	public Boolean caseComponentAlarmDispProperty(ComponentAlarmDispProperty object) {
		if(object.getDescription()!=null)pw.println("DESCRIPTION:"+this.parseString(object.getDescription()));
		return true;
	}

	@Override
	public Boolean caseComponentAlarmEmailProperty(ComponentAlarmEmailProperty object) {
		if(object.getAttach().size() == 1) {pw.println("ATTACH:"+this.parseString(object.getAttach().get(0)));}
		else if(object.getAttach().size() > 1){
			pw.println("ATTACH");
			for(String s : object.getAttach()) {
				pw.println(";"+this.parseString(s));
			}
		}
		
		if(object.getAttendee().size() == 1) {pw.println("ATTENDEE:"+this.parseString(object.getAttendee().get(0)));}
		else if(object.getAttendee().size() > 1){
			pw.println("ATTENDEE");
			for(String s : object.getAttendee()) {
				pw.println(";"+this.parseString(s));
			}
		}
		if(object.getDescription()!=null)pw.println("DESCRIPTION:"+this.parseString(object.getDescription()));
		return true;
	}


	@Override
	public Boolean casetzpropOptional(tzpropOptional object) {
		if(object.getTzname()!=null)pw.println("TZNAME:"+this.parseString(object.getTzname()));
		if(object.getRdate()!=null)pw.println("RDATE:"+this.parseString(object.getRdate()));
		if(object.getComment()!=null)pw.println("COMMENT:"+this.parseString(object.getComment()));
		return true;
	}
	
	@Override
	public Boolean caseComponentAction(ComponentAction object) {
		return super.caseComponentAction(object);
	}

	
	
}
