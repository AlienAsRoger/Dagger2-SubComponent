package com.tunein.myapplication.di.components;

import com.tunein.myapplication.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Main interface to communicate with classes that will use injections. Can be extended in client app or in tests for
 * additional implementations.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

//    void inject(BaseFragment baseFragment);

//    VideoAdComponent plus(VideoAdModule videoAdModule);

}
