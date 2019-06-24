package com.zemaster.dagger;

import dagger.Component;

@Component(modules = {ZeeDaggerMasterModule.class, StabberModule.class})
public interface FieldInjectorComponent
{
	void inject(DaggerCommand daggerCommand);
}
