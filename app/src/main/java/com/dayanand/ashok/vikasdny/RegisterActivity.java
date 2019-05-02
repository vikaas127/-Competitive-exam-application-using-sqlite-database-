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
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class RegisterActivity extends AppCompatActivity {
    private android.support.v7.widget.Toolbar mToolbar;

    private Button mRegbtna;
    private FirebaseAuth mAuth;
private TextInputLayout muser;
    private TextInputLayout memail;
    private TextInputLayout mpassword;
private ProgressDialog mReg_progrs;
private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        mAuth = FirebaseAuth.getInstance();


        mToolbar=(android.support.v7.widget.Toolbar)findViewById(R.id.apptoolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Register");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
mReg_progrs=new ProgressDialog(this);


        muser=(TextInputLayout) findViewById(R.id.reg_user) ;
        memail=(TextInputLayout)findViewById(R.id.reg_email) ;
        mpassword=(TextInputLayout)findViewById(R.id.reg_pass) ;

        mRegbtna=(Button)findViewById(R.id.starts_Regbtn);

        mRegbtna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String User=muser.getEditText().getText().toString();

                String email=memail.getEditText().getText().toString();
                String password=mpassword.getEditText().getText().toString();
                if ( !TextUtils.isEmpty(User)&& !TextUtils.isEmpty(email)&& !TextUtils.isEmpty(password)){

                     mReg_progrs.setMessage("Please wait when we creatig your account");
                     mReg_progrs.setTitle("Registereing User");
                     mReg_progrs.cancel();
                     mReg_progrs.setCanceledOnTouchOutside(false);

                    register_user(User,email,password);

                }


            }
        });
    }



    private void register_user(final String User, String email, String password) {
        mAuth.createUserWithEmailAndPassword( email, password).addOnCompleteListener(RegisterActivity.this,new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {


                    FirebaseUser current_user = FirebaseAuth.getInstance().getCurrentUser();
                    String uid = current_user.getUid();

                   mDatabase  = FirebaseDatabase.getInstance().getReference().child("Users").child(uid);
                    HashMap<String,String>userMap= new HashMap<>();
                    userMap.put("name",User);
                    userMap.put("status","hi i am  your hero");
                    userMap.put("image","default");
                    userMap.put(" thumb image","default");
                    mDatabase.setValue(userMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                mReg_progrs.dismiss();
                                Intent reg_Intent = new Intent(RegisterActivity.this, MainActivity.class);
                                startActivity(reg_Intent);
                                finish();
                            }
                        }
                    });
                    }
                else {
                    mReg_progrs.hide();

                    Toast.makeText(RegisterActivity.this,"error" + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });


    }}

