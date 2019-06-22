package com.zemaster.dagger;

import javax.inject.Inject;

public class DaggerMessage
{
	private String message;
	
	@Inject
	public DaggerMessage()
	{
		message = "Hello from Dagger 2";
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}
	
	
}
