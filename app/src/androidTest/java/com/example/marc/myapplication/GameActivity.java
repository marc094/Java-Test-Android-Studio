package com.example.marc.myapplication;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Marc on 19/12/2017.
 */

public class GameActivity extends Activity implements UnityVideoAdsListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("Game activity onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Game activity onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Game activity onStop()");
    }

    void onFail(){
        System.out.println("Game activity onFail()");
    }

    void onWin(){
        System.out.println("Game activity onWin()");
    }

    @Override
    public void onSuccessVideo() {
        System.out.println("Game activity onSuccessVideo()");
    }

    @Override
    public void onFailVideo() {
        System.out.println("Game activity onFailVideo()");
    }
}
