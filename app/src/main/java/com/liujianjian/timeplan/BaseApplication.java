package com.liujianjian.timeplan;

import android.app.Application;
import android.util.Log;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * created by liujianjian
 * on 2021/6/9 7:14 下午
 */
public class BaseApplication extends Application {
    private static final String TAG = BaseApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "OnCreate");
        CrashReport.initCrashReport(getApplicationContext(), "340a5ac25f", true);
    }
}
