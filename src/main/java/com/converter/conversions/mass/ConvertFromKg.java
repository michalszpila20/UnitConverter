package com.converter.conversions.mass;

import com.converter.conversions.interfaces.UnitMassConversions;
import com.converter.views.MassView;

import javax.swing.*;

public class ConvertFromKg implements UnitMassConversions {

    @Override
    public JTextField getTextField() {
        return MassView.getMassView().getTextFieldKg();
    }

    @Override
    public double getKgCoeff() { return 1; }

    public double getLbsCoeff(){
        return 2.2046226218;
    }

    public double getOunceCoeff(){
        return 35.27396195;
    }

    public double getGramCoeff(){
        return 1000;
    }

    public double getTonCoeff(){
        return 0.001;
    }



}
