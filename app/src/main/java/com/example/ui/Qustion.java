package com.example.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Qustion extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qustion);
        //回首页
        ImageView shouye=findViewById(R.id.imageView9);
        TextView shouye1=findViewById(R.id.textView6);
        shouye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Qustion.this,MainActivity.class);
                startActivity(intent);
            }
        });
        shouye1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Qustion.this,MainActivity.class);
                startActivity(intent1);
            }
        });
        //回个人中心
        ImageView personcenter=findViewById(R.id.imageView11);
        TextView personcenter1=findViewById(R.id.textView7);
        personcenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Qustion.this,Person.class);
                startActivity(intent);

            }
        });
        personcenter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Qustion.this,Person.class);
                startActivity(intent1);
            }
        });
        //回社区交流
        ImageView  communicate=findViewById(R.id.imageView13);
        TextView   communicate1=findViewById(R.id.textView9);
        communicate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(Qustion.this,Communicate.class);
                startActivity(intent6);
            }
        });
        communicate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(Qustion.this,Communicate.class);
                startActivity(intent7);
            }
        });
        //回设置
        ImageView setup=findViewById(R.id.imageView10);
        TextView setup1=findViewById(R.id.textView10);
        setup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(Qustion.this,Setup.class);
                startActivity(intent4);
            }
        });
        setup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(Qustion.this,Setup.class);
                startActivity(intent5);
            }
        });

    }
}

