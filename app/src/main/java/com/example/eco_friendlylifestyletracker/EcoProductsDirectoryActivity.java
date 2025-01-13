package com.example.eco_friendlylifestyletracker;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class EcoProductsDirectoryActivity extends AppCompatActivity {

    private ArrayList<String> ecoFriendlyProducts;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eco_products_directory);

        ecoFriendlyProducts = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ecoFriendlyProducts);

        ListView listView = findViewById(R.id.listViewEcoProducts);
        listView.setAdapter(adapter);

        // Add sample eco-friendly products to the directory
        ecoFriendlyProducts.add("Reusable Water Bottles - Brand: Hydro Flask");
        ecoFriendlyProducts.add("Biodegradable Dish Soap - Brand: Ecover");
        ecoFriendlyProducts.add("Recycled Paper Towels - Brand: Seventh Generation");
        ecoFriendlyProducts.add("Bamboo Toothbrush - Brand: Brush with Bamboo");
        ecoFriendlyProducts.add("Solar-Powered Phone Charger - Brand: Anker");
        ecoFriendlyProducts.add("Organic Cotton Tote Bags - Brand: Baggu");
        ecoFriendlyProducts.add("Eco-friendly Yoga Mat - Brand: Liforme");
        ecoFriendlyProducts.add("Biodegradable Trash Bags - Brand: BioBag");
        ecoFriendlyProducts.add("Reusable Food Storage Bags - Brand: Stasher");
        ecoFriendlyProducts.add("LED Light Bulbs - Brand: Philips");
        ecoFriendlyProducts.add("Fair Trade Coffee - Brand: Equal Exchange");
        ecoFriendlyProducts.add("Natural Cleaning Products - Brand: Method");
        ecoFriendlyProducts.add("Eco-friendly Sneakers - Brand: Allbirds");
        ecoFriendlyProducts.add("Compostable Plates - Brand: Earth's Natural Alternative");
        ecoFriendlyProducts.add("Solar-Powered Outdoor Lights - Brand: GIGALUMI");

        // Notify the adapter that the data set has changed
        adapter.notifyDataSetChanged();
    }
}

