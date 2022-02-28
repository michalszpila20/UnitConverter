package com.converter.conversions.interfaces;
import com.converter.views.MassView;

import javax.swing.*;

public interface UnitMassConversions{

    default void convert(){
        double value, valueKg, valueLbs, valueOunce, valueGram, valueTon;
        value = Double.parseDouble(getTextField().getText());
        valueKg = getKgCoeff() * value;
        valueLbs = getLbsCoeff() * value;
        valueOunce = getOunceCoeff() * value;
        valueGram = getGramCoeff() * value;
        valueTon = getTonCoeff() * value;

        MassView.getMassView().getTextFieldKg().setText(Double.toString(valueKg));
        MassView.getMassView().getTextFieldLbs().setText(Double.toString(valueLbs));
        MassView.getMassView().getTextFieldOunce().setText(Double.toString(valueOunce));
        MassView.getMassView().getTextFieldGram().setText(Double.toString(valueGram));
        MassView.getMassView().getTextFieldTon().setText(Double.toString(valueTon));
    }
    JTextField getTextField();

    double getKgCoeff();
    double getLbsCoeff();
    double getOunceCoeff();
    double getGramCoeff();
    double getTonCoeff();

}
