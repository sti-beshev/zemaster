package com.zemaster.command.control;

import java.util.List;

import com.zemaster.command.BaseCommand;
import com.zemaster.command.Command;
import com.zemaster.command.CommandsLibrary;
import com.zemaster.controllers.ConsoleController;

public class HelpCommand extends BaseCommand implements Command
{
	private CommandsLibrary commandsLibrary;
	private String allCommandsList;
	
	public  static final String COMMAND_NAME = "help";
	
	public HelpCommand(CommandsLibrary commandsLibrary)
	{
		this.commandsLibrary = commandsLibrary;
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
			if (allCommandsList == null)
				allCommandsList = createCommandsList();
			
			ConsoleController.getInstance().writeToConsole(allCommandsList);
		}
		else
		{
			if (args.equals("-h"))
			{
				commandHelp();
			}
		}
	}

	@Override
	public void commandHelp()
	{
		ConsoleController.getInstance().writeToConsole("help - Lists all commands");

	}
	
	private String createCommandsList()
	{
		StringBuilder allCommands = new StringBuilder();
		allCommands.append("For more info use '-h' \n \n");
		
		List<Command> commandsList = commandsLibrary.getAllCommands();
		
		commandsList.stream()
			.forEach(command -> allCommands.append(command.getName() + "\n"));
		
		return allCommands.toString();
	}

}
