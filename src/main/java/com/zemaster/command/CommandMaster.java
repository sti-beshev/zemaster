package com.zemaster.command;

public class CommandMaster implements Commander
{
	private CommandsLibrary commandsLibrary;
	
	public CommandMaster(CommandsLibrary commandsLibrary)
	{
		this.commandsLibrary = commandsLibrary;
	}

	@Override
	public void executeCommand(String command)
	{
		commandsLibrary.getCommand(command).execute("");
	}

}
