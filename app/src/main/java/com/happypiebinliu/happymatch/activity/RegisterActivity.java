package com.happypiebinliu.happymatch.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.happypiebinliu.happymatch.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        setContentView(R.layout.register);
    }
}
