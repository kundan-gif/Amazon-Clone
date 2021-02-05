package com.example.amazonclone.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.amazonclone.ClickListener;
import com.example.amazonclone.PojoClasses.ResponseFashion;
import com.example.amazonclone.R;
import com.example.amazonclone.ViewHolderClass.FashionAdapter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;

public class FashionActivity extends AppCompatActivity implements ClickListener {
    private RecyclerView recyclerView;
    private FashionAdapter fashionAdapter;
    private List<ResponseFashion> responseModelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion);
        initViews();
        fetchResposeFromJsonAssets();
    }
    private void initViews() {
        recyclerView=findViewById(R.id.recyclerViewFashion);
    }
    private void fetchResposeFromJsonAssets() {
        try {
            InputStream inputStream=getAssets().open("fashion.json");
            int data=inputStream.read();
            StringBuffer stringBuffer=new StringBuffer();
            while (data!=-1){
                char ch= (char) data;
                stringBuffer.append(ch);
                data=inputStream.read();
            }
            buildPojoFromJson(stringBuffer.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void buildPojoFromJson(String json) {
        Gson gson=new Gson();
        Type type=new TypeToken<List<ResponseFashion>>(){}.getType();
        responseModelList=gson.fromJson(json,type);
        setRecyclerAdapter();
        fashionAdapter.notifyDataSetChanged();
    }
    private void setRecyclerAdapter() {
        fashionAdapter=new FashionAdapter(responseModelList,this);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(fashionAdapter);
    }

    @Override
    public void onItemClicked(ResponseFashion model, int position) {

    }
}