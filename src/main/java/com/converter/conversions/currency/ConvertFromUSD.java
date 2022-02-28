package com.converter.conversions.currency;

import com.converter.conversions.interfaces.UnitCurrencyConversion;
import com.converter.conversions.tools.CurrencyValues;
import com.converter.views.CurrencyView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import javax.swing.*;
import java.io.IOException;

public class ConvertFromUSD implements UnitCurrencyConversion {

    Logger USDLogger = (Logger) LogManager.getLogger("ConvertFromUSDLogger");

    @Override
    public JTextField getTextField() {
        USDLogger.trace("Inside getTextField class ConvertFromUSD");
        return CurrencyView.getCurrView().getTextFieldUSD();
    }

    @Override
    public double getPLNCoeff() throws IOException {
        USDLogger.trace("Inside getPLNCoeff method, class ConvertFromUSD");
        return CurrencyValues.getCurrencyValues().get("dolar amerykański");
    }

    @Override
    public double getUSDCoeff(){
        USDLogger.trace("Inside getUSDCoeff method, class ConvertFromUSD");
        return 1;
    }

    @Override
    public double getEURCoeff() throws IOException {
        USDLogger.trace("Inside getEURCoeff method, class ConvertFromUSD");
        return CurrencyValues.getCurrencyValues().get("dolar amerykański")/CurrencyValues.getCurrencyValues().get("euro");
    }

    @Override
    public double getGBPCoeff() throws IOException {
        USDLogger.trace("Inside getGBPCoeff method, class ConvertFromUSD");
        return CurrencyValues.getCurrencyValues().get("dolar amerykański")/CurrencyValues.getCurrencyValues().get("funt szterling");
    }

    @Override
    public double getJPYCoeff() throws IOException {
        USDLogger.trace("Inside getJPYCoeff method, class ConvertFromUSD");
        return 100 * (CurrencyValues.getCurrencyValues().get("dolar amerykański")/CurrencyValues.getCurrencyValues().get("jen (Japonia)"));
    }
}
