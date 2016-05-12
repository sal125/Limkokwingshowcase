package com.example.dell.myapplication;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomSwipeAdapter extends PagerAdapter {


    private int[] image_resources = {R.drawable.event1,R.drawable.event2, R.drawable.event3, R.drawable.event4,
            R.drawable.event5, R.drawable.event6, R.drawable.event7};
    private String[] name_resources = {"Star Education Fair \n11-12 June 2016", "Cultural Festival \n20 May 2016", "Electric Run Malaysia \n7 May 2016",
            "Bollywood Hungama \n29 April 2016", "Monophone \n16 April 2016",  "Integrated Exhibition \n15-17 April 2016", "White Noise \n14 April 2016"};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public CustomSwipeAdapter(Context ctx){
        this.ctx = ctx;
    }


    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.swipe_layout, container, false);
        ImageView imageView= (ImageView) item_view.findViewById(R.id.image_view);
        TextView textView= (TextView)item_view.findViewById(R.id.image_count);
        imageView.setImageResource(image_resources[position]);
        textView.setText(name_resources[position]);
        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
