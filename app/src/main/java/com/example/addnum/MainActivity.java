package com.example.addnum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView textans;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textans=findViewById(R.id.textans);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum= Integer.parseInt(num1.getText().toString())+ Integer.parseInt(num2.getText().toString());
                textans.setText("The sum is: "+ sum);
            }
        });


    }
}