package com.converter.views;

import javax.swing.*;
import java.awt.*;

public class MassView extends JPanel{

    JLabel labelKg = new JLabel("Kg: ");
    JLabel labelLbs = new JLabel("Lbs: ");
    JLabel labelOunce = new JLabel("Ounce: ");
    JLabel labelGram = new JLabel("Gram: ");
    JLabel labelTon = new JLabel("Ton");

    JTextField textFieldKg = new JTextField();
    JTextField textFieldLbs = new JTextField();
    JTextField textFieldOunce = new JTextField();
    JTextField textFieldGram = new JTextField();
    JTextField textFieldTon = new JTextField();

    JButton buttonKg = new JButton("Convert");
    JButton buttonLbs = new JButton("Convert");
    JButton buttonOunce = new JButton("Convert");
    JButton buttonGram = new JButton("Convert");
    JButton buttonTon = new JButton("Convert");

    JButton buttonClearOne = new JButton("Clear");


    private static MassView instanceMass;

    public static MassView getMassView(){
        if(instanceMass == null){
            instanceMass = new MassView();
        }
        return instanceMass;
    }

    public MassView(){

        this.add(buttonClearOne);
        this.add(labelKg);
        this.add(labelLbs);
        this.add(labelOunce);
        this.add(labelGram);
        this.add(labelTon);
        this.add(buttonKg);
        this.add(buttonLbs);
        this.add(buttonOunce);
        this.add(buttonGram);
        this.add(buttonTon);

        this.add(textFieldKg);
        this.add(textFieldLbs);
        this.add(textFieldOunce);
        this.add(textFieldGram);
        this.add(textFieldTon);

        buttonKg.setPreferredSize(new Dimension( 90, 19));
        buttonLbs.setPreferredSize(new Dimension( 90, 19));
        buttonOunce.setPreferredSize(new Dimension( 90, 19));
        buttonGram.setPreferredSize(new Dimension( 90, 19));
        buttonTon.setPreferredSize(new Dimension( 90, 19));

        textFieldKg.setColumns(15);
        textFieldLbs.setColumns(15);
        textFieldOunce.setColumns(15);
        textFieldGram.setColumns(15);
        textFieldTon.setColumns(15);

        SpringLayout layout = new SpringLayout();
        setLayout(layout);

        layout.putConstraint(SpringLayout.WEST, buttonClearOne, 400, SpringLayout.WEST, MassView.this);
        layout.putConstraint(SpringLayout.NORTH, buttonClearOne, 70, SpringLayout.NORTH, MassView.this);
        layout.putConstraint(SpringLayout.WEST, textFieldKg, 50, SpringLayout.EAST, labelKg);
        layout.putConstraint(SpringLayout.NORTH, textFieldKg, 10, SpringLayout.NORTH, MassView.this);
        layout.putConstraint(SpringLayout.WEST, labelKg, 50, SpringLayout.WEST, MassView.this);
        layout.putConstraint(SpringLayout.NORTH, labelKg, 10, SpringLayout.NORTH, MassView.this);

        layout.putConstraint(SpringLayout.WEST, textFieldLbs, 44, SpringLayout.EAST, labelLbs);
        layout.putConstraint(SpringLayout.NORTH, textFieldLbs, 40, SpringLayout.NORTH, MassView.this);
        layout.putConstraint(SpringLayout.WEST, labelLbs, 50, SpringLayout.WEST, MassView.this);
        layout.putConstraint(SpringLayout.NORTH, labelLbs, 40, SpringLayout.NORTH, MassView.this);

        layout.putConstraint(SpringLayout.WEST, textFieldOunce, 28, SpringLayout.EAST, labelOunce);
        layout.putConstraint(SpringLayout.NORTH, textFieldOunce, 70, SpringLayout.NORTH, MassView.this);
        layout.putConstraint(SpringLayout.WEST, labelOunce, 50, SpringLayout.WEST, MassView.this);
        layout.putConstraint(SpringLayout.NORTH, labelOunce, 70, SpringLayout.NORTH, MassView.this);

        layout.putConstraint(SpringLayout.WEST, textFieldGram, 34, SpringLayout.EAST, labelGram);
        layout.putConstraint(SpringLayout.NORTH, textFieldGram, 100, SpringLayout.NORTH, MassView.this);
        layout.putConstraint(SpringLayout.WEST, labelGram, 50, SpringLayout.WEST, MassView.this);
        layout.putConstraint(SpringLayout.NORTH, labelGram, 100, SpringLayout.NORTH, MassView.this);

        layout.putConstraint(SpringLayout.WEST, textFieldTon, 50, SpringLayout.EAST, labelTon);
        layout.putConstraint(SpringLayout.NORTH, textFieldTon, 130, SpringLayout.NORTH, MassView.this);
        layout.putConstraint(SpringLayout.WEST, labelTon, 50, SpringLayout.WEST, MassView.this);
        layout.putConstraint(SpringLayout.NORTH, labelTon, 130, SpringLayout.NORTH, MassView.this);

        layout.putConstraint(SpringLayout.WEST, buttonKg, 300, SpringLayout.WEST, MassView.this);
        layout.putConstraint(SpringLayout.NORTH, buttonKg, 10, SpringLayout.NORTH, MassView.this);

        layout.putConstraint(SpringLayout.WEST, buttonLbs, 300, SpringLayout.WEST, MassView.this);
        layout.putConstraint(SpringLayout.NORTH, buttonLbs, 40, SpringLayout.NORTH, MassView.this);

        layout.putConstraint(SpringLayout.WEST, buttonOunce, 300, SpringLayout.WEST, MassView.this);
        layout.putConstraint(SpringLayout.NORTH, buttonOunce, 70, SpringLayout.NORTH, MassView.this);

        layout.putConstraint(SpringLayout.WEST, buttonGram, 300, SpringLayout.WEST, MassView.this);
        layout.putConstraint(SpringLayout.NORTH, buttonGram, 100, SpringLayout.NORTH, MassView.this);

        layout.putConstraint(SpringLayout.WEST, buttonTon, 300, SpringLayout.WEST, MassView.this);
        layout.putConstraint(SpringLayout.NORTH, buttonTon, 130, SpringLayout.NORTH, MassView.this);
    }




    public void setButtonKg(JButton button1){
        this.buttonKg = button1;
    }


    public JButton getButtonKg(){
        return buttonKg;
    }

    public JButton getButtonLbs(){
        return buttonLbs;
    }

    public void setButtonLbs(JButton button2){

        this.buttonLbs = button2;

    }

    public void setButtonOunce(JButton button3){

        this.buttonOunce = button3;

    }

    public JButton getButtonOunce(){
        return buttonOunce;
    }

    public void setButtonGram(JButton button4){
        this.buttonGram = button4;
    }

    public JButton getButtonGram(){
        return buttonGram;
    }

    public void setButtonTon(JButton button5){
        this.buttonTon = button5;
    }

    public JButton getButtonTon(){
        return buttonTon;
    }


    public void setFirstTextField(JTextField text1){
        this.textFieldKg = text1;
    }

    public JTextField getFirstTextField(){
        return textFieldKg;
    }

    public JLabel getLabelKg() {
        return labelKg;
    }

    public void setLabelKg(JLabel labelKg) {
        this.labelKg = labelKg;
    }

    public JTextField getTextFieldKg() {
        return textFieldKg;
    }

    public void setTextFieldKg(JTextField textFieldKg) {
        this.textFieldKg = textFieldKg;
    }

    public JTextField getTextFieldLbs() {
        return textFieldLbs;
    }

    public void setTextFieldLbs(JTextField textFieldLbs) {
        this.textFieldLbs = textFieldLbs;
    }

    public JTextField getTextFieldOunce() {
        return textFieldOunce;
    }

    public void setTextFieldOunce(JTextField textFieldOunce) {
        this.textFieldOunce = textFieldOunce;
    }

    public JTextField getTextFieldGram() {
        return textFieldGram;
    }

    public void setTextFieldGram(JTextField textFieldGram) {
        this.textFieldGram = textFieldGram;
    }

    public JTextField getTextFieldTon() {
        return textFieldTon;
    }

    public void setTextFieldTon(JTextField textFieldTon) {
        this.textFieldTon = textFieldTon;
    }

    public JButton getButtonClearOne() {
        return buttonClearOne;
    }

    public void setButtonClearOne(JButton buttonClearOne) {
        this.buttonClearOne = buttonClearOne;
    }

}
