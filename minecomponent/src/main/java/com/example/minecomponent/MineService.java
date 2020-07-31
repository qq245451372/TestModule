package com.example.minecomponent;

import android.content.Context;
import android.content.Intent;

import com.example.componentlib.IMineService;

public class MineService implements IMineService {
    @Override
    public void launch(Context context) {
        Intent intent = new Intent(context,MineActivity.class);
        context.startActivity(intent);
    }
}
