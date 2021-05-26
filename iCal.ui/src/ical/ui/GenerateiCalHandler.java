package ical.ui;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.PlatformUI;

import iCal.iCalFormat;

public class GenerateiCalHandler extends AbstractHandler implements IHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		ISelection selection = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow()
				.getActivePage().getSelection();
		if (!(selection instanceof StructuredSelection)) return null;
		
		StructuredSelection selected = (StructuredSelection)selection;
		for (Object o : selected) {
			if(o instanceof iCalFormat) {
				System.err.println("Generation du fichier iCalendar");
	
				iCalFormat format = (iCalFormat) o;
				new GenerateiCalSwitch().doSwitch(format);
	
			} else {
				System.err.println("Format iCalendar inconnu !" );
			}
		}
		
		return null;
	}

}
