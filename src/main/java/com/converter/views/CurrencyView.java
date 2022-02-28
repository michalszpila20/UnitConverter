package com.converter.views;

import javax.swing.*;
import java.awt.*;

public class CurrencyView extends JPanel {

    private static CurrencyView instanceCurr;

    public static CurrencyView getCurrView(){
        if(instanceCurr == null){
            instanceCurr = new CurrencyView();
        }
        return instanceCurr;
    }

    JLabel labelPLN = new JLabel("PLN: ");
    JLabel labelUSD = new JLabel("USD: ");
    JLabel labelEUR = new JLabel("EUR: ");
    JLabel labelGBP = new JLabel("GBP: ");
    JLabel labelJPY = new JLabel("JPY: ");

    JButton buttonPLN = new JButton("Convert");
    JButton buttonUSD = new JButton("Convert");
    JButton buttonEUR = new JButton("Convert");
    JButton buttonGBP = new JButton("Convert");
    JButton buttonJPY = new JButton("Convert");

    JButton buttonClearTwo = new JButton("Clear");

    JTextField textFieldPLN = new JTextField();
    JTextField textFieldUSD = new JTextField();
    JTextField textFieldEUR = new JTextField();
    JTextField textFieldGBP = new JTextField();
    JTextField textFieldJPY = new JTextField();

    public CurrencyView(){

        add(labelPLN);
        add(labelUSD);
        add(labelEUR);
        add(labelGBP);
        add(labelJPY);

        add(buttonPLN);
        add(buttonUSD);
        add(buttonEUR);
        add(buttonGBP);
        add(buttonJPY);

        add(textFieldPLN);
        add(textFieldUSD);
        add(textFieldEUR);
        add(textFieldGBP);
        add(textFieldJPY);

        add(buttonClearTwo);

        textFieldPLN.setColumns(15);
        textFieldUSD.setColumns(15);
        textFieldEUR.setColumns(15);
        textFieldGBP.setColumns(15);
        textFieldJPY.setColumns(15);

        buttonPLN.setPreferredSize(new Dimension( 90, 19));
        buttonUSD.setPreferredSize(new Dimension( 90, 19));
        buttonEUR.setPreferredSize(new Dimension( 90, 19));
        buttonGBP.setPreferredSize(new Dimension( 90, 19));
        buttonJPY.setPreferredSize(new Dimension( 90, 19));


        //Spring Layout

        SpringLayout layout = new SpringLayout();
        setLayout(layout);

        layout.putConstraint(SpringLayout.WEST, buttonClearTwo, 400, SpringLayout.WEST, CurrencyView.this);
        layout.putConstraint(SpringLayout.NORTH, buttonClearTwo, 70, SpringLayout.NORTH, CurrencyView.this);
        layout.putConstraint(SpringLayout.WEST, textFieldPLN, 40, SpringLayout.EAST, labelPLN);
        layout.putConstraint(SpringLayout.NORTH, textFieldPLN, 10, SpringLayout.NORTH, CurrencyView.this);
        layout.putConstraint(SpringLayout.WEST, labelPLN, 50, SpringLayout.WEST, CurrencyView.this);
        layout.putConstraint(SpringLayout.NORTH, labelPLN, 10, SpringLayout.NORTH, CurrencyView.this);

        layout.putConstraint(SpringLayout.WEST, textFieldUSD, 39, SpringLayout.EAST, labelUSD);
        layout.putConstraint(SpringLayout.NORTH, textFieldUSD, 40, SpringLayout.NORTH, CurrencyView.this);
        layout.putConstraint(SpringLayout.WEST, labelUSD, 50, SpringLayout.WEST, CurrencyView.this);
        layout.putConstraint(SpringLayout.NORTH, labelUSD, 40, SpringLayout.NORTH, CurrencyView.this);

        layout.putConstraint(SpringLayout.WEST, textFieldEUR, 40, SpringLayout.EAST, labelEUR);
        layout.putConstraint(SpringLayout.NORTH, textFieldEUR, 70, SpringLayout.NORTH, CurrencyView.this);
        layout.putConstraint(SpringLayout.WEST, labelEUR, 50, SpringLayout.WEST, CurrencyView.this);
        layout.putConstraint(SpringLayout.NORTH, labelEUR, 70, SpringLayout.NORTH, CurrencyView.this);

        layout.putConstraint(SpringLayout.WEST, textFieldGBP, 39, SpringLayout.EAST, labelGBP);
        layout.putConstraint(SpringLayout.NORTH, textFieldGBP, 100, SpringLayout.NORTH, CurrencyView.this);
        layout.putConstraint(SpringLayout.WEST, labelGBP, 50, SpringLayout.WEST, CurrencyView.this);
        layout.putConstraint(SpringLayout.NORTH, labelGBP, 100, SpringLayout.NORTH, CurrencyView.this);

        layout.putConstraint(SpringLayout.WEST, textFieldJPY, 41, SpringLayout.EAST, labelJPY);
        layout.putConstraint(SpringLayout.NORTH, textFieldJPY, 130, SpringLayout.NORTH, CurrencyView.this);
        layout.putConstraint(SpringLayout.WEST, labelJPY, 50, SpringLayout.WEST, CurrencyView.this);
        layout.putConstraint(SpringLayout.NORTH, labelJPY, 130, SpringLayout.NORTH, CurrencyView.this);

        layout.putConstraint(SpringLayout.WEST, buttonPLN, 300, SpringLayout.WEST, CurrencyView.this);
        layout.putConstraint(SpringLayout.NORTH, buttonPLN, 10, SpringLayout.NORTH, CurrencyView.this);

        layout.putConstraint(SpringLayout.WEST, buttonUSD, 300, SpringLayout.WEST, CurrencyView.this);
        layout.putConstraint(SpringLayout.NORTH, buttonUSD, 40, SpringLayout.NORTH, CurrencyView.this);

        layout.putConstraint(SpringLayout.WEST, buttonEUR, 300, SpringLayout.WEST, CurrencyView.this);
        layout.putConstraint(SpringLayout.NORTH, buttonEUR, 70, SpringLayout.NORTH, CurrencyView.this);

        layout.putConstraint(SpringLayout.WEST, buttonGBP, 300, SpringLayout.WEST, CurrencyView.this);
        layout.putConstraint(SpringLayout.NORTH, buttonGBP, 100, SpringLayout.NORTH, CurrencyView.this);

        layout.putConstraint(SpringLayout.WEST, buttonJPY, 300, SpringLayout.WEST, CurrencyView.this);
        layout.putConstraint(SpringLayout.NORTH, buttonJPY, 130, SpringLayout.NORTH, CurrencyView.this);

    }

    public void setButtonPLN(JButton button6){
        this.buttonPLN = button6;
    }

    public JButton getButtonPLN(){
        return buttonPLN;
    }

    public void setButtonUSD(JButton button7){
        this.buttonUSD = button7;
    }

    public JButton getButtonUSD(){
        return buttonUSD;
    }

    public void setButtonEUR(JButton button8){
        this.buttonEUR = button8;
    }

    public JButton getButtonEUR(){
        return buttonEUR;
    }

    public void setButtonGBP(JButton button9){
        this.buttonGBP = button9;
    }

    public JButton getButtonGBP(){
        return buttonGBP;
    }

    public void setButtonJPY(JButton button10){
        this.buttonJPY = button10;
    }

    public JButton getButtonJPY(){
        return buttonJPY;
    }

    public JButton getButtonClearTwo() {
        return buttonClearTwo;
    }

    public void setButtonClearTwo(JButton buttonClearTwo) {
        this.buttonClearTwo = buttonClearTwo;
    }

    public JTextField getTextFieldPLN() {
        return textFieldPLN;
    }

    public void setTextFieldPLN(JTextField textFieldPLN) {
        this.textFieldPLN = textFieldPLN;
    }

    public JTextField getTextFieldUSD() {
        return textFieldUSD;
    }

    public void setTextFieldUSD(JTextField textFieldUSD) {
        this.textFieldUSD = textFieldUSD;
    }

    public JTextField getTextFieldEUR() {
        return textFieldEUR;
    }

    public void setTextFieldEUR(JTextField textFieldEUR) {
        this.textFieldEUR = textFieldEUR;
    }

    public JTextField getTextFieldGBP() {
        return textFieldGBP;
    }

    public void setTextFieldGBP(JTextField textFieldGBP) {
        this.textFieldGBP = textFieldGBP;
    }

    public JTextField getTextFieldJPY() {
        return textFieldJPY;
    }

    public void setTextFieldJPY(JTextField textFieldJPY) {
        this.textFieldJPY = textFieldJPY;
    }

}
