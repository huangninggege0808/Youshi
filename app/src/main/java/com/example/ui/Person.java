package com.example.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Person extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_person);
        //回首页
        ImageView shouye=findViewById(R.id.imageView9);
        TextView shouye1=findViewById(R.id.textView6);
        shouye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Person.this,MainActivity.class);
                startActivity(intent);
            }
        });
        shouye1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Person.this,MainActivity.class);
                startActivity(intent1);
            }
        });
        //回饮食咨询
        ImageView question=findViewById(R.id.imageView12);
        TextView question1=findViewById(R.id.textView8);
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Person.this,Qustion.class);
                startActivity(intent2);
            }
        });
        question1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(Person.this,Qustion.class);
                startActivity(intent3);
            }
        });
        //回社区交流
        ImageView  communicate=findViewById(R.id.imageView13);
        TextView   communicate1=findViewById(R.id.textView9);
        communicate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(Person.this,Communicate.class);
                startActivity(intent6);
            }
        });
        communicate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(Person.this,Communicate.class);
                startActivity(intent7);
            }
        });
        //回设置
        ImageView setup=findViewById(R.id.imageView10);
        TextView setup1=findViewById(R.id.textView10);
        setup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(Person.this,Setup.class);
                startActivity(intent4);
            }
        });
        setup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(Person.this,Setup.class);
                startActivity(intent5);
            }
        });

    }
}