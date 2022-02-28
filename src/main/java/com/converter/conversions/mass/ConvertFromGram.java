package com.converter.conversions.mass;

import com.converter.conversions.interfaces.UnitMassConversions;
import com.converter.views.MassView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;

public class ConvertFromGram implements UnitMassConversions {

    private static final Logger loggerGram = LogManager.getLogger(ConvertFromGram.class);

    @Override
    public JTextField getTextField() {
        loggerGram.trace("Inside getTextField class ConvertFromGram");
        return MassView.getMassView().getTextFieldGram();
    }

    @Override
    public double getKgCoeff(){
        loggerGram.trace("Inside getKgCoeff method, class ConvertFromGram");
        return 0.001;
    }

    @Override
    public double getLbsCoeff(){
        loggerGram.trace("Inside getLbsCoeff method, class ConvertFromGram");
        return 0.0022046226;
    }

    @Override
    public double getOunceCoeff(){
        loggerGram.trace("Inside getOunceCoeff method, class ConvertFromGram");
        return 0.0352739619;
    }

    @Override
    public double getGramCoeff() {
        loggerGram.trace("Inside getGramCoeff method, class ConvertFromGram");
        return 1;
    }

    @Override
    public double getTonCoeff(){
        loggerGram.trace("Inside getTonCoeff method, class ConvertFromGram");
        return 0.000001;
    }

}
