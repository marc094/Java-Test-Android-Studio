package com.example.marc.myapplication;

/**
 * Created by Marc on 19/12/2017.
 */

public class UnityPlayerAds {

    private boolean hasVideoAvaliable;

    boolean hasPlayerVideo(){
        System.out.println("UnityAdsPlayer hasPlayedVideo()");
        return true;
    }

    void playVideo(){
        System.out.println("UnityAdsPlayer playVideo()");
    }

    void stopVideo(){
        System.out.println("UnityAdsPlayer stopVideo()");
    }

    boolean hasVideoAvaliable(){
        System.out.println("UnityAdsPlayer hasVideoAvaliable()");
        return hasVideoAvaliable;
    }

}
