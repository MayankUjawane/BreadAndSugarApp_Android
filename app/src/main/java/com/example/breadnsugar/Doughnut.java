package com.example.breadnsugar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Doughnut extends AppCompatActivity {
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doughnut);
    }

    public void cakes(View view){
        startActivity( new Intent(this, MainActivity2.class));
    }

    public void doughnut(View view){
        startActivity( new Intent(this, Doughnut.class));
    }
    public void muffins(View view){
        startActivity( new Intent(this, Muffin.class));
    }
    public void d1(View view){
        startActivity( new Intent(this, Recipe.class).putExtra("item", "Chocolate Doughnut"));
    }
    public void d2(View view){
        startActivity( new Intent(this, Recipe.class).putExtra("item", "Caramel Doughnut"));
    }
}