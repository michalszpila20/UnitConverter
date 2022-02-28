package com.converter.conversions.temperature;

import com.converter.conversions.interfaces.UnitTemperatureConversions;
import com.converter.views.TemperatureView;

import javax.swing.*;

public class ConvertFromCelsius implements UnitTemperatureConversions {

    @Override
    public double[] convert() {
        double value, valueCelsius, valueKelvin, valueFahrenheit, valueRankine;
        value = Double.parseDouble(getTextField().getText());
        valueCelsius = 1 * value;
        valueKelvin = value + 273;
        valueFahrenheit = (value * 1.8) + 32;
        valueRankine = 9 * (273.15 + value)/5;
        return new double[] {valueCelsius, valueKelvin, valueFahrenheit, valueRankine};
    }

    @Override
    public JTextField getTextField() {
        return TemperatureView.getTempView().getTextFieldCelsius();
    }
}
