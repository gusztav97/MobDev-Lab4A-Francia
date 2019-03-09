package com.example.jsu.lab4afrancia;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

public class TipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onTipClick(View v){
        String totalBill = ((EditText) findViewById(R.id.totalBill)).getText().toString();
        String tipPercentage = ((EditText) findViewById(R.id.tipPercentage)).getText().toString();
        String numberOfPeople = ((EditText) findViewById(R.id.numOfPeople)).getText().toString();
        DecimalFormat df = new DecimalFormat("#.##");

        double totalBillEdit = Double.parseDouble(totalBill);
        double tipPercentageEdit = Double.parseDouble(tipPercentage);
        double numOfPeopleEdit = Double.parseDouble(numberOfPeople);

        double ActualAmountPerPerson = totalBillEdit / numOfPeopleEdit;
        double ActualTipPerPerson = (totalBillEdit * (tipPercentageEdit/100)) / numOfPeopleEdit;
        double totalPerPerson = ActualAmountPerPerson + ActualTipPerPerson;

        ((EditText) findViewById(R.id.totalPerPerson)).setText( df.format(totalPerPerson) );



    }

}
