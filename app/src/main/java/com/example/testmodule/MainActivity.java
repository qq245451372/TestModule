package com.example.testmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.componentlib.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                ServiceFactory.getInstance().getLoginService().launch(MainActivity.this);
            }
        });


        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                ServiceFactory.getInstance().getLoginService().getFragement(getSupportFragmentManager(),R.id.container,new Bundle());
            }
        });


        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                ServiceFactory.getInstance().getMineService().launch(MainActivity.this);
            }
        });

    }
}