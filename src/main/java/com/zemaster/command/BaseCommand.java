package com.zemaster.command;

import java.util.List;

public abstract class BaseCommand
{
	protected List<String> argsList;

	public abstract void commandHelp();
}
