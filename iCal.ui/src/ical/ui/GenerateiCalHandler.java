package ical.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;

public class GenerateiCalHandler extends AbstractHandler implements IHandler {

	@Override
	public boolean isHandled ()
	{ return true; }
	
	@Override
	public boolean isEnabled ()
	{ return true; }
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
