package com.example.cookingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class loading extends AppCompatActivity {
    private Button bttn;
    private Button reg;
    private Button guest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loading);
        reg = findViewById(R.id.editTextRegister);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loading.this, signupActivity.class);
                startActivity(intent);
            }
        });
        bttn = findViewById(R.id.editTextLogin);
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loading.this, Intro.class);
                startActivity(intent);
            }
        });
        guest = findViewById(R.id.editTextGuest);
        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loading.this, homepage.class);
                startActivity(intent);
            }
        });
    }
}