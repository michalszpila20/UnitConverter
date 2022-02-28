package com.converter.conversions.mass;

import com.converter.conversions.interfaces.UnitMassConversions;
import com.converter.views.MassView;

import javax.swing.*;

public class ConvertFromLbs implements UnitMassConversions {

    @Override
    public JTextField getTextField() {
        return MassView.getMassView().getTextFieldLbs();
    }
    @Override
    public double getKgCoeff(){
        return 0.45359237;
    }

    public double getOunceCoeff(){
        return 16;
    }

    public double getGramCoeff(){
        return 453.59237;
    }

    public double getTonCoeff(){
        return 0.0004535924;
    }

    public double getLbsCoeff(){ return 1; }

}
