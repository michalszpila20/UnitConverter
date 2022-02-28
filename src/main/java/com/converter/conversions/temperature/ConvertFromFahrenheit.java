package com.converter.conversions.temperature;

import com.converter.conversions.interfaces.UnitTemperatureConversions;
import com.converter.views.TemperatureView;

import javax.swing.*;

public class ConvertFromFahrenheit implements UnitTemperatureConversions {

    @Override
    public double[] convert() {
        double value, valueCelsius, valueKelvin, valueFahrenheit, valueRankine;
        value = Double.parseDouble(getTextField().getText());
        valueCelsius = 5*(value-32)/9;
        valueKelvin = (5*(value-32)/9)+273;
        valueFahrenheit = 1* value;
        valueRankine = value + 459.67;
        return new double[] {valueCelsius, valueKelvin, valueFahrenheit, valueRankine};
    }

    @Override
    public JTextField getTextField() {
        return TemperatureView.getTempView().getTextFieldFahrenheit();
    }
}
