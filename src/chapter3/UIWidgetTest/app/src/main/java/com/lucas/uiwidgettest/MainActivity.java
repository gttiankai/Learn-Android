package com.lucas.uiwidgettest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.P;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private ImageView imageView;

    // 进度条
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);

        editText = findViewById(R.id.edit_text);
        imageView = findViewById(R.id.image_view);
        progressBar = findViewById(R.id.progress_bar);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("This is ProgressDialog");
                progressDialog.setMessage("Loading....");
                progressDialog.setCancelable(true);
                progressDialog.show();
            }
        });


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                String inputText = editText.getText().toString();
                Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.img_2);
                // 控制圆形进度条的消失和
//                if (progressBar.getVisibility() == View.GONE) {
//                    progressBar.setVisibility(View.VISIBLE);
//                } else {
//                    progressBar.setVisibility(View.GONE);
//                }
                // 控制长条进度条的长度
                int progress = progressBar.getProgress();
                progress = progress + 10;
                progressBar.setProgress(progress);

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);

                dialog.setTitle("this is Dialog");
                dialog.setMessage("Something import");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();

                break;
            default:
                break;
        }
    }
}
