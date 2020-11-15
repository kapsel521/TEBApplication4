package com.example.tebapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button przelicz;
        przelicz = findViewById(R.id.przeliczButton);
        final EditText zlotowki = findViewById(R.id.plnEditText);

        przelicz.setOnClickListener(
                new View.OnClickListener() {
                    @SuppressLint("DefaultLocale")
                    @Override
                    public void onClick(View view) {
                        if(zlotowki.getText().toString().length() != 0) {
                            Toast.makeText(getApplicationContext(), "Wartość w euro: " + String.format( "%.2f", Double.valueOf
                                    (zlotowki.getText().toString()) * 0.22), Toast.LENGTH_LONG).show();
                        }else {
                            Toast.makeText(getApplicationContext(), "wpisz jakąś wartośc do przeliczenia", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
}