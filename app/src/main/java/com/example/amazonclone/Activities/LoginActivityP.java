package com.example.amazonclone.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.amazonclone.Activities.ui.home.HomeFragment;
import com.example.amazonclone.R;

public class LoginActivityP extends AppCompatActivity implements View.OnClickListener {
    private EditText mEtUserName;
    private RadioButton mRadiobtnCreatAcc;
    private Button mBtnContineLog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_p);
        initView();
    }

    private void initView() {
        mRadiobtnCreatAcc = findViewById(R.id.radiobtnCreatAcc);
        mBtnContineLog = findViewById(R.id.btnContineLogin);
        mBtnContineLog.setOnClickListener(this);
        mRadiobtnCreatAcc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.radiobtnCreatAcc:
                Intent intent = new Intent(LoginActivityP.this, SignUpActivity.class);
                startActivity(intent);
                break;
            case R.id.btnContineLogin:
                Intent intentOne = new Intent(LoginActivityP.this, HomeActivity.class);
                intentOne.putExtra("userName", mEtUserName.getText().toString());
                startActivity(intentOne);
                break;

        }
    }
}