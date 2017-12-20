package com.example.marc.myapplication;

/**
 * Created by Marc on 20/12/2017.
 */

public class Activity {
    protected void onCreate() {
        System.out.println("Activity onCreate()");
    }

    protected void onStart() {
        System.out.println("Activity onStart()");
    }

    protected void onFinish() {
        System.out.println("Activity onFinish()");
    }
}
