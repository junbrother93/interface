package com.example.wnsgu.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by Junhyeong on 2017-08-22.
 */

public class PopupActivity_Local extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_popup);
    }

    public void onClick(View view) {
        Button localId = (Button) findViewById(R.id.local1);
        String local;
        switch (view.getId())
        {
            case R.id.local1:
                localId = (Button) findViewById(R.id.local1);
                break;
            case R.id.local2:
                localId = (Button) findViewById(R.id.local2);
                break;
            case R.id.local3:
                localId = (Button) findViewById(R.id.local3);
                break;
            case R.id.local4:
                localId = (Button) findViewById(R.id.local4);
                break;
            case R.id.local5:
                localId = (Button) findViewById(R.id.local5);
                break;
            case R.id.local6:
                localId = (Button) findViewById(R.id.local6);
                break;
            case R.id.local7:
                localId = (Button) findViewById(R.id.local7);
                break;
            case R.id.local8:
                localId = (Button) findViewById(R.id.local8);
                break;
            case R.id.local9:
                localId = (Button) findViewById(R.id.local9);
                break;
            case R.id.local10:
                localId = (Button) findViewById(R.id.local10);
                break;
            case R.id.local11:
                localId = (Button) findViewById(R.id.local11);
                break;
            case R.id.local12:
                localId = (Button) findViewById(R.id.local12);
                break;
            case R.id.local13:
                localId = (Button) findViewById(R.id.local13);
                break;
            case R.id.local14:
                localId = (Button) findViewById(R.id.local14);
                break;
            case R.id.local15:
                localId = (Button) findViewById(R.id.local15);
                break;
            case R.id.local16:
                localId = (Button) findViewById(R.id.local16);
                break;
            case R.id.local17:
                localId = (Button) findViewById(R.id.local17);
                break;
            case R.id.local18:
                localId = (Button) findViewById(R.id.local18);
                break;
            case R.id.local19:
                localId = (Button) findViewById(R.id.local19);
                break;
            case R.id.local20:
                localId = (Button) findViewById(R.id.local20);
                break;
            case R.id.local21:
                localId = (Button) findViewById(R.id.local21);
                break;
            case R.id.local22:
                localId = (Button) findViewById(R.id.local22);
                break;
            case R.id.local23:
                localId = (Button) findViewById(R.id.local23);
                break;
            case R.id.local24:
                localId = (Button) findViewById(R.id.local24);
                break;
            case R.id.local25:
                localId = (Button) findViewById(R.id.local25);
                break;
        }
        Intent intent = new Intent(this, Activity2.class);

        local = localId.getText().toString();
        //intent.putExtra("local", local);
        Button Popup = (Button) Activity2.EduBtn;
        Popup.setText(local);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        //Activity2 A2 = (Activity2) Activity2.AActivity;
        //A2.finish();
        //startActivity(intent);
        // 얘를 startActivity 시키지 말고 켜져있는 액티비티를 다시 불러오는... 그런식으로 해야할듯
        finish();
    }
}
