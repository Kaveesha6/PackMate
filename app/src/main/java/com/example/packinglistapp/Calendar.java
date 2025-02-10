package com.example.packinglistapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Calendar extends AppCompatActivity {

    private CalendarView calendarView;
    private EditText editTextPlace;
    private Button btnSave;
    private String selectedDate = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calendarView = findViewById(R.id.calendarView);
        editTextPlace = findViewById(R.id.editTextPlace);
        btnSave = findViewById(R.id.btnSave);

        // Set default date when opened
        selectedDate = getCurrentDate();

        // Get selected date from CalendarView
        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
        });

        // Save button functionality
        btnSave.setOnClickListener(v -> saveData());
    }

    private void saveData() {
        String place = editTextPlace.getText().toString().trim();

        if (place.isEmpty()) {
            Toast.makeText(this, "Please enter a place!", Toast.LENGTH_SHORT).show();
            return;
        }

        // Save data in SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("CalendarData", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("selectedDate", selectedDate);
        editor.putString("selectedPlace", place);
        editor.apply();

        Toast.makeText(this, "Saved: " + selectedDate + " at " + place, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(Calendar.this, Categories.class);
                startActivity(intent);
    }

    private String getCurrentDate() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
        int month = calendar.get(java.util.Calendar.MONTH) + 1;
        int year = calendar.get(java.util.Calendar.YEAR);
        return day + "/" + month + "/" + year;
    }
}
