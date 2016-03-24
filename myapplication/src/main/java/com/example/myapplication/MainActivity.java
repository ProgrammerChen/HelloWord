package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mButton;
    private EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = (EditText) findViewById(R.id.editText);
        mButton = (Button) findViewById(R.id.my_button);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String str = mEditText.getText().toString();
        if (str.equals("")){
            Toast.makeText(this,"请输入内容！",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
        }
        }

    }

