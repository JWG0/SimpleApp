package com.example.myapplication_xiaobai.no2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication_xiaobai.R;

public class no2_2Activity extends AppCompatActivity {
    private Button mBtn_no2_2_answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no2_2);
        mBtn_no2_2_answer=(Button)findViewById(R.id.btn_no2_2_answer);
        setListeners();
    }
    private void setListeners(){
        onClick onClick=new onClick();
        mBtn_no2_2_answer.setOnClickListener(onClick);
    }

    private class onClick implements View.OnClickListener{//实现抽象类的方法

        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId()) {
                case R.id.btn_no2_2_answer:
                    //跳转到no1的演示界面
                    intent = new Intent(no2_2Activity.this, no2_2_answer_Activity.class);
                    break;

            }
            startActivity(intent);
        }
    }
}
