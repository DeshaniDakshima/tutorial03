package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ok = findViewById(R.id.ok_btn);
        final EditText InputNum1 = findViewById(R.id.Num1_act1_input);
        final EditText InputNum2 = findViewById(R.id.Num2_act1_input);


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater li = getLayoutInflater();

                View layout = li.inflate(R.layout.custom_toast, (ViewGroup)
                        findViewById(R.id.custom_toast_layout));


                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);
                toast.show();

                String number_1 = InputNum1.getText().toString();
                int result1 = Integer.parseInt(number_1);

                String number_2 = InputNum2.getText().toString();
                int result2 = Integer.parseInt(number_2);

                Intent d = new Intent(getApplicationContext(),SecondActivity.class);


                d.putExtra("Num_1_val", result1);
                d.putExtra("Num_2_val", result2);

                startActivity(d);
            }
        });
    }
}