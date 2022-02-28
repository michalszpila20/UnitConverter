package com.converter.conversions.strategies;

import com.converter.conversions.interfaces.UnitTemperatureConversions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class StrategyTemp {

    Logger StrategyTempLogger = (Logger) LogManager.getLogger("StrategyTempLogger");

    private UnitTemperatureConversions unitTemperatureConversions;

    public StrategyTemp(UnitTemperatureConversions unitTemperatureConversions){
        StrategyTempLogger.trace("Constructor of StrategyTemp");
        this.unitTemperatureConversions = unitTemperatureConversions;
    }

    public void executeStrategy(){
        StrategyTempLogger.trace("Executing StrategyTemp");
        unitTemperatureConversions.setTextFields(unitTemperatureConversions.convert());
    }

}
