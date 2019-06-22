package com.zemaster.dagger;

import javax.inject.Inject;

public class FieldInjector
{
	DaggerMessage daggerMessage;

	@Inject
	public FieldInjector(DaggerMessage daggerMessage)
	{
		this.daggerMessage = daggerMessage;
		daggerMessage.setMessage("This is a field trip :)");
	}
	
	public String sayHello()
	{
		return daggerMessage.getMessage();
	}
}
