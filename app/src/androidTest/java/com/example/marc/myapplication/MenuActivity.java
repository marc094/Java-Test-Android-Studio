package com.example.marc.myapplication;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Marc on 19/12/2017.
 */

public class MenuActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("Menu activity onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Menu activity onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Menu activity onStop()");
    }
}
