package com.converter.conversions.strategies;

import com.converter.conversions.interfaces.UnitCurrencyConversion;
import com.converter.conversions.mass.ConvertFromGram;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class StrategyCurrency {

    private static final Logger loggerStratCurr = LogManager.getLogger(StrategyCurrency.class);

    private UnitCurrencyConversion unitCurrencyConversion;

    public StrategyCurrency(UnitCurrencyConversion unitCurrencyConversion){
        loggerStratCurr.trace("Constructor of StrategyCurrency");
        this.unitCurrencyConversion = unitCurrencyConversion;
    }

    public void executeStrategy() throws IOException {
        loggerStratCurr.trace("Executing StrategyCurrency");
        unitCurrencyConversion.convert();
    }
}
