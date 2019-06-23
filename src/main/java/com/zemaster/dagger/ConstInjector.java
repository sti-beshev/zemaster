package com.zemaster.dagger;

import javax.inject.Inject;

public class ConstInjector
{
	DaggerMessage daggerMessage;

	@Inject
	public ConstInjector(DaggerMessage daggerMessage)
	{
		this.daggerMessage = daggerMessage;
	}
	
	public String sayHello()
	{
		return daggerMessage.getMessage();
	}
	
	@Inject
	public void enabledMethodInjector(MethodInjectore methodInjectore)
	{
		methodInjectore.setListener(this);
	}
	
	
}
