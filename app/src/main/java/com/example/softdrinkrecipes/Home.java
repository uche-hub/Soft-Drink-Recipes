package com.example.softdrinkrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void softDrinks(View v){
        Intent intent = new Intent(this, SoftDrinks.class);
        startActivity(intent);
    }

    public void cocoaDrink(View v){
        Intent intent = new Intent(this, CocoaDrink.class);
        startActivity(intent);
    }

    public void shakesDrinks(View v){
        Intent intent = new Intent(this, ShakesDrinks.class);
        startActivity(intent);
    }

    public void cockTail(View v){
        Intent intent = new Intent(this, CockTail.class);
        startActivity(intent);
    }
}
