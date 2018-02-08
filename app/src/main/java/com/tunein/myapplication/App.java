package com.tunein.myapplication;

import android.app.Application;

import com.tunein.myapplication.di.components.AppComponent;
import com.tunein.myapplication.di.components.DaggerTuneInAppComponent;
import com.tunein.myapplication.di.module.AppModule;

/**
 *
 */
public class App extends Application {

    private AppComponent appComponent;

    protected AppComponent createAppComponent() {
        return DaggerTuneInAppComponent.builder()
//                .appModule(new AppModule())
                .build();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        if (appComponent == null) {
            appComponent = createAppComponent();
        }
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}
