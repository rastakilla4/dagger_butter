package com.gsoft.injection.di;

import com.gsoft.injection.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@PerActivity
@Singleton
@Component(modules = ModuleTest.class)
public interface ComponentTest {

    void inject(MainActivity mainActivity);

}
