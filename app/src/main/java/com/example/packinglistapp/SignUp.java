package com.example.packinglistapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnSignUp2 = findViewById(R.id.signup_btn);
        btnSignUp2.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(SignUp.this, VerifyPhoneNo.class);
                startActivity(intent);
            }

        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnAlreadyHaveAccount = findViewById(R.id.already_have_account_btn);
        btnAlreadyHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, Login.class);
                startActivity(intent);
            }
        });
    }
}