package com.example.testandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttontest(View view) {

    }

    public void baus(View view) {
        Button testButton3 = (Button) findViewById(R.id.B3);
        testButton3.setVisibility(View.GONE);

        Button testButton2 = (Button) findViewById(R.id.B2);
        testButton2.setVisibility(View.GONE);

        Button testButton1 = (Button) findViewById(R.id.B1);
        testButton1.setVisibility(View.GONE);

    }

    public void bein(View view) {
        Button testButton3 = (Button) findViewById(R.id.B3);
        testButton3.setVisibility(View.VISIBLE);

        Button testButton2 = (Button) findViewById(R.id.B2);
        testButton2.setVisibility(View.VISIBLE);

        Button testButton1 = (Button) findViewById(R.id.B1);
        testButton1.setVisibility(View.VISIBLE);


    }

}