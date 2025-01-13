package com.example.eco_friendlylifestyletracker;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class RecipesActivity extends AppCompatActivity {

    private ArrayList<String> ecoFriendlyRecipes;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        ecoFriendlyRecipes = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ecoFriendlyRecipes);

        ListView listView = findViewById(R.id.listViewRecipes);
        listView.setAdapter(adapter);

        ecoFriendlyRecipes.add("Rainbow Veggie Spring Rolls with Peanut Sauce");
        ecoFriendlyRecipes.add("Turmeric and Cumin Infused Veggies");
        ecoFriendlyRecipes.add("Vegan Green Goddess Dressing");
        ecoFriendlyRecipes.add("Creamy Broccoli and Avocado Soup");
        ecoFriendlyRecipes.add("Root Vegetable and Bean Soup");
        ecoFriendlyRecipes.add("Orange Quinoa Salad with Pomegranate and Tangy Turmeric Dressing");
        ecoFriendlyRecipes.add("Vegan Mediterranean Prune Salad with Beets, Almonds, and Edamame");
        ecoFriendlyRecipes.add("Thai Tofu Veggie Noodle Bowl");
        ecoFriendlyRecipes.add("One Pot Loaded Veggie Pasta");
        ecoFriendlyRecipes.add("Roasted Cauliflower Fettuccine");
        ecoFriendlyRecipes.add("Chickpea and Vegetable Moroccan Tagine");
        ecoFriendlyRecipes.add("Lentil Tacos");
        ecoFriendlyRecipes.add("Cashew & Chickpea Korma");
        ecoFriendlyRecipes.add("Roasted Beet Pesto and Greens Pasta Toss");
        ecoFriendlyRecipes.add("Vegetarian Rice and Bean Casserole");
        ecoFriendlyRecipes.add("Vegan Stuffed Peppers");
        ecoFriendlyRecipes.add("Harissa Glazed Alaska Salmon with Lemon Mint Quinoa");
        ecoFriendlyRecipes.add("Easy Baked Salmon: Sweet, Spicy, Orange-y and Delicious");
        ecoFriendlyRecipes.add("Scallop & Shrimp Soup");
        ecoFriendlyRecipes.add("Super Grains Salmon Burger");


        adapter.notifyDataSetChanged();
    }
}


