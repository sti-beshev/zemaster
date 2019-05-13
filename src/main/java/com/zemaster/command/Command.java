package com.zemaster.command;

public interface Command
{
	public String getName();
	public void execute(String args);
}
