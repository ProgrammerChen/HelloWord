package com.example.change.helloword;

import android.os.PersistableBundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("运行了onCreate");

    }


    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("运行了onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("运行了onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("运行了onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("运行了onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("运行了onDestroy");
    }
}
