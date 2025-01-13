package com.example.eco_friendlylifestyletracker;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CarbonFootprintActivity extends AppCompatActivity {

    private EditText edtElectricity, edtPatrol, edtDiesel, edtLPG, edtCNG;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carbon_footprint);

        edtElectricity = findViewById(R.id.edtElectricity);
        edtPatrol = findViewById(R.id.edtPatrol);
        edtDiesel = findViewById(R.id.edtDiesel);
        edtLPG = findViewById(R.id.edtLPG);
        edtCNG = findViewById(R.id.edtCNG);
        txtResult = findViewById(R.id.txtResult);

        Button btnCalculate = findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateCarbonFootprint();
            }
        });
    }

    private void calculateCarbonFootprint() {
        // Perform calculations based on user input
        double electricity = Double.parseDouble(edtElectricity.getText().toString());
        double patrol = Double.parseDouble(edtPatrol.getText().toString());
        double diesel = Double.parseDouble(edtDiesel.getText().toString());
        double LPG = Double.parseDouble(edtLPG.getText().toString());
        double CNG = Double.parseDouble(edtCNG.getText().toString());

        double totalCarbonFootprint = (0.85*electricity) + (2.392*patrol) + (2.64*diesel) + (1.66*LPG) + (2.666*CNG);

        // Display the result to the user
        txtResult.setText("Your estimated carbon footprint is: " + totalCarbonFootprint + " kilo of CO2e");
    }
}

