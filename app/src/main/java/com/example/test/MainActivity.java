package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        EditText proceed;
//        EditText gee = findViewById(R.id.proceed);
//        gee.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent gee = new Intent(Decision.this,MainActivity.class);
//                startActivity(gee);
//                finish();



         TextView move = findViewById(R.id.proceed);
         move.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent move = new Intent(MainActivity.this,verify.class);
                 startActivity(move);
                 finish();
             }
         });


    }
}