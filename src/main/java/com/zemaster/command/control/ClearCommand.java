package com.zemaster.command.control;

import com.zemaster.command.BaseCommand;
import com.zemaster.command.Command;
import com.zemaster.controllers.ConsoleController;

public class ClearCommand extends BaseCommand implements Command
{
	private ConsoleController consoleController;
	
	public  static final String COMMAND_NAME = "clear";

	public ClearCommand(ConsoleController consoleController)
	{
		super();
		
		this.consoleController = consoleController;
	}

	@Override
	public String getName()
	{
		return COMMAND_NAME;
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
