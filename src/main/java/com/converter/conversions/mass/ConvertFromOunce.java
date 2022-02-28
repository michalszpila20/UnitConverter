package com.converter.conversions.mass;

import com.converter.conversions.interfaces.UnitMassConversions;
import com.converter.views.MassView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;

public class ConvertFromOunce implements UnitMassConversions {

    private static final Logger loggerOunce = LogManager.getLogger(ConvertFromOunce.class);

    @Override
    public JTextField getTextField() {
        loggerOunce.trace("Inside getTextField method, class ConvertFromOunce");
        return MassView.getMassView().getTextFieldOunce();
    }

    @Override
    public double getKgCoeff(){
        loggerOunce.trace("Inside getKgCoeff class ConvertFromOunce");
        return 0.0283495231;
    }

    @Override
    public double getLbsCoeff(){
        loggerOunce.trace("Inside getLbsCoeff class ConvertFromOunce");
        return 0.0625;
    }

    @Override
    public double getOunceCoeff() {
        loggerOunce.trace("Inside getOunceCoeff class ConvertFromOunce");
        return 1;
    }

    @Override
    public double getGramCoeff(){
        loggerOunce.trace("Inside getGramCoeff class ConvertFromOunce");
        return 28.349523125;
    }

    @Override
    public double getTonCoeff(){
        loggerOunce.trace("Inside getTonCoeff class ConvertFromOunce");
        return 0.0000283495;
    }

}
