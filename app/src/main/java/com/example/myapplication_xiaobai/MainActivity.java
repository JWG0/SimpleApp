package com.example.myapplication_xiaobai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication_xiaobai.no2.no2Activity;

public class MainActivity extends AppCompatActivity {
    private Button mBtn_no1;
    private Button mBtn_web;
    private Button mBtn_no2;
    private Button mBtn_light;
    private Button mBtn_no4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//入口
        setContentView(R.layout.activity_main);
        mBtn_no1=(Button)findViewById(R.id.btn_no1);//找到控件
        mBtn_web=(Button)findViewById(R.id.btn_web);
        mBtn_no2=(Button)findViewById(R.id.btn_no2);
        mBtn_light=(Button)findViewById(R.id.btn_light);
        mBtn_no4=(Button)findViewById(R.id.btn_no4);
        setListeners();
    }
    private void setListeners(){
        onClick onClick=new onClick();
        mBtn_no1.setOnClickListener(onClick);
        mBtn_web.setOnClickListener(onClick);
        mBtn_no2.setOnClickListener(onClick);
        mBtn_light.setOnClickListener(onClick);
        mBtn_no4.setOnClickListener(onClick);

    }

    private class onClick implements View.OnClickListener{//实现抽象类的方法

        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId()) {
                case R.id.btn_no1:
                    //跳转到no1的演示界面
                    intent = new Intent(MainActivity.this, no1Activity.class);
                    break;
                case R.id.btn_web:
                    //跳转到no1的演示界面
                    intent = new Intent(MainActivity.this, WebViewActivity.class);
                    break;
                case R.id.btn_no2:
                    intent = new Intent(MainActivity.this, no2Activity.class);
                    break;
                case R.id.btn_light:
                    intent = new Intent(MainActivity.this, no3LightActivity.class);
                    break;
                case R.id.btn_no4:
                    intent = new Intent(MainActivity.this, no4Activity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
