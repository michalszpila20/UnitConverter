package com.converter.conversions.strategies;

import com.converter.conversions.interfaces.UnitTemperatureConversions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StrategyTemp {

    private static final Logger loggerStratTemp = LogManager.getLogger(StrategyTemp.class);

    private UnitTemperatureConversions unitTemperatureConversions;

    public StrategyTemp(UnitTemperatureConversions unitTemperatureConversions){
        loggerStratTemp.trace("Constructor of StrategyTemp");
        this.unitTemperatureConversions = unitTemperatureConversions;
    }

    public void executeStrategy(){
        loggerStratTemp.trace("Executing StrategyTemp");
        unitTemperatureConversions.setTextFields(unitTemperatureConversions.convert());
    }

}
