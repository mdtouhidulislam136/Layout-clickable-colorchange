package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeButton2Color(View view) {
        Button button2 = findViewById(R.id.button2);
        button2.setBackgroundColor(Color.YELLOW);
        button2.setTextColor(Color.RED);
        button2.setText("Clicked");
    }

    public void changeButton1Color(View view) {
        Button button1 = findViewById(R.id.button1);
        button1.setBackgroundColor(Color.YELLOW);
        button1.setTextColor(Color.GREEN);
        button1.setText("Clicked");
    }

    public void changeButton4Color(View view) {
        Button button4 = findViewById(R.id.button4);
        button4.setBackgroundColor(Color.YELLOW);
        button4.setTextColor(Color.GREEN);
        button4.setText("Clicked");
    }

    public void changeButton3Color(View view) {
        Button button3 = findViewById(R.id.button3);
        button3.setBackgroundColor(Color.YELLOW);
        button3.setTextColor(Color.GREEN);
        button3.setText("Clicked");
    }
}