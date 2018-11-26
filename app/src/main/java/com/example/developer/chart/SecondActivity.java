package com.example.developer.chart;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;

import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieData;

import android.view.View;
import android.widget.Spinner;


import android.widget.TextView;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.Response;
import com.android.volley.Request;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.github.mikephil.charting.utils.ColorTemplate;

import android.util.Log;


import org.json.JSONArray;
import org.json.JSONException;


import android.widget.*;


public class SecondActivity extends AppCompatActivity {
    TextView year;
    TextView chart;
    PieChart nchart;
    PieChart nchart1;
    PieChart nchart2;
    PieChart nchart3;



    private Button button;

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);





        nchart= (PieChart)findViewById(R.id.chart);
        nchart1= (PieChart)findViewById(R.id.chart1);
        nchart2= (PieChart)findViewById(R.id.chart2);
        nchart3= (PieChart)findViewById(R.id.chart3);
        Button button=(Button)findViewById(R.id.button2);
        Button btn=(Button)findViewById(R.id.button);

        ArrayList<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(6,"Recurrent"));
        entries.add(new PieEntry(28,"Non-Recurrent"));




        ArrayList<PieEntry> entries1 = new ArrayList<>();
        entries1.add(new PieEntry(28,"NEC"));


        ArrayList<PieEntry> entries2 = new ArrayList<>();
        entries2.add(new PieEntry(28,"Multi"));



        ArrayList<PieEntry> entries3 = new ArrayList<>();
        entries3.add(new PieEntry(40,"Local"));
        entries3.add(new PieEntry(11,"SE"));
        entries3.add(new PieEntry(2,"Global"));
        PieDataSet dataSet = new PieDataSet(entries,"");
        PieData data= new PieData(dataSet);

        PieDataSet dataSet1 = new PieDataSet(entries1,"");
        PieData data1 = new PieData(dataSet1);

        PieDataSet dataSet2 = new PieDataSet(entries2,"");
        PieData data2 = new PieData(dataSet2);

        PieDataSet dataSet3 = new PieDataSet(entries3,"");
        PieData data3 = new PieData(dataSet3);



      //  dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        dataSet.setColors(ColorTemplate.VORDIPLOM_COLORS);


        dataSet.setSliceSpace(5f);
        dataSet.setValueTextSize(14f);
        nchart.setUsePercentValues(true);
        nchart.setDrawHoleEnabled(true);
        nchart.setData(data);

     //   dataSet.setColors(ColorTemplate.LIBERTY_COLORS);
       dataSet1.setColors(new int []{Color.BLUE,Color.YELLOW,Color.GREEN});
        dataSet1.setSliceSpace(5f);
        dataSet1.setValueTextSize(14f);
        nchart1.setUsePercentValues(true);
        nchart1.setDrawHoleEnabled(true);

        nchart1.setData(data1);
         dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
//        dataSet2.setColors(new int []{Color.BLUE,Color.YELLOW,Color.CYAN});
        dataSet2.setSliceSpace(5f);
        dataSet2.setValueTextSize(14f);
        nchart2.setUsePercentValues(true);
        nchart2.setDrawHoleEnabled(true);
        nchart2.setData(data2);

      //  dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
       dataSet3.setColors(new int []{Color.YELLOW,Color.GREEN,Color.CYAN});
        dataSet3.setSliceSpace(5f);
        dataSet3.setValueTextSize(14f);
        nchart3.setUsePercentValues(true);
        nchart3.setDrawHoleEnabled(true);
        nchart3.setData(data3);
        nchart3.invalidate();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, SecondActivity.class));
            }
        });

    }
}





// dataSet.setColors(ColorTemplate.VORDIPLOM_COLORS);
//
//         dataSet.setColors(ColorTemplate.JOYFUL_COLORS);