package com.lucas.activitylifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Tag", "OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            String tempData = savedInstanceState.getString("data_key");
            Log.d("Tag", tempData);
        }

        Button startNormalActivity = (Button) findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button) findViewById(R.id.start_dialog_activity);
        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });

        startDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Tag", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Tag", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Tag", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Tag", "onDestroy");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Tag", "onReStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Tag", "onStop");
    }

    // 保存临时数据

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String tempData = "some thing jus typed";
        outState.putString("data_key", tempData);
    }
}
