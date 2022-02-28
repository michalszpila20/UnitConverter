package com.converter.conversions.temperature;

import com.converter.ConverterView;
import com.converter.conversions.interfaces.UnitTemperatureConversions;
import com.converter.views.TemperatureView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;

import static com.converter.conversions.interfaces.UnitMassConversions.loggerUnitMassConv;

public class ConvertFromFahrenheit implements UnitTemperatureConversions {

    private static final Logger loggerFahrenheit = LogManager.getLogger(ConvertFromFahrenheit.class);

    @Override
    public double[] convert() {
        double value = 0, valueCelsius, valueKelvin, valueFahrenheit, valueRankine;
        try{
            value = Double.parseDouble(getTextField().getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(ConverterView.getConverterView().getFrame(), "Invalid input. Try again!");
            loggerUnitMassConv.error("Invalid input. Try again!" + e);
        }
        valueCelsius = 5*(value-32)/9;
        valueKelvin = (5*(value-32)/9)+273;
        valueFahrenheit = 1* value;
        valueRankine = value + 459.67;
        loggerFahrenheit.trace("Inside convert method, class ConvertFromFahrenheit");
        return new double[] {valueCelsius, valueKelvin, valueFahrenheit, valueRankine};
    }

    @Override
    public JTextField getTextField() {
        loggerFahrenheit.trace("Inside getTextField method, class ConvertFromFahrenheit");
        return TemperatureView.getTempView().getTextFieldFahrenheit();
    }
}
