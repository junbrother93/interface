package com.example.wnsgu.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Activity2 extends Activity implements View.OnClickListener {

    public static Activity AActivity;
    public static Button EduBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        AActivity = Activity2.this;

        Button CertiBtn = (Button)findViewById(R.id.CertiBtn);

        //
        Intent intent = getIntent();
        String local = intent.getStringExtra("local");
        EduBtn = (Button)findViewById(R.id.EduBtn);
        Log.v("local: ", "local" + local);
        if(local == null);
        else EduBtn.setText(local);
        //

        CertiBtn.setOnClickListener(this);

        //listview, footer, header 참조 회득
        ListView listview = (ListView)findViewById(R.id.listview1);
        final View footer = getLayoutInflater().inflate(R.layout.navigation_bar, null, false);
        View header = getLayoutInflater().inflate(R.layout.head_bar,null,false);

        listview.addHeaderView(header);

        ListViewAdapter adapter;

        adapter = new ListViewAdapter();
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher),"제목1","설명");
        adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher),"제목2","설명");
        adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher),"제목3","설명");
        adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher),"제목4","설명");
        adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher),"제목5","설명");
        adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher),"제목6","설명");
        adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher),"제목7","설명");
        adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher),"제목8","설명");
        adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher),"제목9","설명");
        adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher),"제목10","설명");
        adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher),"제목11","설명");
        adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher),"제목12","설명");

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

    public void onClick(View view) {
        final Intent ActPop = new Intent(this, PopupActivity_Local.class);
        final Intent Act3 = new Intent(this, Activity3.class);
        //final Intent Act2 = new Intent(this, Activity2.class);
        switch (view.getId()) {
            case R.id.CertiBtn:
                finish();
                startActivity(Act3);
                break;

            case R.id.EduBtn:
                startActivity(ActPop);
                break;
        }
    }
}

