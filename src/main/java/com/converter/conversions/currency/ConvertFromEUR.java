package com.converter.conversions.currency;

import com.converter.conversions.interfaces.UnitCurrencyConversion;
import com.converter.conversions.tools.CurrencyValues;
import com.converter.views.CurrencyView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import javax.swing.*;
import java.io.IOException;


public class ConvertFromEUR implements UnitCurrencyConversion {

    Logger EURLogger = LogManager.getLogger("ConvertFromEURLogger");

    @Override
    public JTextField getTextField() {
        EURLogger.trace("Inside getTextField class ConvertFromEUR");
        return CurrencyView.getCurrView().getTextFieldEUR();
    }

    @Override
    public double getPLNCoeff() throws IOException {
        EURLogger.trace("Inside getPLNCoeff method, class ConvertFromEUR");
        return CurrencyValues.getCurrencyValues().get("euro");
    }

    @Override
    public double getUSDCoeff() throws IOException {
        EURLogger.trace("Inside getUSDCoeff method, class ConvertFromEUR");
        return CurrencyValues.getCurrencyValues().get("euro")/CurrencyValues.getCurrencyValues().get("dolar amerykański");
    }

    @Override
    public double getEURCoeff(){
        EURLogger.trace("Inside getEURCoeff method, class ConvertFromEUR");
        return 1;
    }

    @Override
    public double getGBPCoeff() throws IOException {
        EURLogger.trace("Inside getGBPCoeff method, class ConvertFromEUR");
        return CurrencyValues.getCurrencyValues().get("euro")/CurrencyValues.getCurrencyValues().get("funt szterling");
    }

    @Override
    public double getJPYCoeff() throws IOException {
        EURLogger.trace("Inside getJPYCoeff method, class ConvertFromEUR");
        return 100 * CurrencyValues.getCurrencyValues().get("euro")/CurrencyValues.getCurrencyValues().get("jen (Japonia)");
    }
}
