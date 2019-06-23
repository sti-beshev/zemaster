package com.zemaster.dagger;

import javax.inject.Inject;

public class ZeeDaggerMaster
{
	private NormalMessage normalMessage;
	
	@Inject
	public ZeeDaggerMaster(NormalMessage normalMessage)
	{
		this.normalMessage = normalMessage;
	}
	
	public String getBlade()
	{
		return normalMessage.getMessage();
	}
}
