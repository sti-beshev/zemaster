package com.zemaster.dagger;

import javax.inject.Inject;

public class DaggerHelloMessage
{
	@Inject
	public DaggerHelloMessage()
	{
	}
	public String getMessage()
	{
		return "Hello from Dagger 2";
	}
}
