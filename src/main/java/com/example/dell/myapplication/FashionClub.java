package com.example.dell.myapplication;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class FashionClub extends Activity {
    private GridView gv;
    private Animator mCurrentAnimator;
    private int mShortAnimationDuration;
    private int j=0;

    private GestureDetector detector;
    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPTE_THRESHOLD_VELOCITY = 200;

    private int thumb[] = {R.drawable.fashion1, R.drawable.fashion2, R.drawable.fashion3, R.drawable.fasion4,
            R.drawable.fashion5, R.drawable.fashion6,R.drawable.fashion7, R.drawable.fashion8, R.drawable.fashion9,
            R.drawable.fashion10, R.drawable.fashion11, R.drawable.fashion12 };

    private ImageView expandedImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fashionclub);

        detector= new GestureDetector(this, new SwipeGestureDetector());

        gv = (GridView) findViewById(R.id.gridview);
        gv.setAdapter(new ImageAdapter(this));
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int pos, long id) {
                j = pos;
                zoomImageFromThumb(v, thumb[pos]);

            }
        });
        mShortAnimationDuration = getResources().getInteger(android.R.integer.config_shortAnimTime);

    }
    class ImageAdapter extends BaseAdapter {
        private LayoutInflater layoutInflater;

        public ImageAdapter(FashionClub activity){
            layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE );
        }

        @Override
        public int getCount() {
            return thumb.length;
        }

        @Override
        public Object getItem(int pos) {
            return pos;
        }

        @Override
        public long getItemId(int pos) {
            return pos;
        }

        @Override
        public View getView(int pos, View convertView, ViewGroup parent) {
            View listItem= convertView;
            int p= pos;

            if(listItem == null){
                listItem = layoutInflater.inflate(R.layout.single_grid_item, null);
            }
            ImageView iv = (ImageView) listItem.findViewById(R.id.thumb);
            iv.setBackgroundResource(thumb[p]);

            return listItem;
        }
    }
    private void zoomImageFromThumb(final View thumbView, int imageResId){
        if(mCurrentAnimator != null){
            mCurrentAnimator.cancel();
        }

        expandedImageView = (ImageView) findViewById(R.id.expanded_image);
        expandedImageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(detector.onTouchEvent(event)) {
                    return true;
                } else {
                    return false;
                }
            }
        });

        expandedImageView.setImageResource(imageResId);
        final Rect startBounds = new Rect();
        final Rect finalBounds = new Rect();
        final Point globalOffset = new Point();

        thumbView.getGlobalVisibleRect(startBounds);
        findViewById(R.id.photo_container).getGlobalVisibleRect(finalBounds, globalOffset);

        startBounds.offset(-globalOffset.x, -globalOffset.y);
        finalBounds.offset(-globalOffset.x, -globalOffset.y);

        final float startScale;
        if((float) finalBounds.width() / finalBounds.height() > (float) startBounds.width() / startBounds.height() ){
            startScale = (float) startBounds.height() / startBounds.height();
            float startWidth = startScale * finalBounds.width();
            float deltaWidth= (startWidth - startBounds.width()) /2;
            startBounds.left -= deltaWidth;
            startBounds.right += deltaWidth;

        } else {
            startScale = (float) startBounds.width() / startBounds.width();
            float startHeight = startScale * finalBounds.width();
            float deltaHeight= (startHeight - startBounds.height()) /2;
            startBounds.top -= deltaHeight;
            startBounds.bottom += deltaHeight;

        }
        thumbView.setAlpha(0f);
        expandedImageView.setVisibility(View.VISIBLE);
        expandedImageView.setPivotX(0f);
        expandedImageView.setPivotY(0f);

        AnimatorSet set = new AnimatorSet();
        set.play(ObjectAnimator.ofFloat(expandedImageView, View.X, startBounds.left, finalBounds.left))
                .with(ObjectAnimator.ofFloat(expandedImageView, View.Y, startBounds.top, finalBounds.top))
                .with(ObjectAnimator.ofFloat(expandedImageView, View.SCALE_X, startScale, 1f))
                .with(ObjectAnimator.ofFloat(expandedImageView, View.SCALE_Y, startScale, 1f));

        set.setDuration(mShortAnimationDuration);
        set.setInterpolator(new DecelerateInterpolator());
        set.addListener(new AnimatorListenerAdapter() {

            @Override
            public void onAnimationEnd(Animator animation) {
                mCurrentAnimator = null;
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                mCurrentAnimator = null;
            }
        });
        set.start();
        mCurrentAnimator = set;

        final float startScaleFinal = startScale;
        expandedImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mCurrentAnimator != null){
                    mCurrentAnimator.cancel();
                }
                AnimatorSet set = new AnimatorSet();
                set.play(ObjectAnimator.ofFloat(expandedImageView, View.X, startBounds.left))
                        .with(ObjectAnimator.ofFloat(expandedImageView, View.Y, startBounds.top))
                        .with(ObjectAnimator.ofFloat(expandedImageView, View.SCALE_X, startScaleFinal))
                        .with(ObjectAnimator.ofFloat(expandedImageView, View.SCALE_Y, startScaleFinal));
                set.setDuration(mShortAnimationDuration);
                set.setInterpolator(new DecelerateInterpolator());
                set.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        thumbView.setAlpha(1f);
                        expandedImageView.setVisibility(View.GONE);
                        mCurrentAnimator = null;
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                        thumbView.setAlpha(1f);
                        expandedImageView.setVisibility(View.GONE);
                        mCurrentAnimator = null;

                    }
                });
                set.start();
                mCurrentAnimator = set;

            }
        });

    }

    private class SwipeGestureDetector extends GestureDetector.SimpleOnGestureListener{
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            try {
                if(e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX)> SWIPTE_THRESHOLD_VELOCITY){
                    if(thumb.length > j){
                        j++;
                        if(j < thumb.length){
                            expandedImageView.setImageResource(thumb[j]);
                            return true;
                        } else {
                            j = 0;
                            expandedImageView.setImageResource((thumb[j]));
                            return true;

                        }
                    }

                } else if(e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX)> SWIPTE_THRESHOLD_VELOCITY ) {
                    if(j > 0){
                        j--;
                        expandedImageView.setImageResource(thumb[j]);
                        return true;
                    } else {
                        j= thumb.length - 1;
                        expandedImageView.setImageResource(thumb[j]);
                        return true;
                    }
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            return false;
        }
    }
}
