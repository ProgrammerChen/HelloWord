package com.example.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String html2 = "你好<img src='header'></img>,我也是有图<img src='ic_launcher'></img>的文本";
                Spanned spanned1 = Html.fromHtml(html2, new Html.ImageGetter() {
                    @Override
                    public Drawable getDrawable(String source) {
                        Drawable drawable = null;
                        Class clazz = R.mipmap.class;
                        try {
                            Field field = clazz.getDeclaredField(source);
                            int id = field.getInt(null);
                            drawable = getResources().getDrawable(id);
                            drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                        } catch (NoSuchFieldException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        return drawable;
                    }
                },null);
                textView.setText(spanned1);
            }
        });
    }

}

