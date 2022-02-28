package com.converter.conversions.currency;

import com.converter.conversions.interfaces.UnitCurrencyConversion;
import com.converter.conversions.tools.CurrencyValues;
import com.converter.views.CurrencyView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import javax.swing.*;
import java.io.IOException;

public class ConvertFromPLN implements UnitCurrencyConversion {

    Logger PLNLogger = (Logger) LogManager.getLogger("ConvertFromPLNLogger");

    @Override
    public JTextField getTextField() {
        PLNLogger.trace("Inside getTextField class ConvertFromPLN");
        return CurrencyView.getCurrView().getTextFieldPLN();
    }

    @Override
    public double getPLNCoeff(){
        PLNLogger.trace("Inside getPLNCoeff method, class ConvertFromPLN");
        return 1;
    }

    @Override
    public double getUSDCoeff() throws IOException {
        PLNLogger.trace("Inside getUSDCoeff method, class ConvertFromPLN");
        return (1/ CurrencyValues.getCurrencyValues().get("dolar amerykański"));
    }

    @Override
    public double getEURCoeff() throws IOException {
        PLNLogger.trace("Inside getEURCoeff method, class ConvertFromPLN");
        return (1/CurrencyValues.getCurrencyValues().get("euro"));
    }

    @Override
    public double getGBPCoeff() throws IOException {
        PLNLogger.trace("Inside getGBPCoeff method, class ConvertFromPLN");
        return (1/CurrencyValues.getCurrencyValues().get("funt szterling"));
    }

    @Override
    public double getJPYCoeff() throws IOException {
        PLNLogger.trace("Inside getJPYCoeff method, class ConvertFromPLN");
        return (100/CurrencyValues.getCurrencyValues().get("jen (Japonia)"));
    }
}
