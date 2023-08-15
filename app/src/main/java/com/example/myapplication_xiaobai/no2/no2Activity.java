package com.example.myapplication_xiaobai.no2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication_xiaobai.R;

public class no2Activity extends AppCompatActivity {
    private Button mBtn_no2_1;
    private Button mBtn_no2_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//入口
        setContentView(R.layout.activity_no2);
        mBtn_no2_1=(Button)findViewById(R.id.btn_no2_1);//找到控件
        mBtn_no2_2=(Button)findViewById(R.id.btn_no2_2);
        setListeners();
    }
    private void setListeners(){
        onClick onClick=new onClick();
        mBtn_no2_1.setOnClickListener(onClick);
        mBtn_no2_2.setOnClickListener(onClick);

    }

    class onClick implements View.OnClickListener{//实现抽象类的方法

        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId()) {
                case R.id.btn_no2_1:
                    //跳转到no1的演示界面
                    intent = new Intent(no2Activity.this, no2_1Activity.class);
                    break;
                case R.id.btn_no2_2:
                    intent = new Intent(no2Activity.this, no2_2Activity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
