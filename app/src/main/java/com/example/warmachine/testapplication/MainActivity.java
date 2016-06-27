package com.example.warmachine.testapplication;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TableLayout;

import com.example.warmachine.testapplication.adapter.MyFragmentPagerAdapter;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;

public class MainActivity extends FragmentActivity {

    private MyFragmentPagerAdapter myFragmentPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Fresco.initialize(getApplicationContext());
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),this);
        viewPager.setAdapter(myFragmentPagerAdapter);
        tabLayout = (TabLayout) findViewById(R.id.mytab);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);




//        Uri uri = Uri.parse("http://img1.gtimg.com/news/pics/hv1/147/142/2089/135873582.jpg");
//        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) findViewById(R.id.myfirstimage);
//        simpleDraweeView.setImageURI(uri);




//        Application app = getApplication();
//        Context mContext = getApplicationContext();
//        Resources resources = app.getResources();
//        resources.getLayout(R.layout.activity_main);
//        String mString = mContext.getString(R.string.myString);
//        final String tag = "MainActivity";
//        if(app.equals(mContext))
//        {
//            Log.i("MainActivity","true");
//            Log.i("MainActivity",mString);
//        }else{
//            Log.i("MainActivity","false");
//        }

//        Observer<String> observer = new Observer<String>() {
//            @Override
//            public void onCompleted() {
//                Log.i(tag, "Completed!");
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                Log.i(tag, "Error!");
//            }
//
//            @Override
//            public void onNext(String s) {
//                Log.i(tag, "Item: " + s);
//            }
//        };
//
//
//
//        Observable observable = Observable.create(new Observable.OnSubscribe<String>(){
//            @Override
//            public void call(Subscriber<? super String> subscriber) {
//                subscriber.onNext("Hello");
//                subscriber.onNext("Hi");
//                subscriber.onNext("Aloha");
//                subscriber.onCompleted();
//            }
//        });
//
//        observable.subscribe(observer);
    }
}
