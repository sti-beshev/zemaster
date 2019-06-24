package com.zemaster.dagger;

import javax.inject.Inject;

public class ZeeDaggerMaster
{
	private NormalMessage normalMessage;
	
	@Inject Staby staby;
	
	@Inject
	public ZeeDaggerMaster(NormalMessage normalMessage)
	{
		this.normalMessage = normalMessage;
	}
	
	public String getBlade()
	{
		return normalMessage.getMessage();
	}
	
	public String stab()
	{
		return staby.stabMe();
	}
}
