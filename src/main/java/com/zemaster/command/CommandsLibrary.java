package com.zemaster.command;

import java.util.List;

public interface CommandsLibrary
{
	public Command getCommand(String commandName);
	
	public List<Command> getAllCommands();
}
