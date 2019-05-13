package com.zemaster.command.control;

import com.zemaster.command.BaseCommand;
import com.zemaster.command.Command;
import com.zemaster.controllers.ConsoleController;

public class ClearCommand extends BaseCommand implements Command
{
	private ConsoleController consoleController;
	
	private final String commandName;

	public ClearCommand(ConsoleController consoleController)
	{
		super();
		this.consoleController = consoleController;
		
		commandName = "clear";
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
			consoleController.clearText();
		}
		else
		{
			if (args.equals("-h"))
			{
				commandHelp();
			}
			else
			{
				consoleController.writeToConsole("Unknown argument: " + args);
			}
		}
	}

	@Override
	public void commandHelp()
	{
		consoleController.writeToConsole("clear - Clears all the text in the console.");
	}

}
