package com.example.newproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CompletedInterview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed_interview);

        ListView myListView = findViewById(R.id.ListView3);
        ArrayList<String> grocery = new ArrayList<>();
        grocery.add("Divyansh");
        grocery.add("Puja");
        grocery.add("Sneha");
        grocery.add("Aditya");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android. R.layout. simple_list_item_1, grocery);
        myListView.setAdapter (arrayAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                String position = null;
                String text = "Completed" +  " " + ((TextView) view).getText().toString();
                Toast.makeText( CompletedInterview. this, text, Toast.LENGTH_SHORT).show();
            }
        });
//        Button back = findViewById(R.id.Back4);
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(CompletedInterview.this, MainActivity.class));
//            }
//        });
    }
}