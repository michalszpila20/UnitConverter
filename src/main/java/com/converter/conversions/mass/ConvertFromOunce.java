package com.converter.conversions.mass;

import com.converter.conversions.interfaces.UnitMassConversions;
import com.converter.views.MassView;

import javax.swing.*;

public class ConvertFromOunce implements UnitMassConversions {

    @Override
    public JTextField getTextField() {
        return MassView.getMassView().getTextFieldOunce();
    }

    public double getKgCoeff(){ return 0.0283495231; }

    public double getLbsCoeff(){
        return 0.0625;
    }

    @Override
    public double getOunceCoeff() { return 1; }

    public double getGramCoeff(){
        return 28.349523125;
    }

    public double getTonCoeff(){
        return 0.0000283495;
    }

}
