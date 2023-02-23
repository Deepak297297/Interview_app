package com.example.newproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewInterview extends AppCompatActivity {
    TextView textView, interview_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_interview);
        interview_name = findViewById(R.id.interview_name);
        Intent intent = getIntent();
        String name = intent.getStringExtra ("message_key");
        interview_name.setText(name);
    }
}