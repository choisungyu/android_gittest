package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 화면 레이아웃
        setContentView(R.layout.activity_main);
    }

    public void helloButtonClicked(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name", "최성규");
        startActivity(intent);
    }
}
