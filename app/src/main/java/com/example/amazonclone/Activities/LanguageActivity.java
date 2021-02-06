package com.example.amazonclone.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.amazonclone.R;

public class LanguageActivity extends AppCompatActivity {
    private CardView mCardViewEnglish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language);
        initViews();
    }

    private void initViews() {
        mCardViewEnglish=findViewById(R.id.cardViewEnglish);
        mCardViewEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LanguageActivity.this,SignInActivity.class);
                startActivity(intent);
            }
        });
    }
}