package com.converter.conversions.currency;

import com.converter.conversions.interfaces.UnitCurrencyConversion;
import com.converter.conversions.tools.CurrencyValues;
import com.converter.views.CurrencyView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.io.IOException;

public class ConvertFromJPY implements UnitCurrencyConversion {

    private static final Logger loggerJPY = LogManager.getLogger(ConvertFromJPY.class);

    @Override
    public JTextField getTextField() {
        loggerJPY.trace("Inside getTextField class ConvertFromJPY");
        return CurrencyView.getCurrView().getTextFieldJPY();
    }

    @Override
    public double getPLNCoeff() throws IOException {
        loggerJPY.trace("Inside getPLNCoeff method, class ConvertFromJPY");
        return CurrencyValues.getCurrencyValues().get("jen (Japonia)")/100;
    }

    @Override
    public double getUSDCoeff() throws IOException {
        loggerJPY.trace("Inside getUSDCoeff method, class ConvertFromJPY");
        return CurrencyValues.getCurrencyValues().get("jen (Japonia)")/
                CurrencyValues.getCurrencyValues().get("dolar amerykański")/100;
    }

    @Override
    public double getEURCoeff() throws IOException {
        loggerJPY.trace("Inside getEURCoeff method, class ConvertFromJPY");
        return CurrencyValues.getCurrencyValues().get("jen (Japonia)")/
                CurrencyValues.getCurrencyValues().get("euro")/100;
    }

    @Override
    public double getGBPCoeff() throws IOException {
        loggerJPY.trace("Inside getGBPCoeff method, class ConvertFromJPY");
        return CurrencyValues.getCurrencyValues().get("jen (Japonia)")/
                CurrencyValues.getCurrencyValues().get("funt szterling")/100;
    }

    @Override
    public double getJPYCoeff(){
        loggerJPY.trace("Inside getJPYCoeff method, class ConvertFromJPY");
        return 1;
    }
}
