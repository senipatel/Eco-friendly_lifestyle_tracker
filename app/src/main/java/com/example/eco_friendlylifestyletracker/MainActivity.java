package com.example.eco_friendlylifestyletracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnChallenges).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ChallengesActivity.class));
            }
        });

        findViewById(R.id.btnShoppingList).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ShoppingListActivity.class));
            }
        });

        findViewById(R.id.btnRecipes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RecipesActivity.class));
            }
        });

        findViewById(R.id.btnCalculator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CarbonFootprintActivity.class));
            }
        });

        findViewById(R.id.btnWasteTracking).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, WasteTrackingActivity.class));
            }
        });

        findViewById(R.id.btnWaterTracking).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, WaterTrackingActivity.class));
            }
        });

        findViewById(R.id.btnEcoProductsDirectory).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, EcoProductsDirectoryActivity.class));
            }
        });

        findViewById(R.id.btnGreenEnergyOptions).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GreenEnergyOptionsActivity.class));
            }
        });

        findViewById(R.id.btnEcoAwards).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AwardsActivity.class));
            }
        });
    }
}
