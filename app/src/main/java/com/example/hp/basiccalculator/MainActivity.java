package com.example.hp.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText text1;
EditText text2;
TextView text3;
Button button1;
Button button2;
Button button3;
Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        text1 = findViewById(R.id.textview1);
        text2 = findViewById(R.id.textview2);
        text3 = findViewById(R.id.textview3);
    }
    public void calculate(View View){
        double a,b,c;
        a=Float.parseFloat(text1.getText().toString());
        b=Float.parseFloat(text2.getText().toString());
        int id = View.getId();;
        if(id == R.id.button1 ){
        c = a + b;
        text3.setText(""+ c);
        }
        if(id == R.id.button2){
        c = a-b;
        text3.setText(""+ c);
        }
        if(id == R.id.button3){
        c = a * b;
        text3.setText(""+ c);
        }
        if(id == R.id.button4){
c = a /b;
text3.setText(""+ c);
        }
    }
}
