package com.converter.conversions.mass;

import com.converter.conversions.interfaces.UnitMassConversions;
import com.converter.views.MassView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;

public class ConvertFromLbs implements UnitMassConversions {

    private static final Logger loggerLbs = LogManager.getLogger(ConvertFromLbs.class);

    @Override
    public JTextField getTextField() {
        loggerLbs.trace("Inside getTextField method, class ConvertFromLbs");
        return MassView.getMassView().getTextFieldLbs();
    }

    @Override
    public double getKgCoeff(){
        loggerLbs.trace("Inside getKgCoeff method, class ConvertFromLbs");
        return 0.45359237;
    }

    @Override
    public double getOunceCoeff(){
        loggerLbs.trace("Inside getOunceCoeff method, class ConvertFromLbs");
        return 16;
    }

    @Override
    public double getGramCoeff(){
        loggerLbs.trace("Inside getGramCoeff method, class ConvertFromLbs");
        return 453.59237;
    }

    @Override
    public double getTonCoeff(){
        loggerLbs.trace("Inside getTonCoeff method, class ConvertFromLbs");
        return 0.0004535924;
    }

    @Override
    public double getLbsCoeff(){
        loggerLbs.trace("Inside getLbsCoeff method, class ConvertFromLbs");
        return 1;
    }

}
