package com.example.amazonclone.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.amazonclone.API.ModelClasses.GroceryAdapter;

import com.example.amazonclone.PojoClasses.ResponseGrocery;

import com.example.amazonclone.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;

public class GroceryActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private GroceryAdapter groceryAdapter;
    private List<ResponseGrocery> responseGroceryList;
    private Runnable fetchResponseRunnableGrocery = new Runnable() {
        @Override
        public void run() {
            fetchResponceFromJsonGrocery();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery);
        initView();
        fetchResponceFromJsonGrocery();
    }

    private void initView() {
        recyclerView = findViewById(R.id.groceryRecyclerView);
        startbackgroundThreads();
    }

    private void startbackgroundThreads() {
        Thread thread = new Thread(fetchResponseRunnableGrocery);
        thread.start();
    }


    private void fetchResponceFromJsonGrocery() {
        try {
            InputStream inputStream = getAssets().open("grocery.json");
            int data = inputStream.read();
            StringBuffer stringBuffer = new StringBuffer();
            while (data != -1) {
                char ch = (char) data;
                stringBuffer.append(ch);
                data = inputStream.read();
            }
            builDataFromJsonMobile(stringBuffer.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void builDataFromJsonMobile(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<List<ResponseGrocery>>() {
        }.getType();
        responseGroceryList = gson.fromJson(json, type);
        setRecyclerAdapter();
        groceryAdapter.notifyDataSetChanged();
    }

    private void setRecyclerAdapter() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                GroceryAdapter groceryAdapter = new GroceryAdapter(responseGroceryList);
                LinearLayoutManager layoutManager = new LinearLayoutManager(getBaseContext());
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(groceryAdapter);
            }
        });
    }
}