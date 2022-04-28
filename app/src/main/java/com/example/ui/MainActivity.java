package com.example.ui;

import static com.example.ui.RoundRectImageView.getRoundBitmapByShader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
        RecyclerView recyclerView;
        RecentsAdapter recentsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<RecentsData> recentsDataList=new ArrayList<>();
        recentsDataList.add(new RecentsData("手把手助您上手",R.drawable.zn,"使用指南"));
        recentsDataList.add(new RecentsData("手把手助您上手",R.drawable.zn,"使用指南"));
        recentsDataList.add(new RecentsData("手把手助您上手",R.drawable.zn,"使用指南"));
        recentsDataList.add(new RecentsData("手把手助您上手",R.drawable.zn,"使用指南"));
        recentsDataList.add(new RecentsData("手把手助您上手",R.drawable.zn,"使用指南"));
        recentsDataList.add(new RecentsData("手把手助您上手",R.drawable.zn,"使用指南"));
        setRecentRecycler(recentsDataList);
        //回个人中心
        ImageView personcenter=findViewById(R.id.imageView11);
        TextView  personcenter1=findViewById(R.id.textView7);
        personcenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Person.class);
                startActivity(intent);

            }
        });
        personcenter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,Person.class);
                startActivity(intent1);
            }
        });
        //回饮食咨询
        ImageView question=findViewById(R.id.imageView12);
        TextView  question1=findViewById(R.id.textView8);
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,Qustion.class);
                startActivity(intent2);
            }
        });
        question1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(MainActivity.this,Qustion.class);
                startActivity(intent3);
            }
        });
        //回社区交流
        ImageView  communicate=findViewById(R.id.imageView13);
        TextView   communicate1=findViewById(R.id.textView9);
        communicate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(MainActivity.this,Communicate.class);
                startActivity(intent6);
            }
        });
        communicate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(MainActivity.this,Communicate.class);
                startActivity(intent7);
            }
        });
        //回设置
        ImageView setup=findViewById(R.id.imageView10);
        TextView setup1=findViewById(R.id.textView10);
        setup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(MainActivity.this,Setup.class);
                startActivity(intent4);
            }
        });
        setup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(MainActivity.this,Setup.class);
                startActivity(intent5);
            }
        });

    }
    private  void  setRecentRecycler(List<RecentsData> recentsDataList){
        recyclerView=findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recentsAdapter=new RecentsAdapter(this,recentsDataList);
        recyclerView.setAdapter(recentsAdapter);
    }


}