package com.tunein.myapplication.di.components;

import com.tunein.myapplication.di.module.VideoDelegateModule;
import com.tunein.myapplication.di.VideoDelegateScope;
import com.tunein.myapplication.interfaces.IVideoPrerollDelegate;
import com.tunein.myapplication.interfaces.IVideoPrerollUiHelper;
import com.tunein.myapplication.videopreroll.VideoPrerollDelegate;

import dagger.Subcomponent;

/**
 * TODO Alex
 */
@VideoDelegateScope
@Subcomponent(modules = {VideoDelegateModule.class})
public interface VideoDelegateComponent {

    void inject(VideoPrerollDelegate delegate);

    IVideoPrerollDelegate videoPrerollDelegate();

    IVideoPrerollUiHelper provideVideoPrerollUiHelper();
}
