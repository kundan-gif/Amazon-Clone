package com.example.amazonclone.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.amazonclone.R;


public class SignInActivity extends AppCompatActivity {
    private Button mBtnSkipSignIn;


    private Button mBtnAlreadySignin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        initViews();
    }

    

    private void initViews() {
        mBtnAlreadySignin = findViewById(R.id.btnAlreadyCustomer);
        mBtnAlreadySignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, LoginActivityP.class);
                startActivity(intent);
            }
        });
       mBtnSkipSignIn=findViewById(R.id.btnSkipSignIn);
        mBtnSkipSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignInActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
    }


}