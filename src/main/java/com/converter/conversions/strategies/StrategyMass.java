package com.converter.conversions.strategies;

import com.converter.conversions.interfaces.UnitMassConversions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StrategyMass {

    private static final Logger loggerStratMass = LogManager.getLogger(StrategyMass.class);

    private UnitMassConversions unitMassConversions;

    public StrategyMass(UnitMassConversions unitMassConversions){
        loggerStratMass.trace("Constructor of StrategyMass");
        this.unitMassConversions = unitMassConversions;
    }

    public void executeStrategy(){
        loggerStratMass.trace("Executing StrategyMass");
        unitMassConversions.convert();
    }

}
