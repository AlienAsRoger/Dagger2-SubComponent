package com.tunein.myapplication.videopreroll;

import com.tunein.myapplication.MainActivity;
import com.tunein.myapplication.di.components.TuneInAppComponent;
import com.tunein.myapplication.di.module.VideoDelegateModule;
import com.tunein.myapplication.interfaces.IVideoPrerollDelegate;
import com.tunein.myapplication.interfaces.IVideoPrerollHost;
import com.tunein.myapplication.interfaces.IVideoPrerollUiHelper;

import javax.inject.Inject;

/**
 *
 */
public class VideoPrerollDelegate implements IVideoPrerollDelegate {

    @Inject
    IVideoPrerollUiHelper mVideoPrerollUiHelper;

    public VideoPrerollDelegate(IVideoPrerollHost videoPrerollHost) {
        ((TuneInAppComponent) videoPrerollHost.getAppComponent())
                .add(new VideoDelegateModule(this))
                .inject(this);

        mVideoPrerollUiHelper.initWidgets(videoPrerollHost.getActivity());
    }

    @Override
    public MainActivity getActivity() {
        return null;
    }

    @Override
    public boolean isAdPlaying() {
        return false;
    }
}
