package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button notes = findViewById(R.id.notes);
        Button calender = findViewById(R.id.calender);
        Button alarm =  findViewById(R.id.alarm);
        Button sport = findViewById(R.id.sport);

   }
}
