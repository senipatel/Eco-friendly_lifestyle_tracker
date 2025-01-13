package com.example.eco_friendlylifestyletracker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class WasteTrackingActivity extends AppCompatActivity {

    private EditText edtRecycled, edtComposted, edtLandfilled;
    private TextView txtWasteGoal, txtProgress;

    private String wasteGoal = "50%"; // Set a default waste reduction goal

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waste_tracking);

        edtRecycled = findViewById(R.id.edtRecycled);
        edtComposted = findViewById(R.id.edtComposted);
        edtLandfilled = findViewById(R.id.edtLandfilled);
        txtWasteGoal = findViewById(R.id.txtWasteGoal);
        txtProgress = findViewById(R.id.txtProgress);

        Button btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trackWaste();
            }
        });

        updateWasteGoal();
    }

    private void trackWaste() {
        // Perform waste tracking logic here
        int recycled = Integer.parseInt(edtRecycled.getText().toString());
        int composted = Integer.parseInt(edtComposted.getText().toString());
        int landfilled = Integer.parseInt(edtLandfilled.getText().toString());

        // Calculate the total waste
        int totalWaste = recycled + composted + landfilled;

        // Calculate the percentage of waste reduction
        int wasteReduction = 100 - ((totalWaste * 100) / (recycled + composted));

        // Display the waste reduction progress
        txtProgress.setText("Your waste reduction progress: " + wasteReduction + "%");
    }

    private void updateWasteGoal() {
        // Display the waste reduction goal to the user
        txtWasteGoal.setText("Your waste reduction goal: " + wasteGoal );
    }
}

