package com.dayanand.ashok.vikasdny;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity
{

    private android.support.v7.widget.Toolbar mToolbar;
    private FirebaseAuth mAuth;
private TextInputLayout mpass;
private TextInputLayout memail;
private  Button mlbtn;
    private ProgressDialog mlog_progrs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
        mToolbar=(android.support.v7.widget.Toolbar)findViewById(R.id.apptoolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Login");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

       mpass = (TextInputLayout) findViewById(R.id.log_pass);
        memail = (TextInputLayout) findViewById(R.id.log_email);
        mlbtn= (Button)findViewById(R.id.summit);
        mlog_progrs=new ProgressDialog(this);
        mlbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email=memail.getEditText().getText().toString();
                String password=mpass.getEditText().getText().toString();

                if (!TextUtils.isEmpty(email)||!TextUtils.isEmpty(password)){

                    mlog_progrs.setMessage("Please wait when we creatig your account");
                    mlog_progrs.setTitle("Registereing User");
                    mlog_progrs.show();
                    mlog_progrs.setCanceledOnTouchOutside(false);




                loginUser(email,password);}


            }
        });

    }

    private void loginUser(String email, String password) {
mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(LoginActivity.this,new OnCompleteListener<AuthResult>() {
    @Override
    public void onComplete(@NonNull Task<AuthResult> task) {
        if (task.isSuccessful()) {
            mlog_progrs.dismiss();
            Intent Log_Intent = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(Log_Intent);
            finish();
        } else {
            mlog_progrs.hide();

            Toast.makeText(LoginActivity.this, "" + task.getException().getMessage(), Toast.LENGTH_LONG).show();
        }
    }
});
    }
}
