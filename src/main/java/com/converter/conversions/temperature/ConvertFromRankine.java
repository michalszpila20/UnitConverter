package com.converter.conversions.temperature;

import com.converter.conversions.interfaces.UnitTemperatureConversions;
import com.converter.views.TemperatureView;

import javax.swing.*;

public class ConvertFromRankine implements UnitTemperatureConversions {

    @Override
    public double[] convert() {
        double value, valueCelsius, valueKelvin, valueFahrenheit, valueRankine;
        value = Double.parseDouble(getTextField().getText());
        valueCelsius = 5*(value - 491.67)/9 ;
        valueKelvin = 5* value/9;
        valueFahrenheit = value - 459.67;
        valueRankine =  1 * value;
        return new double[] {valueCelsius, valueKelvin, valueFahrenheit, valueRankine};
    }

    @Override
    public JTextField getTextField() {
        return TemperatureView.getTempView().getTextFieldRankine();
    }
}
