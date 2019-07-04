package com.strikalov.interestingtoolshw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.Serializable;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(MainActivity.button != null){
            Log.i("MyLogger", "button not null");
        }else {
            Log.i("MyLogger", "button null");
        }
    }
}
