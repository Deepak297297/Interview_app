package com.example.newproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Harshvardhan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harshvardhan);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button back = findViewById(R.id.Back3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Harshvardhan.this, ScheduleActivity.class));
            }
        });
    }
}