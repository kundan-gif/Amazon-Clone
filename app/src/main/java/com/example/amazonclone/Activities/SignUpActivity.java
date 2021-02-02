package com.example.amazonclone.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.amazonclone.R;

public class SignUpActivity extends AppCompatActivity {
    private Button mBtnVerifyNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mBtnVerifyNum = findViewById(R.id.btnVeriFy);
        mBtnVerifyNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getBaseContext(), );
//                startActivity(intent);
            }
        });
    }
}