package com.example.amazonclone.Activities;

import android.os.Bundle;

import com.example.amazonclone.API.ModelClasses.MobileAdapter;
import com.example.amazonclone.PojoClasses.ResponseMobile;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import com.example.amazonclone.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;

public class MobileActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MobileAdapter mobileAdapter;
    private List<ResponseMobile> responseMobilist;
    private Runnable fetchResponseRunnableMobile = new Runnable() {
        @Override
        public void run() {
            fetchResponceFromJsonMobile();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        initView();
        fetchResponceFromJsonMobile();
    }
    private void initView() {
        recyclerView=findViewById(R.id.mobileRecyclerView);
        startbackgroundThreads();
    }

    private void startbackgroundThreads() {
        Thread thread = new Thread(fetchResponseRunnableMobile);
        thread.start();
    }


    private void fetchResponceFromJsonMobile() {
        try {
            InputStream inputStream = getAssets().open("mobile.json");
            int data = inputStream.read();
            StringBuffer stringBuffer = new StringBuffer();
            while (data != -1){
                char ch = (char) data;
                stringBuffer.append(ch);
                data = inputStream.read();
            }
            builDataFromJsonMobile(stringBuffer.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void builDataFromJsonMobile(String json){
        Gson gson = new Gson();
        Type type = new TypeToken<List<ResponseMobile>>() {}.getType();
        responseMobilist = gson.fromJson(json, type);
        setRecyclerAdapter();
        mobileAdapter.notifyDataSetChanged();
    }


    private void setRecyclerAdapter() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                MobileAdapter mobileAdapter = new MobileAdapter(responseMobilist);
                LinearLayoutManager layoutManager = new LinearLayoutManager(getBaseContext());
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(mobileAdapter);
            }
        });
    }
}