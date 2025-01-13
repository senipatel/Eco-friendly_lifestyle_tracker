package com.example.eco_friendlylifestyletracker;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class GreenEnergyOptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green_energy_options);

        ArrayList<String> greenEnergyDetails = new ArrayList<>();
        greenEnergyDetails.add("Solar Power:\n"+
                "Photovoltaic (PV) Panels: Convert sunlight into electricity.\n"+
                "Solar Water Heating: Utilize sunlight to heat water for residential or industrial use.\n");
        greenEnergyDetails.add("Wind Power:\n"+
                "Wind Turbines: Generate electricity by harnessing the power of wind.\n");
        greenEnergyDetails.add("Hydropower:\n"+
                "Hydroelectric Dams: Convert the energy of flowing or falling water into electricity.\n");
        greenEnergyDetails.add("Geothermal Energy:\n"+
                "Geothermal Power Plants: Use heat from the Earth's interior to generate steam and produce electricity.\n");
        greenEnergyDetails.add("Biomass:\n"+
                "Biogas: Extract energy from organic waste through anaerobic digestion.\n"+
                "Bioenergy: Use organic materials like wood pellets for heating and electricity generation.\n");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, greenEnergyDetails);

        ListView listView = findViewById(R.id.listViewGreenEnergy);
        listView.setAdapter(adapter);
    }
}