package com.lucas.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        // Intent 获取传递的信息
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Log.d("Secondary", data);
    }
}
