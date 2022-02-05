package com.example.m4l10t1.activity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.m4l10t1.R;

public class SignUpActivity extends AppCompatActivity {
    EditText et_email, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_signup);
        initView();

    }
    private void initView() {
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        Button b_signup = findViewById(R.id.b_signup);
        b_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
        TextView tv_signin = findViewById(R.id.tv_signin);
        tv_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              finish();

            }
        });
    }


}


