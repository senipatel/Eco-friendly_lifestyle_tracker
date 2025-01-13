package com.example.eco_friendlylifestyletracker;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class WaterTrackingActivity extends AppCompatActivity {
    private ArrayAdapter<String> adapter;
    private ArrayList<String> waterSavingTips;
    private EditText edtDailyUsage;
    private TextView txtTotalUsage;
    private ListView lstWaterTips;

    private int totalWaterUsage = 0; // Initial total water usage

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_tracking);

        edtDailyUsage = findViewById(R.id.edtDailyUsage);
        txtTotalUsage = findViewById(R.id.txtTotalUsage);
        lstWaterTips = findViewById(R.id.lstWaterTips);

        Button btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trackWaterUsage();
            }
        });

        // Initialize the ArrayList and ArrayAdapter for water-saving tips
        waterSavingTips = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, waterSavingTips);
        lstWaterTips.setAdapter(adapter);

        updateTotalWaterUsage();
        provideWaterSavingTips();
    }

    private void trackWaterUsage() {
        try {
            // Perform water tracking logic here
            int dailyUsage = Integer.parseInt(edtDailyUsage.getText().toString());

            // Add the daily water usage to the total
            totalWaterUsage += dailyUsage;

            // Display the updated total water usage
            updateTotalWaterUsage();

            // Provide water-saving tips based on user input
//            provideWaterSavingTips();
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid number
            // You may want to show a toast or other error handling mechanism
        }
    }

    private void updateTotalWaterUsage() {
        // Display the total water usage to the user
        txtTotalUsage.setText("Total Water Usage: " + totalWaterUsage + " liters");
    }

    private void provideWaterSavingTips() {
        // Clear existing tips
        waterSavingTips.clear();

        // Add sample water-saving tip
        waterSavingTips.add("When washing dishes by hand, don’t let the water run. Fill one basin with wash water and the other with rinse water.");
        waterSavingTips.add("Dishwashers typically use less water than washing dishes by hand. Now, Energy Star dishwashers save even more water and energy.\n");
        waterSavingTips.add("If your dishwasher is new, cut back on rinsing. Newer models clean more thoroughly than older ones.\n");
        waterSavingTips.add("Designate one glass for your drinking water each day, or refill a water bottle. This will cut down on the number of glasses to wash.");
        waterSavingTips.add("Soak pots and pans instead of letting the water run while you scrape them clean.");
        waterSavingTips.add("Use the garbage disposal sparingly. Instead, compost vegetable food waste and save gallons every time.");
        waterSavingTips.add("Wash your fruits and vegetables in a pan of water instead of running water from the tap.");
        waterSavingTips.add("Don’t use running water to thaw food. For water efficiency and food safety, defrost food in the refrigerator.");
        waterSavingTips.add("Install an instant water heater near your kitchen sink so you don’t have to run the water while it heats up. This also reduces energy costs.");
        waterSavingTips.add("Keep a pitcher of drinking water in the refrigerator instead of running the tap. This way, every drop goes down you and not the drain.");
        waterSavingTips.add("Reuse leftover water from cooked or steamed foods to start a nutritious soup, it’s one more way to get eight glasses of water a day.\n");
        waterSavingTips.add("Cook food in as little water as possible. This also helps it retain more nutrients.");
        waterSavingTips.add("Select the proper pan size for cooking. Large pans may require more cooking water than necessary.\n");
        waterSavingTips.add("If you accidentally drop ice cubes, don’t throw them in the sink. Drop them in a house plant instead.");
        waterSavingTips.add("Collect the water you use while rinsing fruit and vegetables. Use it to water house plants.");

        // Notify the adapter that the data set has changed
        adapter.notifyDataSetChanged();
    }
}
