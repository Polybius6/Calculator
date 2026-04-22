package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editText1 = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        resultText = findViewById(R.id.resultText);
    }

    public void sum(View view){
        if(editText1.getText().toString().matches("")|| editText2.getText().toString().matches("")){
            resultText.setText("numara gir!!");
        }else{
            int number1 = Integer.parseInt(editText1.getText().toString());
            int number2 = Integer.parseInt(editText2.getText().toString());

            int result = number1+number2;

            resultText.setText("sonuç : " + result);
        }

    }
    public void deduct(View view){
        if(editText1.getText().toString().matches("")|| editText2.getText().toString().matches("")){
            resultText.setText("numara gir!!");
        }else{
            int number1 = Integer.parseInt(editText1.getText().toString());
            int number2 = Integer.parseInt(editText2.getText().toString());

            int result = number1-number2;

            resultText.setText("sonuç : " + result);
        }
    }
    public void multiply(View view){
        if(editText1.getText().toString().matches("")|| editText2.getText().toString().matches("")){
            resultText.setText("numara gir!!");
        }else{
            int number1 = Integer.parseInt(editText1.getText().toString());
            int number2 = Integer.parseInt(editText2.getText().toString());

            int result = number1*number2;

            resultText.setText("sonuç : " + result);
        }
    }
    public void divide(View view){
        if(editText1.getText().toString().matches("")|| editText2.getText().toString().matches("")){
            resultText.setText("numara gir!!");
        }else{
            int number1 = Integer.parseInt(editText1.getText().toString());
            int number2 = Integer.parseInt(editText2.getText().toString());

            int result = number1/number2;

            resultText.setText("sonuç : " + result);
        }
    }
}