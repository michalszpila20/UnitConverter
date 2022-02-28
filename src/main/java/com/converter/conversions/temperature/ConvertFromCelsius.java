package com.converter.conversions.temperature;

import com.converter.ConverterView;
import com.converter.conversions.interfaces.UnitTemperatureConversions;
import com.converter.views.TemperatureView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;

import static com.converter.conversions.interfaces.UnitMassConversions.loggerUnitMassConv;

public class ConvertFromCelsius implements UnitTemperatureConversions {

    private static final Logger loggerCelsius = LogManager.getLogger(ConvertFromCelsius.class);

    @Override
    public double[] convert() {
        double value = 0, valueCelsius, valueKelvin, valueFahrenheit, valueRankine;
        try{
            value = Double.parseDouble(getTextField().getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(ConverterView.getConverterView().getFrame(), "Invalid input. Try again!");
            loggerUnitMassConv.error("Invalid input. Try again!" + e);
        }

        valueCelsius = 1 * value;
        valueKelvin = value + 273;
        valueFahrenheit = (value * 1.8) + 32;
        valueRankine = 9 * (273.15 + value)/5;
        loggerCelsius.trace("Inside convert method, class ConvertFromCelsius");
        return new double[] {valueCelsius, valueKelvin, valueFahrenheit, valueRankine};
    }

    @Override
    public JTextField getTextField() {
        loggerCelsius.trace("Inside getTextField method, class ConvertFromCelsius");
        return TemperatureView.getTempView().getTextFieldCelsius();
    }
}
