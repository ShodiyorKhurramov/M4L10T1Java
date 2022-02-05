package com.example.m4l10t1.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.m4l10t1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        startSplashActivity();

    }

    void startSplashActivity(){
        Intent intent = new Intent(this,SplashActivity.class);
        startActivity(intent);
    }
}