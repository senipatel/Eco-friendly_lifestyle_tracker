package com.example.eco_friendlylifestyletracker;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class AwardsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awards);

        ArrayList<String> ecoAwardsList = new ArrayList<>();
        ecoAwardsList.add("Recycling Champion Badge");
        ecoAwardsList.add("Energy Saver Certificate");
        ecoAwardsList.add("Water Conservation Hero Trophy");
        ecoAwardsList.add("Eco-friendly Chef Medal");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ecoAwardsList);

        ListView listView = findViewById(R.id.listViewAwards);
        listView.setAdapter(adapter);
    }
}

