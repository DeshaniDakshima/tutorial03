package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView Number_One = findViewById(R.id.Number1TextBox);
        TextView Number_Two = findViewById(R.id.Number2TextBox);

        Button add = findViewById(R.id.addNumBtn);
        Button sub = findViewById(R.id.subNumBtn);
        Button multi = findViewById(R.id.multiNumBtn);
        Button division = findViewById(R.id.divisionNumBtn);


        Intent i = getIntent();
        final int num_01 = i.getIntExtra("Num_1_val",0);
        final int num_02 = i.getIntExtra("Num_2_val",0);

        Number_One.setText(String.valueOf(num_01));
        Number_Two.setText(String.valueOf(num_02));

        // addition Button
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView answer = findViewById(R.id.answer_txt);


                int final_1 = num_01 + num_02;
                answer.setText(String.valueOf(num_01 +" + "+ num_02 +"= " +final_1));


            }
        });


        //sub Button

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView answer = findViewById(R.id.answer_txt);


                int final_1 = num_01 - num_02;
                answer.setText(String.valueOf(num_01 +" - "+ num_02 +"= " +final_1));
            }
        });

        // multi Button
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView answer = findViewById(R.id.answer_txt);


                int final_1 = num_01 * num_02;
                answer.setText(String.valueOf(num_01 +" * "+ num_02 +"= " +final_1));
            }
        });

        //  division Button

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView answer = findViewById(R.id.answer_txt);


                int final_1 = num_01 / num_02;
                answer.setText(String.valueOf(num_01 +" / "+ num_02 +"= " +final_1));
            }
        });
    }
}