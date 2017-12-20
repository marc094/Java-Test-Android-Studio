package com.example.marc.myapplication;

/**
 * Created by Marc on 19/12/2017.
 */

public class GameActivity extends Activity implements UnityVideoAdsListener {

    @Override
    protected void onCreate() {
        super.onCreate();
        System.out.println("Game activity onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Game activity onStart()");
    }

    @Override
    protected void onFinish() {
        super.onFinish();
        System.out.println("Game activity onFinish()");
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
