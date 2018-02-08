package com.tunein.myapplication.di.module;

import com.tunein.myapplication.di.VideoDelegateScope;
import com.tunein.myapplication.interfaces.IVideoPrerollDelegate;
import com.tunein.myapplication.interfaces.IVideoPrerollUiHelper;
import com.tunein.myapplication.videopreroll.VideoPrerollUiHelper;

import dagger.Module;
import dagger.Provides;

/**
 * Application level module that is responsible for providing singletons
 */
@Module
public class VideoDelegateModule {

    private IVideoPrerollDelegate mVideoPrerollDelegate;

    public VideoDelegateModule(IVideoPrerollDelegate videoPrerollDelegate) {
        mVideoPrerollDelegate = videoPrerollDelegate;
    }

    @Provides
    @VideoDelegateScope
    IVideoPrerollDelegate provideIVideoPrerollDelegate() {
        return mVideoPrerollDelegate;
    }

    @Provides
    @VideoDelegateScope
    public IVideoPrerollUiHelper provideVideoPrerollUiHelper(IVideoPrerollDelegate videoPrerollDelegate) {
        return new VideoPrerollUiHelper(videoPrerollDelegate);
    }

}
