package com.example.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

public class Communicate extends AppCompatActivity {
    private RecyclerView recyclerView1;
    private RecyclerView recyclerView2;
    private TopicAdapter topicAdapter;
    private Banner banner;
    private GlideImageLoader glideImageLoader;
    private List<Integer> imagePath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.communicate);
        List<TopicData> topicDataList=new ArrayList<>();
        List<TopicData> topicDataList1=new ArrayList<>();
        topicDataList.add(new TopicData("交友互粉专区",R.drawable.ra));
        topicDataList.add(new TopicData("健康饮食后的我",R.drawable.rb));
        topicDataList.add(new TopicData("规范饮食记录区",R.drawable.rc));
        topicDataList.add(new TopicData("养生饮品讨论区",R.drawable.rd));
        topicDataList.add(new TopicData("分享食谱专区",R.drawable.re));
        topicDataList1.add(new TopicData("我的每日健康生活",R.drawable.rf));
        topicDataList1.add(new TopicData("优食结伴区",R.drawable.rg));
        topicDataList1.add(new TopicData("每日饮食互动答疑",R.drawable.rh));
        topicDataList1.add(new TopicData("营养食谱做法区",R.drawable.ri));
        topicDataList1.add(new TopicData("晒三餐元气美食区",R.drawable.rj));
        setTopicRecycler(topicDataList);
        setTopicRecycler2(topicDataList1);
        initDate();
        initView();
        //回首页
        ImageView shouye=findViewById(R.id.imageView9);
        TextView shouye1=findViewById(R.id.textView6);
        shouye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Communicate.this,MainActivity.class);
                startActivity(intent);
            }
        });
        shouye1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Communicate.this,MainActivity.class);
                startActivity(intent1);
            }
        });
        //回饮食咨询
        ImageView question=findViewById(R.id.imageView12);
        TextView  question1=findViewById(R.id.textView8);
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Communicate.this,Qustion.class);
                startActivity(intent2);
            }
        });
        question1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(Communicate.this,Qustion.class);
                startActivity(intent3);
            }
        });
        //回个人中心
        ImageView personcenter=findViewById(R.id.imageView11);
        TextView personcenter1=findViewById(R.id.textView7);
        personcenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Communicate.this,Person.class);
                startActivity(intent);

            }
        });
        personcenter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Communicate.this,Person.class);
                startActivity(intent1);
            }
        });
        //回设置
        ImageView setup=findViewById(R.id.imageView10);
        TextView setup1=findViewById(R.id.textView10);
        setup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(Communicate.this,Setup.class);
                startActivity(intent4);
            }
        });
        setup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(Communicate.this,Setup.class);
                startActivity(intent5);
            }
        });
    }
    private void initDate(){
        imagePath=new ArrayList<>();
        imagePath.add(R.drawable.dd);
        imagePath.add(R.drawable.ee);
        imagePath.add(R.drawable.hh);
        /*imageTitle.add("打发的撒打算的阿萨德阿达");
        imageTitle.add("打发的撒打算的阿萨德阿达");
        imageTitle.add("打发的撒打算的阿萨德阿达");*/
    }
    private void initView(){
         glideImageLoader=new GlideImageLoader();
         banner=findViewById(R.id.banner);
         banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
         banner.setImageLoader(glideImageLoader);
         //banner.setBannerTitles(imageTitle);
         banner.setDelayTime(3000);
         banner.isAutoPlay(true);
         banner.setImages(imagePath);
         banner.start();
    }
    private  void  setTopicRecycler(List<TopicData> topicDataList){
        recyclerView1=findViewById(R.id.recyclerview1);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView1.setLayoutManager(layoutManager);
        topicAdapter=new TopicAdapter(this,topicDataList);
        recyclerView1.setAdapter(topicAdapter);
    }
    private  void  setTopicRecycler2(List<TopicData> topicDataList){
        recyclerView2=findViewById(R.id.recyclerview2);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView2.setLayoutManager(layoutManager);
        topicAdapter=new TopicAdapter(this,topicDataList);
        recyclerView2.setAdapter(topicAdapter);
    }
}
