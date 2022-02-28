package com.converter.conversions.tools;

import com.converter.views.CurrencyView;
import com.converter.views.MassView;
import com.converter.views.TemperatureView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class CleanUp {

    static Logger CleanUpLogger = (Logger) LogManager.getLogger("CleanUpLogger");

    public static void clearFirstPanel() {
        MassView.getMassView().getTextFieldKg().setText("");
        MassView.getMassView().getTextFieldLbs().setText("");
        MassView.getMassView().getTextFieldOunce().setText("");
        MassView.getMassView().getTextFieldGram().setText("");
        MassView.getMassView().getTextFieldTon().setText("");
        CleanUpLogger.trace("Cleared all TextFields in the first panel");
    }

    public static void clearSecondPanel() {
        CurrencyView.getCurrView().getTextFieldPLN().setText("");
        CurrencyView.getCurrView().getTextFieldUSD().setText("");
        CurrencyView.getCurrView().getTextFieldEUR().setText("");
        CurrencyView.getCurrView().getTextFieldGBP().setText("");
        CurrencyView.getCurrView().getTextFieldJPY().setText("");
        CleanUpLogger.trace("Cleared all TextFields in the second panel");
    }

    public static void clearThirdPanel() {
        TemperatureView.getTempView().getTextFieldCelsius().setText("");
        TemperatureView.getTempView().getTextFieldKelvin().setText("");
        TemperatureView.getTempView().getTextFieldFahrenheit().setText("");
        TemperatureView.getTempView().getTextFieldRankine().setText("");
        CleanUpLogger.trace("Cleared all TextFields in the third panel");
    }
}
