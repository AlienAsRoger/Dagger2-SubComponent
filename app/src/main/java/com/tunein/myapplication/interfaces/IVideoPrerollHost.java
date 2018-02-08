package com.tunein.myapplication.interfaces;

import android.app.Activity;


import com.tunein.myapplication.di.components.AppComponent;


/**
 * Interface for communication between VideoPrerollDelegate and PlayerActivity
 */
public interface IVideoPrerollHost {

    AppComponent getAppComponent();

    Activity getActivity();

//    AudioSession getAudioSession();

    void enableRegularAds(boolean enable);
}
