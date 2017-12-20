package com.example.marc.myapplication;

/**
 * Created by Marc on 19/12/2017.
 */

public class MenuActivity extends Activity {
    @Override
    protected void onCreate() {
        super.onCreate();
        System.out.println("Menu activity onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Menu activity onStart()");
    }

    @Override
    protected void onFinish() {
        super.onFinish();
        System.out.println("Menu activity onFinish()");
    }
}
