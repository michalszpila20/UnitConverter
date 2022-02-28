package com.converter.conversions.mass;

import com.converter.conversions.interfaces.UnitMassConversions;
import com.converter.views.MassView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;

public class ConvertFromTon implements UnitMassConversions {

    private static final Logger loggerTon = LogManager.getLogger(ConvertFromTon.class);

    @Override
    public JTextField getTextField() {
        loggerTon.trace("Inside getTextField class ConvertFromGram");
        return MassView.getMassView().getTextFieldTon();
    }

    @Override
    public double getKgCoeff(){
        loggerTon.trace("Inside getKgCoeff method, class ConvertFromTon");
        return 1000;
    }

    @Override
    public double getLbsCoeff(){
        loggerTon.trace("Inside getLbsCoeff method, class ConvertFromTon");
        return 2204.6226218;
    }

    @Override
    public double getOunceCoeff(){
        loggerTon.trace("Inside getOunceCoeff method, class ConvertFromTon");
        return 35273.96195;
    }

    @Override
    public double getGramCoeff(){
        loggerTon.trace("Inside getGramCoeff method, class ConvertFromTon");
        return 1000000;
    }

    @Override
    public double getTonCoeff() {
        loggerTon.trace("Inside getTonCoeff method, class ConvertFromTon");
        return 1;
    }

}
