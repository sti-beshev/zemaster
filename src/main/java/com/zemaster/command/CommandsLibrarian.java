package com.zemaster.command;

import java.util.HashMap;

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
		return commandsList.get(commandName);
	}

	public static CommandsLibrary getInstance()
	{
		if (commandsLibrarian == null)
			commandsLibrarian = new CommandsLibrarian();

		return commandsLibrarian;
	}

}
