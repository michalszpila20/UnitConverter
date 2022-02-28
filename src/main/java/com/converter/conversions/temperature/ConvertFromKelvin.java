package com.converter.conversions.temperature;

import com.converter.conversions.interfaces.UnitTemperatureConversions;
import com.converter.views.TemperatureView;

import javax.swing.*;

public class ConvertFromKelvin implements UnitTemperatureConversions {

    @Override
    public double[] convert() {
        double value, valueCelsius, valueKelvin, valueFahrenheit, valueRankine;
        value = Double.parseDouble(getTextField().getText());
        valueCelsius = value - 273;
        valueKelvin = 1 * value;
        valueFahrenheit = (9*(value-273)/5)+32;
        valueRankine =  9*value/5;
        return new double[] {valueCelsius, valueKelvin, valueFahrenheit, valueRankine};
    }

    @Override
    public JTextField getTextField() {
        return TemperatureView.getTempView().getTextFieldKelvin();
    }

}
