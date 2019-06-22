package com.zemaster.dagger;

import dagger.Component;

@Component
public interface FieldInjectorComponent
{
	void inject(DaggerCommand daggerCommand);
}
