package com.converter.conversions.interfaces;

import com.converter.ConverterView;
import com.converter.views.CurrencyView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.io.IOException;

import static com.converter.conversions.interfaces.UnitMassConversions.loggerUnitMassConv;

public interface UnitCurrencyConversion {

    default void convert() throws IOException {
        double value = 0, valuePLN, valueUSD, valueEUR, valueGBP, valueJPY;
        try{
            value = Double.parseDouble(getTextField().getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(ConverterView.getConverterView().getFrame(), "Invalid input. Try again!");
            loggerUnitMassConv.error("Invalid input. Try again!" + e);
        }

        valuePLN = getPLNCoeff() * value;
        valueUSD = getUSDCoeff() * value;
        valueEUR = getEURCoeff() * value;
        valueGBP = getGBPCoeff() * value;
        valueJPY = getJPYCoeff() * value;

        CurrencyView.getCurrView().getTextFieldPLN().setText(Double.toString(valuePLN));
        CurrencyView.getCurrView().getTextFieldUSD().setText(Double.toString(valueUSD));
        CurrencyView.getCurrView().getTextFieldEUR().setText(Double.toString(valueEUR));
        CurrencyView.getCurrView().getTextFieldGBP().setText(Double.toString(valueGBP));
        CurrencyView.getCurrView().getTextFieldJPY().setText(Double.toString(valueJPY));
    }
    JTextField getTextField();

    double getPLNCoeff() throws IOException;
    double getUSDCoeff() throws IOException;
    double getEURCoeff() throws IOException;
    double getGBPCoeff() throws IOException;
    double getJPYCoeff() throws IOException;
}
