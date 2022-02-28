package com.converter.conversions.currency;

import com.converter.conversions.interfaces.UnitCurrencyConversion;
import com.converter.conversions.tools.CurrencyValues;
import com.converter.views.CurrencyView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import javax.swing.*;
import java.io.IOException;

public class ConvertFromGBP implements UnitCurrencyConversion {

    Logger GBPLogger = (Logger) LogManager.getLogger("ConvertFromGBPLogger");

    @Override
    public JTextField getTextField() {
        GBPLogger.trace("Inside getTextField class ConvertFromGBP");
        return CurrencyView.getCurrView().getTextFieldGBP();
    }

    @Override
    public double getPLNCoeff() throws IOException {
        GBPLogger.trace("Inside getPLNCoeff method, class ConvertFromGBP");
        return CurrencyValues.getCurrencyValues().get("funt szterling");
    }

    @Override
    public double getUSDCoeff() throws IOException {
        GBPLogger.trace("Inside getUSDCoeff method, class ConvertFromGBP");
        return CurrencyValues.getCurrencyValues().get("funt szterling")/CurrencyValues.getCurrencyValues().get("dolar amerykański");
    }

    @Override
    public double getEURCoeff() throws IOException {
        GBPLogger.trace("Inside getEURCoeff method, class ConvertFromGBP");
        return CurrencyValues.getCurrencyValues().get("funt szterling")/CurrencyValues.getCurrencyValues().get("euro");
    }

    @Override
    public double getGBPCoeff(){
        GBPLogger.trace("Inside getGBPCoeff method, class ConvertFromGBP");
        return 1;
    }

    @Override
    public double getJPYCoeff() throws IOException {
        GBPLogger.trace("Inside getJPYCoeff method, class ConvertFromGBP");
        return 100 * CurrencyValues.getCurrencyValues().get("funt szterling")/CurrencyValues.getCurrencyValues().get("jen (Japonia)");
    }
}
