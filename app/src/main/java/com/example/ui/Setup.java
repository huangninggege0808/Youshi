package com.example.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Setup extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setup);
        //回首页
        ImageView shouye=findViewById(R.id.imageView9);
        TextView shouye1=findViewById(R.id.textView6);
        shouye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Setup.this,MainActivity.class);
                startActivity(intent);
            }
        });
        shouye1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Setup.this,MainActivity.class);
                startActivity(intent1);
            }
        });
        //回饮食咨询
        ImageView question=findViewById(R.id.imageView12);
        TextView  question1=findViewById(R.id.textView8);
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Setup.this,Qustion.class);
                startActivity(intent2);
            }
        });
        question1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(Setup.this,Qustion.class);
                startActivity(intent3);
            }
        });
        //回社区交流
        ImageView  communicate=findViewById(R.id.imageView13);
        TextView   communicate1=findViewById(R.id.textView9);
        communicate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(Setup.this,Communicate.class);
                startActivity(intent6);
            }
        });
        communicate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(Setup.this,Communicate.class);
                startActivity(intent7);
            }
        });
        //回个人中心
        ImageView personcenter=findViewById(R.id.imageView11);
        TextView personcenter1=findViewById(R.id.textView7);
        personcenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Setup.this,Person.class);
                startActivity(intent);

            }
        });
        personcenter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Setup.this,Person.class);
                startActivity(intent1);
            }
        });
    }
}
