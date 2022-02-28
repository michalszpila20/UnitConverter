package com.converter.conversions.mass;

import com.converter.conversions.interfaces.UnitMassConversions;
import com.converter.views.MassView;

import javax.swing.*;

public class ConvertFromTon implements UnitMassConversions {

    @Override
    public JTextField getTextField() {
        return MassView.getMassView().getTextFieldTon();
    }

    public double getKgCoeff(){
        return 1000;
    }

    public double getLbsCoeff(){
        return 2204.6226218;
    }

    public double getOunceCoeff(){
        return 35273.96195;
    }

    public double getGramCoeff(){
        return 1000000;
    }

    @Override
    public double getTonCoeff() { return 1; }

}
