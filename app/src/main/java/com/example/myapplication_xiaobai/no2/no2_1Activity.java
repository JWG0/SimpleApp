package com.example.myapplication_xiaobai.no2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication_xiaobai.R;

public class no2_1Activity extends AppCompatActivity {
    private Button mBtn_no2_1_answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no2_1);
        mBtn_no2_1_answer=(Button)findViewById(R.id.btn_no2_1_answer);
        setListeners();
    }
    private void setListeners(){
        no2_1Activity.onClick onClick=new no2_1Activity.onClick();
        mBtn_no2_1_answer.setOnClickListener(onClick);
    }

    private class onClick implements View.OnClickListener{//实现抽象类的方法

        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId()) {
                case R.id.btn_no2_1_answer:
                    //跳转到no1的演示界面
                    intent = new Intent(no2_1Activity.this, no2_1_answer_Activity.class);
                    break;

            }
            startActivity(intent);
        }
    }
}
