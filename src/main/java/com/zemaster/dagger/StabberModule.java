package com.zemaster.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class StabberModule
{

	@Provides
	public Staby stabberProvider()
	{
		return new Stabber();
	}
}
