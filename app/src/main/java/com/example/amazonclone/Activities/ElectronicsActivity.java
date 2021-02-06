package com.example.amazonclone.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.amazonclone.ClickListener;
import com.example.amazonclone.PojoClasses.ResponseElectronics;
import com.example.amazonclone.PojoClasses.ResponseFashion;
import com.example.amazonclone.R;
import com.example.amazonclone.ViewHolderClass.ElectronicsAdapter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;

public class ElectronicsActivity extends AppCompatActivity implements ClickListener {
    private RecyclerView recyclerView;
    private List<ResponseElectronics> responseModelList;
    private ElectronicsAdapter electronicsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);
        initViews();
        fetchResposeFromJsonAssets();
    }

    private void initViews() {
        recyclerView=findViewById(R.id.recyclerViewElectronics);
    }

    private void fetchResposeFromJsonAssets() {
        try {
            InputStream inputStream=getAssets().open("electronics.json");
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
        Type type=new TypeToken<List<ResponseElectronics>>(){}.getType();
        responseModelList=gson.fromJson(json,type);
        setRecyclerAdapter();
        electronicsAdapter.notifyDataSetChanged();

    }
    private void setRecyclerAdapter() {
        electronicsAdapter=new ElectronicsAdapter(responseModelList,this);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(electronicsAdapter);
    }

    @Override
    public void onItemClicked(ResponseFashion model, int position) {

    }

    @Override
    public void onItemElectronicsClicked(ResponseElectronics responseElectronics, int position) {
        Intent intent=new Intent(ElectronicsActivity.this,ElectronicsClickActivity.class);
        intent.putExtra("titleElectronics",responseElectronics.getTitle());
        intent.putExtra("priceElectronics",responseElectronics.getPrice());
        intent.putExtra("description",responseElectronics.getDescription());
        intent.putExtra("imageElectronics",responseElectronics.getImage());
        startActivity(intent);
    }
}