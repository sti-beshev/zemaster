package com.zemaster.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class ZeeDaggerMasterModule
{
	@Provides
	public NormalMessage normalMessageProvider()
	{
		return new NormalMessage("I am a normal message");
	}
}
