package com.example.myapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("运行到MainActivity的onCreate方法");
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //此处是点击事件，该事件启动一个新的界面
                Intent intent = new Intent();
                //显示的启动Activity，，使用的是Component属性指定了将要启动的组件的名称
                intent.setComponent(new ComponentName(MainActivity.this, SecActivity.class));
                intent.putExtra("text","我是从第一个界面的信息，第二个界面显示这段话吧");

               // Student zhangsan = new Student("张三","男","20");
               // intent.putExtra("student",zhangsan);

               // Bundle bundle = new Bundle();
               // bundle.putCharSequence("name","张三");
               // bundle.putCharSequence("sex","男");
                //bundle.putCharSequence("age","19");
               // intent.putExtra("student",bundle);

                startActivity(intent);
            }
        });


        Button button1 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.change.myapp");
                startActivity(intent);

            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);

            }
        });
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
            }
        });
    }



    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("运行了MainActivity方法的onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("运行了MainActivity方法的onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("运行了MainActivity方法的onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("运行了MainActivity方法的onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("运行了MainActivity方法的onDestroy");
    }
}
