package com.gsoft.injection.di;

import android.app.Application;

public class App extends Application {


    private ComponentTest componentTest;

    @Override
    public void onCreate() {
        super.onCreate();
        componentTest = DaggerComponentTest.builder().moduleTest(new ModuleTest()).build();
    }


    public ComponentTest getComponentTest() {
        return componentTest;
    }
}
