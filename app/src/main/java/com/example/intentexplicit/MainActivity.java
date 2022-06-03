package com.example.intentexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String[] arrNameString;
    ImageView imgRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgRandom = findViewById(R.id.imageRandom);
        arrNameString = getResources().getStringArray(R.array.name_array);
        Random random = new Random();
        int indexRandom = random.nextInt(arrNameString.length);
        String nameRandom  = arrNameString[indexRandom];
        int idImage = getResources().getIdentifier(nameRandom,"drawable", this.getPackageName());
        imgRandom.setImageResource(idImage);
    }




}