package com.example.componentlib;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.net.ContentHandler;

public interface ILoginService {
    void launch(Context context);

    Fragment getFragement(FragmentManager fragmentManager, int viewId, Bundle bundle);
}
