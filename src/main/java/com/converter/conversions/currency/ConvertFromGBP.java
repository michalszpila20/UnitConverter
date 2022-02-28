package com.converter.conversions.currency;

import com.converter.conversions.interfaces.UnitCurrencyConversion;
import com.converter.conversions.tools.CurrencyValues;
import com.converter.views.CurrencyView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.io.IOException;

public class ConvertFromGBP implements UnitCurrencyConversion {

    private static final Logger loggerGBP = LogManager.getLogger(ConvertFromGBP.class);

    @Override
    public JTextField getTextField() {
        loggerGBP.trace("Inside getTextField class ConvertFromGBP");
        return CurrencyView.getCurrView().getTextFieldGBP();
    }

    @Override
    public double getPLNCoeff() throws IOException {
        loggerGBP.trace("Inside getPLNCoeff method, class ConvertFromGBP");
        return CurrencyValues.getCurrencyValues().get("funt szterling");
    }

    @Override
    public double getUSDCoeff() throws IOException {
        loggerGBP.trace("Inside getUSDCoeff method, class ConvertFromGBP");
        return CurrencyValues.getCurrencyValues().get("funt szterling")/CurrencyValues.getCurrencyValues().get("dolar amerykański");
    }

    @Override
    public double getEURCoeff() throws IOException {
        loggerGBP.trace("Inside getEURCoeff method, class ConvertFromGBP");
        return CurrencyValues.getCurrencyValues().get("funt szterling")/CurrencyValues.getCurrencyValues().get("euro");
    }

    @Override
    public double getGBPCoeff(){
        loggerGBP.trace("Inside getGBPCoeff method, class ConvertFromGBP");
        return 1;
    }

    @Override
    public double getJPYCoeff() throws IOException {
        loggerGBP.trace("Inside getJPYCoeff method, class ConvertFromGBP");
        return 100 * CurrencyValues.getCurrencyValues().get("funt szterling")/CurrencyValues.getCurrencyValues().get("jen (Japonia)");
    }
}
