package com.dayanand.ashok.vikasdny;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {
    private Button mRegbtn;
    private Button mlogbtnv;
    private android.support.v7.widget.Toolbar mToolbar;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_start);
        mToolbar=(android.support.v7.widget.Toolbar)findViewById(R.id.apptoolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Start page");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mRegbtn=(Button)findViewById(R.id.start_Regbtn);
        mRegbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent StartIntent = new Intent(StartActivity.this,RegisterActivity.class);
                startActivity(StartIntent);


            }
        });
        mlogbtnv=(Button)findViewById(R.id.mLogBtn);
        mlogbtnv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent StartIntenta = new Intent(StartActivity.this,LoginActivity.class);
                startActivity(StartIntenta);

            }
        });

    }


}
