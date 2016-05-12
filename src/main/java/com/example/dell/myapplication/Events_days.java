package com.example.dell.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;


public class Events_days extends Activity {
    ViewPager viewpager;
    CustomSwipeAdapter adapter;
    //ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fashion_gallery);
      //  imageView= (ImageView) findViewById(R.id.phgallery);
        viewpager= (ViewPager) findViewById(R.id.phgallery);
         adapter = new CustomSwipeAdapter(this);
         viewpager.setAdapter(adapter);


    }

}
