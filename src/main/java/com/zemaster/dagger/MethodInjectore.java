package com.zemaster.dagger;

import javax.inject.Inject;

import com.zemaster.controllers.ConsoleController;

public class MethodInjectore
{

	@Inject
	public MethodInjectore()
	{
		
	}
	
	public void setListener(ConstInjector constInjector)
	{
		ConsoleController.getInstance().writeToConsole("Dagger command activated");
	}

}
