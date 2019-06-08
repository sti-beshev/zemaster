package com.zemaster.dagger;

import javax.inject.Inject;

public class ConstInjector
{
	DaggerHelloMessage daggerHelloMessage;

	@Inject
	public ConstInjector(DaggerHelloMessage daggerHelloMessage)
	{
		this.daggerHelloMessage = daggerHelloMessage;
	}
	
	public String sayHello()
	{
		return daggerHelloMessage.getMessage();
	}
	
	
}
