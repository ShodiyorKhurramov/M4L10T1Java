package com.example.m4l10t1.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.m4l10t1.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        initView();

    }


    private void initView() {
        countDownTimer();

    }

    void countDownTimer(){
        new CountDownTimer(2000,1000){
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                callSignActivity();
            }
        }.start();

    }
    void  callSignActivity(){
        Intent intent = new Intent(this,SignInActivity.class);
        startActivity(intent);
        finish();
    }
}
