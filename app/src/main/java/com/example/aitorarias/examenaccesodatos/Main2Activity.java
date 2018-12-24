package com.example.aitorarias.examenaccesodatos;

import android.view.View;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class Main2Activity extends AppCompatActivity{
    PieChartView pieChartView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pieChartView = findViewById(R.id.chart);

        List pieData = new ArrayList<>();
        pieData.add(new SliceValue(11, Color.BLUE).setLabel("PS2: 155"));
        pieData.add(new SliceValue(11, Color.GRAY).setLabel("DS: 154"));
        pieData.add(new SliceValue(8, Color.RED).setLabel("GB: 118"));
        pieData.add(new SliceValue(7, Color.MAGENTA).setLabel("PS: 102"));
        pieData.add(new SliceValue(7, Color.GREEN).setLabel("Wii: 101"));
        pieData.add(new SliceValue(4, Color.LTGRAY).setLabel("PS4: 86"));
        pieData.add(new SliceValue(4, Color.GRAY).setLabel("PS3: 83"));
        pieData.add(new SliceValue(3, Color.MAGENTA).setLabel("3DS: 73"));
        pieData.add(new SliceValue(3, Color.GREEN).setLabel("NES: 62"));
        pieData.add(new SliceValue(42, Color.YELLOW).setLabel("Resto: 570"));

        PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasLabels(true).setValueLabelTextSize(14);
        pieChartData.setHasCenterCircle(true).setCenterText1("Ventas en millones").setCenterText1FontSize(20).setCenterText1Color(Color.parseColor("#0097A7"));
        pieChartView.setPieChartData(pieChartData);
    }

    public void back (View v){
        Intent i= new Intent (this,MainActivity.class);
        startActivity(i);
    }

}