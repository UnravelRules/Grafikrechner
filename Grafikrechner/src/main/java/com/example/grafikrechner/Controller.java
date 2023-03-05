package com.example.grafikrechner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class Controller {

    @FXML
    Spinner<Double> coefficient;
    @FXML
    Spinner<Double> coefficient1;
    @FXML
    Spinner<Double> coefficient2;
    @FXML
    Spinner<Double> coefficient3;
    @FXML
    Spinner<Double> coefficient4;
    @FXML
    Spinner<Double> coefficient5;

    ArrayList<Double> values = new ArrayList<>();
    public void initialize() {
        for (Spinner spinner : Arrays.asList(coefficient, coefficient1, coefficient2, coefficient3, coefficient4, coefficient5)) {
            spinner.getValueFactory().valueProperty().addListener(((observableValue, oldValue, newValue) -> {
                if (newValue != null) {
                    values.remove(oldValue);
                    values.add((Double) newValue);
                    System.out.println("Spinner value changed from " + oldValue + " to " + newValue);
                    System.out.println(values);
                }
            }));
        }
    }

    public void deleteInputs(ActionEvent actionEvent) {

    }
    /*public void drawPoly() {
        // Define the x-axis and y-axis ranges
        NumberAxis xAxis = new NumberAxis(-10, 10, 0.1);
        NumberAxis yAxis = new NumberAxis();

        // Create a line chart with the x-axis and y-axis
        LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);
        chart.setTitle("Polynomial of degree 5");

        // Create a series to hold the x- and y-values
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Polynomial");

        // Define the coefficients for the polynomial
        double a = 1.0;
        double b = -2.0;
        double c = 3.0;
        double d = -4.0;
        double e = 5.0;
        double f = 6.0;

        // Calculate the y-values for each x-value and add them to the series
        for (double x = -10; x <= 10; x += 0.1) {
            double y = a * Math.pow(x, 5) + b * Math.pow(x, 4) + c * Math.pow(x, 3) + d * Math.pow(x, 2) + e * x + f;
            polynomialSeries.getData().add(new XYChart.Data<>(x, y));
        }
    }*/
}