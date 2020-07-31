package com.example.logincomponent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.componentlib.ILoginService;

public class LoginService implements ILoginService {
    @Override
    public void launch(Context context) {
        Intent intent = new Intent(context,LoginActivity.class);
        context.startActivity(intent);
    }

    @Override
    public Fragment getFragement(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        UserInfoFragment fragment = new UserInfoFragment();
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().add(viewId,fragment).commit();
        return fragment;
    }
}
