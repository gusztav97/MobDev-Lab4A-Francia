package com.example.jsu.lab4afrancia;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class DistanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onDistanceClick(View v){
        String miles = ((EditText) findViewById(R.id.inputMiles)).getText().toString();
        String kms = ((EditText) findViewById(R.id.inputKilometers)).getText().toString();
        if (miles.isEmpty()){

            if (!kms.isEmpty() ) {


                double editKilometers = Double.parseDouble(kms);
                double editMiles = editKilometers * 0.621371;

                ((EditText) findViewById(R.id.inputMiles)).setText( Double.toString(editMiles) );

            }

        }

        else {

            double editMiles = Double.parseDouble(miles);
            double editKilometers = editMiles * 1.60934;

            ((EditText) findViewById(R.id.inputKilometers)).setText( Double.toString(editKilometers) );

        }

    }

}
