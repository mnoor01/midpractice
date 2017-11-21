package com.example.c4q.rusipreferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String string= bundle.getString("nice");
        TextView view01=(TextView) findViewById(R.id.view01);
        view01.setText(string);
        Toast.makeText(this,"hi, intents and preferences are important",Toast.LENGTH_LONG).show();
    }
}// right now I am going to create a branch by git checkout -b branchname
//then push to that branch
// I am creating a second branch
//jibwdifjbnweojfnojwernfoenrofu