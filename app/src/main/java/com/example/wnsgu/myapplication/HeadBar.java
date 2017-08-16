package com.example.wnsgu.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by Junhyeong on 2017-08-16.
 */

public class HeadBar extends LinearLayout {
    Context context;

    public HeadBar(Context context, AttributeSet attrs){
        super(context, attrs);
        this.context = context;

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.head_bar, this, true);
    }
}

