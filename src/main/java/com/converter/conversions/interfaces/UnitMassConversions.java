package com.converter.conversions.interfaces;

import com.converter.ConverterView;
import com.converter.views.MassView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.swing.*;

public interface UnitMassConversions{

    Logger loggerUnitMassConv = LogManager.getLogger(UnitMassConversions.class);

    default void convert(){
        double value = 0, valueKg, valueLbs, valueOunce, valueGram, valueTon;
        try {
            value = Double.parseDouble(getTextField().getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(ConverterView.getConverterView().getFrame(), "Invalid input. Try again!");
            loggerUnitMassConv.error("Invalid input. Try again!" + e);
        }

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
