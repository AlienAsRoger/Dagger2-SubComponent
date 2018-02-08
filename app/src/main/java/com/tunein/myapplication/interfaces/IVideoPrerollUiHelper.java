package com.tunein.myapplication.interfaces;

import android.app.Activity;


/**
 * Interface for communication between business logic of VideoPreroll and UI part.
 */
public interface IVideoPrerollUiHelper {

    void initWidgets(Activity activity);

    void onRequestingAd();

    void onPause();

    void addAdViewToContainer(Object adView);

    void onPlayClick();

    void onPauseClick();

    void onVideoAdStarted();

    void resumeContent();

    void resumeContentAnimated();

//    IVideoCompanionAdView getCompanionAdInfo();

    void restoreUiStates();

//    void setAdControl(IVideoAdControl adControl);
}
