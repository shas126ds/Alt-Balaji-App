package com.fms.shashank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoB(View view){

        Intent intent=new Intent(MainActivity.this, MainActivity2.class);
        startMainActivity(intent);
        finish();

    }
}