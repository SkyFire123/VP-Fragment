package com.example.warmachine.testapplication.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.warmachine.testapplication.R;

/**
 * Created by WarMachine on 2016/6/28.
 */
public class MySecondFragment extends Fragment{
    public MySecondFragment() {
        super();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_layout,container,false);
        initUI(view);
        return view;
    }

    private void initUI(View view)
    {
        final TextView tx = (TextView) view.findViewById(R.id.num);
        Button button1 = (Button) view.findViewById(R.id.start);
        Button button2 = (Button) view.findViewById(R.id.stop);


        //handle to process UI
        final Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                int i = msg.arg1;
                tx.setText(i);
            }
        };

        final Runnable r  = new Runnable() {
            int i = 0;
            @Override
            public void run() {
                i+=10;
                Message message = handler.obtainMessage();
                message.arg1 = i;
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                handler.sendMessage(message);

            }
        };

        //start
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.post(r);
            }
        });






    }
}
