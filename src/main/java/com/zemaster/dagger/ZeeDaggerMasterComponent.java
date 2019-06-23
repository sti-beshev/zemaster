package com.zemaster.dagger;

import dagger.Component;

@Component(modules = ZeeDaggerMasterModule.class)
public interface ZeeDaggerMasterComponent
{
	void inject(DaggerCommand daggerCommand);
}
