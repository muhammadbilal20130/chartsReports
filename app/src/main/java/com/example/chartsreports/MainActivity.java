package com.example.chartsreports;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pie pie= AnyChart.pie();
        List<DataEntry> data=new ArrayList<>();
        data.add(new ValueDataEntry("Monday",3000));
        data.add(new ValueDataEntry("Tuesday",4500));
        data.add(new ValueDataEntry("Wednesday",2000));
        data.add(new ValueDataEntry("Thursday",7000));

        pie.data(data);
        AnyChartView anyChartView=findViewById(R.id.any_chart_view);
        anyChartView.setChart(pie);

    }
}