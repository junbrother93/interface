package com.example.wnsgu.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by yeonjin on 2017-08-09.
 */

public class ImageClick extends AppCompatActivity {
    int num;
    ImageView iv;
   @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.education_click);
        iv = (ImageView) findViewById(R.id.STAR);
        num=0;
       iv.setOnClickListener(new MyListener());


    }

    class MyListener implements View.OnClickListener
    {

       @Override
        public void onClick(View v)
        {
            if(num==0)
            {
                iv.setImageResource(R.drawable.star2);
                num++;
            }
            else
            {
                iv.setImageResource(R.drawable.star1);
                num=0;
            }

        }


    }

}
