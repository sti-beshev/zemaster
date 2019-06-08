package com.zemaster.dagger;

import com.zemaster.command.BaseCommand;
import com.zemaster.command.Command;
import com.zemaster.controllers.ConsoleController;

public class DaggerCommand extends BaseCommand implements Command
{
	
	public DaggerCommand()
	{
		this.commandName = "dagger";
	}

	@Override
	public String getName()
	{	
		return commandName;
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
			if (args.equals("-h"))
			{
				commandHelp();
			}
			else
			{
				ConsoleController.getInstance().writeToConsole("Unknown argument: " + args);
			}
		}

	}

	@Override
	public void commandHelp()
	{
		ConsoleController.getInstance().writeToConsole("dagger - A demo of Dagger 2");
	}

}
