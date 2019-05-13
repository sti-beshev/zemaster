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
		if (command.contains(" "))
		{
			final String commandName =  command.substring(0, command.indexOf(" "));
			final String commandArgs = command.substring(command.indexOf(" ")+1, command.length());
			
			commandsLibrary.getCommand(commandName).execute(commandArgs);
		}
		else
		{
			commandsLibrary.getCommand(command).execute("");
		}
		
	}

}
