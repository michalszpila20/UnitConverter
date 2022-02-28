package com.converter.conversions.strategies;

import com.converter.conversions.interfaces.UnitMassConversions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class StrategyMass {

    Logger StrategyMassLogger = (Logger) LogManager.getLogger("StrategyMassLogger");
    private UnitMassConversions unitMassConversions;

    public StrategyMass(UnitMassConversions unitMassConversions){
        StrategyMassLogger.trace("Constructor of StrategyMass");
        this.unitMassConversions = unitMassConversions;
    }

    public void executeStrategy(){
        StrategyMassLogger.trace("Executing StrategyMass");
        unitMassConversions.convert();
    }

}
