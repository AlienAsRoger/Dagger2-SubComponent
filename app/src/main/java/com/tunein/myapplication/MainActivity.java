package com.tunein.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tunein.myapplication.di.components.AppComponent;
import com.tunein.myapplication.interfaces.IVideoPrerollHost;
import com.tunein.myapplication.videopreroll.VideoPrerollDelegate;

public class MainActivity extends AppCompatActivity implements IVideoPrerollHost {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new VideoPrerollDelegate(this);
    }

    @Override
    public AppComponent getAppComponent() {
        return ((App) getApplication()).getAppComponent();
    }

    @Override
    public Activity getActivity() {
        return null;
    }

    @Override
    public void enableRegularAds(boolean enable) {

    }
}
