package com.converter.conversions.mass;

import com.converter.conversions.interfaces.UnitMassConversions;
import com.converter.views.MassView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;

public class ConvertFromKg implements UnitMassConversions {

    private static final Logger loggerKg = LogManager.getLogger(ConvertFromKg.class);

    @Override
    public JTextField getTextField() {
        loggerKg.trace("Inside getTextField method class ConvertFromKg");
        return MassView.getMassView().getTextFieldKg();
    }

    @Override
    public double getKgCoeff() {
        loggerKg.trace("Inside getKgCoeff method, class ConvertFromKg");
        return 1;
    }

    @Override
    public double getLbsCoeff(){
        loggerKg.trace("Inside getLbsCoeff method, class ConvertFromKg");
        return 2.2046226218;
    }

    @Override
    public double getOunceCoeff(){
        loggerKg.trace("Inside getOunceCoeff method, class ConvertFromKg");
        return 35.27396195;
    }

    @Override
    public double getGramCoeff(){
        loggerKg.trace("Inside getGramCoeff method, class ConvertFromKg");
        return 1000;
    }

    @Override
    public double getTonCoeff(){
        loggerKg.trace("Inside getTonCoeff method, class ConvertFromKg");
        return 0.001;
    }



}
