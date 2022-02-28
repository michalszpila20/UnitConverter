package com.converter.conversions.strategies;

import com.converter.conversions.interfaces.UnitCurrencyConversion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.io.IOException;

public class StrategyCurrency {

    Logger StrategyCurrLogger = (Logger) LogManager.getLogger("StrategyCurrencyLogger");

    private UnitCurrencyConversion unitCurrencyConversion;

    public StrategyCurrency(UnitCurrencyConversion unitCurrencyConversion){
        StrategyCurrLogger.trace("Constructor of StrategyCurrency");
        this.unitCurrencyConversion = unitCurrencyConversion;
    }

    public void executeStrategy() throws IOException {
        StrategyCurrLogger.trace("Executing StrategyCurrency");
        unitCurrencyConversion.convert();
    }
}
