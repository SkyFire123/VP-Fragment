package com.example.warmachine.testapplication.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.warmachine.testapplication.R;

/**
 * Created by WarMachine on 2016/6/27.
 */
public class MyFirstFragment extends Fragment{
    public static final String ARG_PAGE = "ARG_PAGE";
    public static final String Tag = "MyFramgent";
    private int mPage;

    public static MyFirstFragment newInstance(int page){
        Log.i(Tag,"初始化MyFragment");
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE,page);
        MyFirstFragment myFirstFragment = new MyFirstFragment();
        myFirstFragment.setArguments(args);
        return myFirstFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
        Log.i(Tag,"MyFirstFragment OnCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(Tag,"MyFirstFragment OnCreateView");
        View view = inflater.inflate(R.layout.first_fragment,container,false);
        TextView textView = (TextView) view.findViewById(R.id.mytextview);
        textView.setText("Fragment "+mPage);
        return view;
    }
}
