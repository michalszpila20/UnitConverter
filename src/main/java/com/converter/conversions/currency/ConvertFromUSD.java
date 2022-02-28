package com.converter.conversions.currency;

import com.converter.conversions.interfaces.UnitCurrencyConversion;
import com.converter.conversions.tools.CurrencyValues;
import com.converter.views.CurrencyView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.io.IOException;

public class ConvertFromUSD implements UnitCurrencyConversion {

    private static final Logger loggerUSD = LogManager.getLogger(ConvertFromUSD.class);

    @Override
    public JTextField getTextField() {
        loggerUSD.trace("Inside getTextField class ConvertFromUSD");
        return CurrencyView.getCurrView().getTextFieldUSD();
    }

    @Override
    public double getPLNCoeff() throws IOException {
        loggerUSD.trace("Inside getPLNCoeff method, class ConvertFromUSD");
        return CurrencyValues.getCurrencyValues().get("dolar amerykański");
    }

    @Override
    public double getUSDCoeff(){
        loggerUSD.trace("Inside getUSDCoeff method, class ConvertFromUSD");
        return 1;
    }

    @Override
    public double getEURCoeff() throws IOException {
        loggerUSD.trace("Inside getEURCoeff method, class ConvertFromUSD");
        return CurrencyValues.getCurrencyValues().get("dolar amerykański")/CurrencyValues.getCurrencyValues().get("euro");
    }

    @Override
    public double getGBPCoeff() throws IOException {
        loggerUSD.trace("Inside getGBPCoeff method, class ConvertFromUSD");
        return CurrencyValues.getCurrencyValues().get("dolar amerykański")/CurrencyValues.getCurrencyValues().get("funt szterling");
    }

    @Override
    public double getJPYCoeff() throws IOException {
        loggerUSD.trace("Inside getJPYCoeff method, class ConvertFromUSD");
        return 100 * (CurrencyValues.getCurrencyValues().get("dolar amerykański")/CurrencyValues.getCurrencyValues().get("jen (Japonia)"));
    }
}
