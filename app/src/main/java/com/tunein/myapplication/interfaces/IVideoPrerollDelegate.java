package com.tunein.myapplication.interfaces;


import com.tunein.myapplication.MainActivity;

/**
 * TODO Alex
 */
public interface IVideoPrerollDelegate {

    MainActivity getActivity();

    boolean isAdPlaying();
}
