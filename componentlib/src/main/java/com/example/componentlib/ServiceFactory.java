package com.example.componentlib;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private ServiceFactory(){};

    public static ServiceFactory getInstance()
    {
        return instance;
    }

    private ILoginService mLoginService;
    private IMineService mMineService;

    public ILoginService getLoginService() {
        return mLoginService;
    }

    public void setLoginService(ILoginService mLoginService) {
        this.mLoginService = mLoginService;
    }

    public IMineService getMineService() {
        return mMineService;
    }

    public void setMineService(IMineService mMineService) {
        this.mMineService = mMineService;
    }
}
