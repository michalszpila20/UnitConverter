package com.converter.conversions.currency;

import com.converter.conversions.interfaces.UnitCurrencyConversion;
import com.converter.conversions.tools.CurrencyValues;
import com.converter.views.CurrencyView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import javax.swing.*;
import java.io.IOException;

public class ConvertFromJPY implements UnitCurrencyConversion {

    Logger JPYLogger = (Logger) LogManager.getLogger("ConvertFromJPYLogger");

    @Override
    public JTextField getTextField() {
        JPYLogger.trace("Inside getTextField class ConvertFromJPY");
        return CurrencyView.getCurrView().getTextFieldJPY();
    }

    @Override
    public double getPLNCoeff() throws IOException {
        JPYLogger.trace("Inside getPLNCoeff method, class ConvertFromJPY");
        return CurrencyValues.getCurrencyValues().get("jen (Japonia)")/100;
    }

    @Override
    public double getUSDCoeff() throws IOException {
        JPYLogger.trace("Inside getUSDCoeff method, class ConvertFromJPY");
        return CurrencyValues.getCurrencyValues().get("jen (Japonia)")/CurrencyValues.getCurrencyValues().get("dolar amerykański")/100;
    }

    @Override
    public double getEURCoeff() throws IOException {
        JPYLogger.trace("Inside getEURCoeff method, class ConvertFromJPY");
        return CurrencyValues.getCurrencyValues().get("jen (Japonia)")/CurrencyValues.getCurrencyValues().get("euro")/100;
    }

    @Override
    public double getGBPCoeff() throws IOException {
        JPYLogger.trace("Inside getGBPCoeff method, class ConvertFromJPY");
        return CurrencyValues.getCurrencyValues().get("jen (Japonia)")/CurrencyValues.getCurrencyValues().get("funt szterling")/100;
    }

    @Override
    public double getJPYCoeff(){
        JPYLogger.trace("Inside getJPYCoeff method, class ConvertFromJPY");
        return 1;
    }
}
