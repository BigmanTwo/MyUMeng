package com.example.asus.myumeng;

import android.app.Application;

import com.umeng.socialize.PlatformConfig;

/**
 * Created by Asus on 2016/5/26.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PlatformConfig.setQQZone("1105355023", "yPRyyove86p0BuGU");
    }
}
