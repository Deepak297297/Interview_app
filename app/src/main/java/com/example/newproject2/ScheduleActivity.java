package com.example.newproject2;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class ScheduleActivity extends AppCompatActivity {
//    private String[][] student_details1 =
//            {
//                    {"Name : Deepak", "Grade : 9 cgpa"},
//                    {"Name : Aman", "Grade : 8 cgpa"},
//                    {"Name : Keshav", "Grade : 9.5 cgpa"},
//                    {"Name : Nitish", "Grade : 9.1cgpa"},
//                    {"Name : Mayank", "Grade : 8.4 cgpa"},
//                    {"Name : Shubham", "Grade : 8.8 cgpa"},
//                    {"Name : Kunal", "Grade : 8.9 cgpa"},
//                    {"Name : Vansh", "Grade : 8.2 cgpa"},
//                    {"Name : Vinod", "Grade : 9.4 cgpa"},
//                    {"Name : Ankit", "Grade : 9.2cgpa"},
//                    {"Name : Ronit", "Grade : 8.8 cgpa"},
//                    {"Name : Saksham", "Grade : 8.4 cgpa"}
//            };
//
//    String[][] student_details ={};
//    ArrayList list;
//    HashMap<String, String> item;
//    SimpleAdapter sa;

    ListView listview;
    String[] Students = {"Deepak", "Keshav", "Nitish", "Abhi", "Rahul", "Anuj", "Ravi", "Siddharth", "Mayank"};

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);


//        list = new ArrayList();
//        for(int i=0; i<student_details.length;i++){
//            item = new HashMap<String, String>();
//            item.put("Line1", student_details[i][0]);
//            item.put("Line2", student_details[i][1]);
//            list.add(item);
//        }
//        sa= new SimpleAdapter(this, list,
//                R.layout.multi_lines,
//                new String[]{"line1", "line2"},
//                new int[]{R.id.line_a,R.id.line_b}
//                );
//        ListView lst = findViewById(R.id.ListView1);
//        lst.setAdapter(sa);

        TextView deepak = findViewById(R.id.Deepak);
        deepak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(ScheduleActivity.this, StudentActivity.class));
                String text = "Please tick on box of" +  " " + ((TextView) view).getText().toString();
                Toast.makeText( ScheduleActivity. this, text, Toast.LENGTH_SHORT).show();
            }
        });
        TextView keshav = findViewById(R.id.Keshav);
        keshav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "Please tick on box of" +  " " + ((TextView) view).getText().toString();
                Toast.makeText( ScheduleActivity. this, text, Toast.LENGTH_SHORT).show();
            }
        });
        TextView nitish = findViewById(R.id.Nitish);
        nitish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "Please tick on box of" +  " " + ((TextView) view).getText().toString();
                Toast.makeText( ScheduleActivity. this, text, Toast.LENGTH_SHORT).show();
            }
        });
        TextView shraddha = findViewById(R.id.Shraddha);
        shraddha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "Please tick on box of" +  " " + ((TextView) view).getText().toString();
                Toast.makeText( ScheduleActivity. this, text, Toast.LENGTH_SHORT).show();
            }
        });
        TextView katrina = findViewById(R.id.Katrina);
        katrina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "Please tick on box of" +  " " + ((TextView) view).getText().toString();
                Toast.makeText( ScheduleActivity. this, text, Toast.LENGTH_SHORT).show();;
            }
        });
        TextView anuj = findViewById(R.id.Anuj);
        anuj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "Please tick on box of" +  " " + ((TextView) view).getText().toString();
                Toast.makeText( ScheduleActivity. this, text, Toast.LENGTH_SHORT).show();
            }
        });
        TextView viral = findViewById(R.id.Viral);
        viral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "Please tick on box of" +  " " + ((TextView) view).getText().toString();
                Toast.makeText( ScheduleActivity. this, text, Toast.LENGTH_SHORT).show();
            }
        });
        TextView harshvardan = findViewById(R.id.Harshvardhan);
        harshvardan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "Please tick on box of" +  " " + ((TextView) view).getText().toString();
                Toast.makeText( ScheduleActivity. this, text, Toast.LENGTH_SHORT).show();
            }
        });
        TextView aman = findViewById(R.id.Aman);
        aman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "Please tick on box of" +  " " + ((TextView) view).getText().toString();
                Toast.makeText( ScheduleActivity. this,text, Toast.LENGTH_SHORT).show();
            }
        });

        TextView back = findViewById(R.id.Back2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScheduleActivity.this, MainActivity.class));
            }
        });
        CheckBox checkbox1 = findViewById(R.id.checkBox1);
        CheckBox checkbox2 = findViewById(R.id.checkBox2);
        CheckBox checkbox3 = findViewById(R.id.checkBox3);
        CheckBox checkbox4 = findViewById(R.id.checkBox4);
        CheckBox checkbox5 = findViewById(R.id.checkBox5);
        CheckBox checkbox6 = findViewById(R.id.checkBox6);
        CheckBox checkbox7 = findViewById(R.id.checkBox7);
        CheckBox checkbox8 = findViewById(R.id.checkBox8);
        CheckBox checkbox9 = findViewById(R.id.checkBox9);



        Button next = findViewById(R.id.Next2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalamount=0;
                StringBuilder result=new StringBuilder();

                if(checkbox1.isChecked()){
                    result.append("Selected Students:");
                    startActivity((new Intent(ScheduleActivity.this, StudentActivity.class)));

                }
                if(checkbox2.isChecked()){
                    result.append("Selected Students:");
                    startActivity((new Intent(ScheduleActivity.this, Keshav.class)));

                }
                if(checkbox3.isChecked()){
                    result.append("Selected Students:");
                    startActivity((new Intent(ScheduleActivity.this, Nitish.class)));

                }
                if(checkbox4.isChecked()){
                    result.append("Selected Students:");
                    startActivity((new Intent(ScheduleActivity.this, Shraddha.class)));

                }
                if(checkbox5.isChecked()){
                    result.append("Selected Students:");
                    startActivity((new Intent(ScheduleActivity.this, Katrina.class)));

                }
                if(checkbox6.isChecked()){
                    result.append("Selected Students:");
                    startActivity((new Intent(ScheduleActivity.this, Anuj.class)));

                }
                if(checkbox7.isChecked()){
                    result.append("Selected Students:");
                    startActivity((new Intent(ScheduleActivity.this, Viral.class)));

                }
                if(checkbox8.isChecked()){
                    result.append("Selected Students:");
                    startActivity((new Intent(ScheduleActivity.this, Harshvardhan.class)));

                }
                if(checkbox9.isChecked()){
                    result.append("Selected Students:");
                    startActivity((new Intent(ScheduleActivity.this, Aman.class)));

                }
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();

        }
        });



    }

}