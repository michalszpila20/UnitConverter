package com.converter.conversions.mass;

import com.converter.conversions.interfaces.UnitMassConversions;
import com.converter.views.MassView;

import javax.swing.*;

public class ConvertFromGram implements UnitMassConversions {

    @Override
    public JTextField getTextField() {
        return MassView.getMassView().getTextFieldGram();
    }

    public double getKgCoeff(){
        return 0.001;
    }

    public double getLbsCoeff(){
        return 0.0022046226;
    }

    public double getOunceCoeff(){
        return 0.0352739619;
    }

    @Override
    public double getGramCoeff() { return 1; }

    public double getTonCoeff(){
        return 0.000001;
    }

}
