/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nrw.charts;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 *
 * @author Kadzitaye.m
 */
public class LineChartDrawer {
    
    public LineChart<Number, Number> DrawLineChart() {
        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Apparent losses (M^3/Y)");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Cost (MWK)");

        LineChart lineChart = new LineChart(xAxis, yAxis);

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("2023");

        dataSeries1.getData().add(new XYChart.Data( 1, 567));
        dataSeries1.getData().add(new XYChart.Data( 5, 612));
        dataSeries1.getData().add(new XYChart.Data(10, 800));
        dataSeries1.getData().add(new XYChart.Data(20, 780));
        dataSeries1.getData().add(new XYChart.Data(40, 810));
        dataSeries1.getData().add(new XYChart.Data(80, 850));
        
        XYChart.Series dataSeries2 = new XYChart.Series();
        dataSeries2.setName("2024");
        
        dataSeries2.getData().add(new XYChart.Data( 10, 567));
        dataSeries2.getData().add(new XYChart.Data( 15, 612));
        dataSeries2.getData().add(new XYChart.Data(12, 800));
        dataSeries2.getData().add(new XYChart.Data(22, 780));
        dataSeries2.getData().add(new XYChart.Data(42, 810));
        dataSeries2.getData().add(new XYChart.Data(75, 850));

        lineChart.getData().add(dataSeries1);
        lineChart.getData().add(dataSeries2);
        
        return lineChart;
    }

}
