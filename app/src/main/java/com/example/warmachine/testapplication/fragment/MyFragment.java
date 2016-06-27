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
public class MyFragment extends Fragment{
    public static final String ARG_PAGE = "ARG_PAGE";
    public static final String Tag = "MyFramgent";
    private int mPage;

    public static MyFragment newInstance(int page){
        Log.i(Tag,"初始化MyFragment");
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE,page);
        MyFragment myFragment = new MyFragment();
        myFragment.setArguments(args);
        return myFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
        Log.i(Tag,"MyFragment OnCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(Tag,"MyFragment OnCreateView");
        View view = inflater.inflate(R.layout.fragment,container,false);
        TextView textView = (TextView) view.findViewById(R.id.mytextview);
        textView.setText("Fragment "+mPage);
        return view;
    }
}
