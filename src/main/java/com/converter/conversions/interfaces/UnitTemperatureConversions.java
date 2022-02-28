package com.converter.conversions.interfaces;

import com.converter.views.TemperatureView;

import javax.swing.*;

public interface UnitTemperatureConversions {

    double[] convert();

    default void setTextFields(double[] args) {
        TemperatureView.getTempView().getTextFieldCelsius().setText(Double.toString(args[0]));
        TemperatureView.getTempView().getTextFieldKelvin().setText(Double.toString(args[1]));
        TemperatureView.getTempView().getTextFieldFahrenheit().setText(Double.toString(args[2]));
        TemperatureView.getTempView().getTextFieldRankine().setText(Double.toString(args[3]));
    }

    JTextField getTextField();
}
