package com.converter.conversions.currency;

import com.converter.Converter;
import com.converter.conversions.interfaces.UnitCurrencyConversion;
import com.converter.conversions.tools.CurrencyValues;
import com.converter.views.CurrencyView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import javax.swing.*;
import java.io.IOException;


public class ConvertFromEUR implements UnitCurrencyConversion {

    private static final Logger loggerEUR = LogManager.getLogger(ConvertFromEUR.class);

    @Override
    public JTextField getTextField() {
        loggerEUR.trace("Inside getTextField class ConvertFromEUR");
        return CurrencyView.getCurrView().getTextFieldEUR();
    }

    @Override
    public double getPLNCoeff() throws IOException {
        loggerEUR.trace("Inside getPLNCoeff method, class ConvertFromEUR");
        return CurrencyValues.getCurrencyValues().get("euro");
    }

    @Override
    public double getUSDCoeff() throws IOException {
        loggerEUR.trace("Inside getUSDCoeff method, class ConvertFromEUR");
        return CurrencyValues.getCurrencyValues().get("euro")/CurrencyValues.getCurrencyValues().get("dolar amerykański");
    }

    @Override
    public double getEURCoeff(){
        loggerEUR.trace("Inside getEURCoeff method, class ConvertFromEUR");
        return 1;
    }

    @Override
    public double getGBPCoeff() throws IOException {
        loggerEUR.trace("Inside getGBPCoeff method, class ConvertFromEUR");
        return CurrencyValues.getCurrencyValues().get("euro")/CurrencyValues.getCurrencyValues().get("funt szterling");
    }

    @Override
    public double getJPYCoeff() throws IOException {
        loggerEUR.trace("Inside getJPYCoeff method, class ConvertFromEUR");
        return 100 * CurrencyValues.getCurrencyValues().get("euro")/CurrencyValues.getCurrencyValues().get("jen (Japonia)");
    }
}
