package com.zemaster.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.zemaster.controllers.ConsoleController;

public class CommandsLibrarian implements CommandsLibrary
{

	private static CommandsLibrarian commandsLibrarian;

	private HashMap<String, Command> commandsList;

	private CommandsLibrarian()
	{
		commandsList = new HashMap<>();
	}

	public void addCommand(Command command)
	{
		commandsList.put(command.getName(), command);
	}

	@Override
	public Command getCommand(String commandName)
	{
		Command command = commandsList.get(commandName);
		
		if(command == null)
			command = new NotFoundCommand(commandName);
		
		return command;
	}
	
	@Override
	public List<Command> getAllCommands()
	{		
		return new ArrayList<>(commandsList.values());
	}

	public static CommandsLibrarian getInstance()
	{
		if (commandsLibrarian == null)
			commandsLibrarian = new CommandsLibrarian();

		return commandsLibrarian;
	}
	
	private class NotFoundCommand extends BaseCommand implements Command
	{
		private final String commandName = "notFound";
		private String wrongCommandName;
		
		public NotFoundCommand(String wrongCommandName)
		{
			this.wrongCommandName = wrongCommandName;
		}

		@Override
		public String getName()
		{
			return commandName;
		}

		@Override
		public void execute(String args)
		{
			ConsoleController.getInstance().writeToConsole("Unknown command: " + wrongCommandName);
		}

		@Override
		public void commandHelp()
		{
			// TODO Auto-generated method stub			
		}
		
	}
}
