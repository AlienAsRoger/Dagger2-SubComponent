package com.tunein.myapplication.di.components;

import com.tunein.myapplication.di.module.AppModule;
import com.tunein.myapplication.di.module.TuneInAppModule;
import com.tunein.myapplication.di.module.VideoDelegateModule;
import com.tunein.myapplication.videopreroll.VideoPrerollDelegate;

import javax.inject.Singleton;

import dagger.Component;

/**
 *
 */
@Singleton
@Component(modules = {TuneInAppModule.class, AppModule.class})
public interface TuneInAppComponent extends AppComponent {

//    void inject(VideoPrerollDelegate delegate);

    VideoDelegateComponent add(VideoDelegateModule delegate);
}

