package com.example.wnsgu.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class Activity3 extends Activity implements View.OnClickListener {
ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);


        Button EduBtn = (Button)findViewById(R.id.EduBtn);
        EduBtn.setOnClickListener(this);


        //listview, footer, header 참조 회득
        ListView listview = (ListView)findViewById(R.id.listview1);
        final View footer = getLayoutInflater().inflate(R.layout.navigation_bar, null, false);
        View header = getLayoutInflater().inflate(R.layout.head_bar,null,false);

        listview.addHeaderView(header);

        ListViewAdapter adapter;

        adapter = new ListViewAdapter();
        listview.setAdapter(adapter);



            adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sejong_logo), "자격증1", "세종대학교");
            adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher), "자격증2", "설명");
            adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher), "자격증3", "설명");
            adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher), "자격증4", "설명");
            adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher), "자격증5", "설명");
            adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher), "자격증6", "설명");
            adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher), "자격증7", "설명");
            adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher), "자격증8", "설명");
            adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher), "자격증9", "설명");
            adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher), "자격증10", "설명");
            adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher), "자격증11", "설명");
            adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher), "자격증12", "설명");


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
        return true;
    }
    public void onClick(View v) {
        final Intent EduBtn = new Intent(this, PopupActivity_Local.class);
        final Intent Act2 = new Intent(this, Activity2.class);
        switch (v.getId()) {
            case R.id.EduBtn:
                startActivity(EduBtn);
                break;
        }
    }
}

