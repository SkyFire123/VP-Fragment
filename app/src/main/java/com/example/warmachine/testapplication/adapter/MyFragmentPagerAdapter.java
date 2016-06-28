package com.example.warmachine.testapplication.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.Log;

import com.example.warmachine.testapplication.R;
import com.example.warmachine.testapplication.fragment.MyFirstFragment;
import com.example.warmachine.testapplication.fragment.MySecondFragment;

/**
 * Created by WarMachine on 2016/6/27.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter{


    final int PAGE_COUNT = 3;
    private String tabTitles[] = {"tab1","tab2","tab3"};
    private Context context;
    private int[] imageResId={
      R.drawable.pic_1,R.drawable.pic_2,R.drawable.pic_3
    };

    public MyFragmentPagerAdapter(FragmentManager fragmentManager,Context context){
        super(fragmentManager);
        this.context = context;

    }

    @Override
    public Fragment getItem(int position) {
        Log.i("MyFragment",Integer.toString(position));
        switch (position) {
            case 0:
                return MyFirstFragment.newInstance(1);
            case 1:
                return new MySecondFragment();
            case 2:
                return new MySecondFragment();
            default:
                return MyFirstFragment.newInstance(0);
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Drawable image = context.getDrawable(imageResId[position]);
        image.setBounds(0,0,image.getIntrinsicWidth(),image.getIntrinsicHeight());

        SpannableString sb = new SpannableString("  "+tabTitles[position]);
        ImageSpan imageSpan = new ImageSpan(image,ImageSpan.ALIGN_BOTTOM);
        sb.setSpan(imageSpan,0,1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return sb;
    }
}
