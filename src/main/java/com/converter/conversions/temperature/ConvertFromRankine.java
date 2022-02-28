package com.converter.conversions.temperature;

import com.converter.ConverterView;
import com.converter.conversions.interfaces.UnitTemperatureConversions;
import com.converter.views.TemperatureView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;

import static com.converter.conversions.interfaces.UnitMassConversions.loggerUnitMassConv;

public class ConvertFromRankine implements UnitTemperatureConversions {

    private static final Logger loggerRankine = LogManager.getLogger(ConvertFromRankine.class);

    @Override
    public double[] convert() {
        double value = 0, valueCelsius, valueKelvin, valueFahrenheit, valueRankine;
        try{
            value = Double.parseDouble(getTextField().getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(ConverterView.getConverterView().getFrame(), "Invalid input. Try again!");
            loggerUnitMassConv.error("Invalid input. Try again!" + e);
        }
        valueCelsius = 5*(value - 491.67)/9 ;
        valueKelvin = 5* value/9;
        valueFahrenheit = value - 459.67;
        valueRankine =  1 * value;
        loggerRankine.trace("Inside convert method, class ConvertFromRankine");
        return new double[] {valueCelsius, valueKelvin, valueFahrenheit, valueRankine};
    }

    @Override
    public JTextField getTextField() {
        loggerRankine.trace("Inside getTextField method, class ConvertFromRankine");
        return TemperatureView.getTempView().getTextFieldRankine();
    }
}
