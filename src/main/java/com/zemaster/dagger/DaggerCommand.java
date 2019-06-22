package com.zemaster.dagger;

import javax.inject.Inject;

import com.zemaster.command.BaseCommand;
import com.zemaster.command.Command;
import com.zemaster.controllers.ConsoleController;

public class DaggerCommand extends BaseCommand implements Command
{
	
	@Inject FieldInjector fieldInjector;

	@Override
	public String getName()
	{	
		return "dagger";
	}

	@Override
	public void execute(String args)
	{
		if (args.isEmpty())
		{			
			ConstInjector constInjector = DaggerConstInjectorComponent.create().getConstInjector();
			
			ConsoleController.getInstance().writeToConsole(constInjector.sayHello());
		}
		else
		{
			switch (args)
			{
				case "-h": commandHelp(); break;
				
				case "-f": fieldTrip(); break;
				
				default: ConsoleController.getInstance().writeToConsole("Unknown argument: " + args);
			}
		}

	}

	@Override
	public void commandHelp()
	{
		ConsoleController.getInstance().writeToConsole("dagger - A demo of Dagger 2");
	}
	
	public void fieldTrip()
	{
		DaggerFieldInjectorComponent.create().inject(this);
		
		ConsoleController.getInstance().writeToConsole(fieldInjector.sayHello());
	}

}
