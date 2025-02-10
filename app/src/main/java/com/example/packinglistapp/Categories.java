package com.example.packinglistapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_categories);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        ImageButton btnSwimPackList = findViewById(R.id.btnSwimPackList);
        btnSwimPackList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Categories.this, SwimPackingList.class);
                startActivity(intent);
            }
        });
        ImageButton btnHikePackList = findViewById(R.id.btnHikePackList);
        btnHikePackList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Categories.this, HikePackingList.class);
                startActivity(intent);
            }
        });
        ImageButton btnCampPackList = findViewById(R.id.btnCampPackList);
        btnCampPackList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Categories.this, CampPackingList.class);
                startActivity(intent);
            }
        });
        ImageButton btnBeachPackList = findViewById(R.id.btnBeachPackList);
        btnBeachPackList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Categories.this, BeachPackingList.class);
                startActivity(intent);
            }
        });
        ImageButton btnBabyNeedsPackList = findViewById(R.id.btnBabyNeedsPackList);
        btnBabyNeedsPackList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Categories.this, BabyNeedsPackingList.class);
                startActivity(intent);
            }
        });
    }
}