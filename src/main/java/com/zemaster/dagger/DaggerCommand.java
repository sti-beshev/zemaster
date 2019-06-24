package com.zemaster.dagger;

import javax.inject.Inject;

import com.zemaster.command.BaseCommand;
import com.zemaster.command.Command;
import com.zemaster.controllers.ConsoleController;

public class DaggerCommand extends BaseCommand implements Command
{
	
	final static String HELP_MESSAGE = "dagger - A demo of Dagger 2 \n\n" 
																+ "-f	          field injection demo \n"
																+ "-d         injection wit module demo \n"
																+ "-s          interface injection demo";
	
	@Inject FieldInjector fieldInjector;
	@Inject ZeeDaggerMaster zeeDaggerMaster;
	
	public DaggerCommand()
	{
		DaggerZeeDaggerMasterComponent.create().inject(this);
	}
	

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
				
				case "-d": daggerMe(); break;
				
				case "-s": stabMe(); break;
				
				default: ConsoleController.getInstance().writeToConsole("Unknown argument: " + args);
			}
		}
	}

	@Override
	public void commandHelp()
	{
		ConsoleController.getInstance().writeToConsole(HELP_MESSAGE);
	}
	
	public void fieldTrip()
	{
		DaggerFieldInjectorComponent.create().inject(this);
		
		ConsoleController.getInstance().writeToConsole(fieldInjector.sayHello());
	}
	
	public void daggerMe()
	{		
		ConsoleController.getInstance().writeToConsole(zeeDaggerMaster.getBlade());
	}
	
	public void stabMe()
	{
		ConsoleController.getInstance().writeToConsole(zeeDaggerMaster.stab());
	}
}
