package com.converter.conversions.temperature;

import com.converter.ConverterView;
import com.converter.conversions.interfaces.UnitTemperatureConversions;
import com.converter.views.TemperatureView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;

import static com.converter.conversions.interfaces.UnitMassConversions.loggerUnitMassConv;

public class ConvertFromKelvin implements UnitTemperatureConversions {

    private static final Logger loggerKelvin = LogManager.getLogger(ConvertFromKelvin.class);

    @Override
    public double[] convert() {
        double value = 0, valueCelsius, valueKelvin, valueFahrenheit, valueRankine;
        try{
            value = Double.parseDouble(getTextField().getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(ConverterView.getConverterView().getFrame(), "Invalid input. Try again!");
            loggerUnitMassConv.error("Invalid input. Try again!" + e);
        }
        valueCelsius = value - 273;
        valueKelvin = 1 * value;
        valueFahrenheit = (9*(value-273)/5)+32;
        valueRankine =  9*value/5;
        loggerKelvin.trace("Inside convert method, class ConvertFromKelvin");
        return new double[] {valueCelsius, valueKelvin, valueFahrenheit, valueRankine};
    }

    @Override
    public JTextField getTextField() {
        loggerKelvin.trace("Inside getTextField method, class ConvertFromKelvin");
        return TemperatureView.getTempView().getTextFieldKelvin();
    }

}
