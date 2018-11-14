package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    char tastaZero = 0;
    char tastaUnu = 1;
    char tastaDoi = 2;
    char tastaTrei = 3;
    char tastaPatru = 4;
    char tastaCinci = 5;
    char tastaSase = 6;
    char tastaSapte = 7;
    char tastaOpt = 8;
    char tastaNoua = 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
