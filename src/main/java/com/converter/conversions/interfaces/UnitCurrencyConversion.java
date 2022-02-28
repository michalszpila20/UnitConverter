package com.converter.conversions.interfaces;

import com.converter.views.CurrencyView;

import javax.swing.*;
import java.io.IOException;

public interface UnitCurrencyConversion {

    default void convert() throws IOException {
        double value, valuePLN, valueUSD, valueEUR, valueGBP, valueJPY;
        value = Double.parseDouble(getTextField().getText());
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
