package com.example.grafikrechner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;

import java.util.Arrays;

public class Controller {

    public Label fullPolynom;
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

    double[] values = new double[6];
    public void initialize() {
        for (Spinner spinner : Arrays.asList(coefficient, coefficient1, coefficient2, coefficient3, coefficient4, coefficient5)) {
            spinner.getValueFactory().valueProperty().addListener(((observableValue, oldValue, newValue) -> {
                if (newValue != null) {
                    if (spinner == coefficient){
                        values[0] = (double) newValue;
                    } else if (spinner == coefficient1) {
                        values[1] = (double) newValue;
                    } else if (spinner == coefficient2) {
                        values[2] = (double) newValue;
                    } else if (spinner == coefficient3) {
                        values[3] = (double) newValue;
                    } else if (spinner == coefficient4) {
                        values[4] = (double) newValue;
                    } else if (spinner == coefficient5) {
                        values[5] = (double) newValue;
                    }

                    fullPolynom.setText(String.format("f(x) = %.1fx⁵ + %.1fx⁴ + %.1fx³ + %.1fx² + %.1fx + %.1f",
                            values[5], values[4], values[3], values[2], values[1], values[0]));
                }
            }));
        }
    }

    public void deleteInputs(ActionEvent actionEvent) {
        coefficient.getValueFactory().setValue(0.0);
        coefficient1.getValueFactory().setValue(0.0);
        coefficient2.getValueFactory().setValue(0.0);
        coefficient3.getValueFactory().setValue(0.0);
        coefficient4.getValueFactory().setValue(0.0);
        coefficient5.getValueFactory().setValue(0.0);
    }
}