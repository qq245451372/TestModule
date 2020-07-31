package com.example.logincomponent;

import android.app.Application;
import android.content.pm.ApplicationInfo;

import com.example.componentlib.AppCompat;
import com.example.componentlib.ServiceFactory;

public class LoginApplication extends Application implements AppCompat {
    private static Application application;
    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static Application getApplication()
    {
        return application;
    }


    @Override
    public void initializa(Application app) {
        application = app;
        ServiceFactory.getInstance().setLoginService(new LoginService());
    }
}
