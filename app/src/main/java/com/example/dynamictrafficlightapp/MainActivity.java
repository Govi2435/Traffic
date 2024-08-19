package com.example.dynamictrafficlightapp;

import android.os.Bundle;
import android.view.View;
import android.view.*;
import android.widget.Button;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private View redLight;
    private View yellowLight;
    private View greenLight;
    private Button stopButton;
    private Button waitButton;
    private Button goButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redLight = findViewById(R.id.redLight);
        yellowLight = findViewById(R.id.yellowLight);
        greenLight = findViewById(R.id.greenLight);
        stopButton = findViewById(R.id.stopButton);
        waitButton = findViewById(R.id.waitButton);
        goButton = findViewById(R.id.goButton);

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLightHeight(redLight, 300);
                setLightHeight(yellowLight, 100);
                setLightHeight(greenLight, 100);
            }
        });

        waitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLightHeight(redLight, 100);
                setLightHeight(yellowLight, 300);
                setLightHeight(greenLight, 100);
            }
        });

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLightHeight(redLight, 100);
                setLightHeight(yellowLight, 100);
                setLightHeight(greenLight, 300);
            }
        });
    }

    private void setLightHeight(View light, int height) {
        ViewGroup.LayoutParams params = light.getLayoutParams();
        params.height = height;
        light.setLayoutParams(params);
    }
}

