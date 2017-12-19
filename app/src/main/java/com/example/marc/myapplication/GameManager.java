package com.example.marc.myapplication;

/**
 * Created by Marc on 19/12/2017.
 */
public class GameManager {
    private static GameManager ourInstance = new GameManager();

    public static GameManager getInstance() {
        return ourInstance;
    }

    private GameManager() {
    }

    private int coolDownTimeAds;
    public int getCoolDownTimeAds(){
        return coolDownTimeAds;
    }
    public void setCoolDownTimeAds(int coolDownTimeAds1){
        coolDownTimeAds = coolDownTimeAds1;
    }
    private int lives;
    private int currentLevel;

    boolean nextAdAccepted(){
        return true;
    }
}
