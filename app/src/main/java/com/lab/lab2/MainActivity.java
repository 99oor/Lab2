package com.lab.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void skip1(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,LinearLayout.class);
        startActivity(intent);
    }

    public void skip2(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,RelativeLayout.class);
        startActivity(intent);
    }

    public void skip3(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,TableLayout.class);
        startActivity(intent);
    }
}
