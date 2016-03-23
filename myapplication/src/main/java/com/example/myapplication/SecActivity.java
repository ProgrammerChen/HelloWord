package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by change on 2016/3/16.
 */
public class SecActivity extends AppCompatActivity{
    private TextView textView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_sec);
        Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        Student zhangsan = (Student) intent.getParcelableExtra("student");

       // Bundle bundle = intent.getBundleExtra("student");
       // String name = (String) bundle.getCharSequence("name");
        //String sex = (String) bundle.getCharSequence("sex");
        //String age = (String) bundle.getCharSequence("age");

        textView = (TextView) findViewById(R.id.textView2);
        textView.setText(text+"同学信息"+zhangsan.getName()+zhangsan.getAge()+zhangsan.getSex());
        System.out.println("运行了SecActivity的onCreate方法");
    }
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("运行了SecActivity方法的onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("运行了SecActivity方法的onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("运行了SecActivity方法的onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("运行了SecActivity方法的onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("运行了SecActivity方法的onDestroy");
    }
}

