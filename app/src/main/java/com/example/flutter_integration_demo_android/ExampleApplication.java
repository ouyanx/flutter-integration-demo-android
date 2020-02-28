package com.example.flutter_integration_demo_android;

import android.app.Application;

import com.tencent.flutter_integration.FlutterIntegrationManager;

public class ExampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FlutterIntegrationManager.sharedInstance().initEngine(this);
    }
}
