package com.zemaster.dagger;

import javax.inject.Inject;

public class Stabber implements Staby
{

	@Inject
	public Stabber()
	{	
	}
	
	@Override
	public String stabMe()
	{
		return "You are stabbed with the help of Dagger 2";
	}

}
