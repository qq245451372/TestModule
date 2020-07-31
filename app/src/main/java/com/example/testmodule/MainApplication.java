package com.example.testmodule;

import android.app.Application;

import com.example.componentlib.AppCompat;
import com.example.componentlib.AppConfig;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        for (String component : AppConfig.COMPONENETS)
        {
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if (object instanceof AppCompat)
                {
                    ((AppCompat)object).initializa(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
