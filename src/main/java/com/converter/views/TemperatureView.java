package com.converter.views;
import javax.swing.*;
import java.awt.*;

public class TemperatureView extends JPanel {

    JLabel labelCelsius = new JLabel("Celsius: ");
    JLabel labelKelvin = new JLabel("Kelvin: ");
    JLabel labelFahrenheit = new JLabel("Fahrenheit: ");
    JLabel labelRankine = new JLabel("Rankine: ");

    JTextField textFieldCelsius = new JTextField();
    JTextField textFieldKelvin = new JTextField();
    JTextField textFieldFahrenheit = new JTextField();
    JTextField textFieldRankine = new JTextField();

    JButton buttonCelsius = new JButton("Convert");
    JButton buttonKelvin = new JButton("Convert");
    JButton buttonFahrenheit = new JButton("Convert");
    JButton buttonRankine = new JButton("Convert");

    JButton buttonClearThree = new JButton("Clear");

    private static TemperatureView instanceTemp;

    public static TemperatureView getTempView(){
        if(instanceTemp == null){
            instanceTemp = new TemperatureView();
        }
        return instanceTemp;
    }

    public TemperatureView(){

        this.add(labelCelsius);
        this.add(labelKelvin);
        this.add(labelFahrenheit);
        this.add(labelRankine);

        this.add(buttonCelsius);
        this.add(buttonKelvin);
        this.add(buttonFahrenheit);
        this.add(buttonRankine);

        this.add(textFieldCelsius);
        this.add(textFieldKelvin);
        this.add(textFieldFahrenheit);
        this.add(textFieldRankine);

        this.add(buttonClearThree);

        textFieldCelsius.setColumns(15);
        textFieldKelvin.setColumns(15);
        textFieldFahrenheit.setColumns(15);
        textFieldRankine.setColumns(15);

        buttonCelsius.setPreferredSize(new Dimension( 90, 19));
        buttonKelvin.setPreferredSize(new Dimension( 90, 19));
        buttonFahrenheit.setPreferredSize(new Dimension( 90, 19));
        buttonRankine.setPreferredSize(new Dimension( 90, 19));

        //Spring Layout

        SpringLayout layout = new SpringLayout();
        setLayout(layout);

        layout.putConstraint(SpringLayout.WEST, buttonClearThree, 400, SpringLayout.WEST, TemperatureView.this);
        layout.putConstraint(SpringLayout.NORTH, buttonClearThree, 70, SpringLayout.NORTH, TemperatureView.this);

        layout.putConstraint(SpringLayout.WEST, textFieldCelsius, 40, SpringLayout.EAST, labelCelsius);
        layout.putConstraint(SpringLayout.NORTH, textFieldCelsius, 10, SpringLayout.NORTH, TemperatureView.this);
        layout.putConstraint(SpringLayout.WEST, labelCelsius, 30, SpringLayout.WEST, TemperatureView.this);
        layout.putConstraint(SpringLayout.NORTH, labelCelsius, 10, SpringLayout.NORTH, TemperatureView.this);

        layout.putConstraint(SpringLayout.WEST, textFieldKelvin, 48, SpringLayout.EAST, labelKelvin);
        layout.putConstraint(SpringLayout.NORTH, textFieldKelvin, 40, SpringLayout.NORTH, TemperatureView.this);
        layout.putConstraint(SpringLayout.WEST, labelKelvin, 30, SpringLayout.WEST, TemperatureView.this);
        layout.putConstraint(SpringLayout.NORTH, labelKelvin, 40, SpringLayout.NORTH, TemperatureView.this);

        layout.putConstraint(SpringLayout.WEST, textFieldFahrenheit, 22, SpringLayout.EAST, labelFahrenheit);
        layout.putConstraint(SpringLayout.NORTH, textFieldFahrenheit, 70, SpringLayout.NORTH, TemperatureView.this);
        layout.putConstraint(SpringLayout.WEST, labelFahrenheit, 30, SpringLayout.WEST, TemperatureView.this);
        layout.putConstraint(SpringLayout.NORTH, labelFahrenheit, 70, SpringLayout.NORTH, TemperatureView.this);

        layout.putConstraint(SpringLayout.WEST, textFieldRankine, 36, SpringLayout.EAST, labelRankine);
        layout.putConstraint(SpringLayout.NORTH, textFieldRankine, 100, SpringLayout.NORTH, TemperatureView.this);
        layout.putConstraint(SpringLayout.WEST, labelRankine, 30, SpringLayout.WEST, TemperatureView.this);
        layout.putConstraint(SpringLayout.NORTH, labelRankine, 100, SpringLayout.NORTH, TemperatureView.this);

        layout.putConstraint(SpringLayout.WEST, buttonCelsius, 300, SpringLayout.WEST, TemperatureView.this);
        layout.putConstraint(SpringLayout.NORTH, buttonCelsius, 10, SpringLayout.NORTH, TemperatureView.this);

        layout.putConstraint(SpringLayout.WEST, buttonKelvin, 300, SpringLayout.WEST, TemperatureView.this);
        layout.putConstraint(SpringLayout.NORTH, buttonKelvin, 40, SpringLayout.NORTH, TemperatureView.this);

        layout.putConstraint(SpringLayout.WEST, buttonFahrenheit, 300, SpringLayout.WEST, TemperatureView.this);
        layout.putConstraint(SpringLayout.NORTH, buttonFahrenheit, 70, SpringLayout.NORTH, TemperatureView.this);

        layout.putConstraint(SpringLayout.WEST, buttonRankine, 300, SpringLayout.WEST, TemperatureView.this);
        layout.putConstraint(SpringLayout.NORTH, buttonRankine, 100, SpringLayout.NORTH, TemperatureView.this);

    }



    public void setButtonCelsius(JButton button11){
        this.buttonCelsius = button11;
    }

    public JButton getButtonCelsius(){
        return buttonCelsius;
    }

    public void setButtonKelvin(JButton button12){
        this.buttonKelvin = button12;
    }

    public JButton getButtonKelvin(){
        return buttonKelvin;
    }

    public void setButtonFahrenheit(JButton button13){
        this.buttonFahrenheit = button13;
    }

    public JButton getButtonFahrenheit(){
        return buttonFahrenheit;
    }

    public void setButtonRankine(JButton button14){
        this.buttonRankine = button14;
    }

    public JButton getButtonRankine(){
        return buttonRankine;
    }


    public JTextField getTextFieldCelsius() {
        return textFieldCelsius;
    }

    public void setTextFieldCelsius(JTextField textFieldCelsius) {
        this.textFieldCelsius = textFieldCelsius;
    }

    public JTextField getTextFieldKelvin() {
        return textFieldKelvin;
    }

    public void setTextFieldKelvin(JTextField textFieldKelvin) {
        this.textFieldKelvin = textFieldKelvin;
    }

    public JTextField getTextFieldFahrenheit() {
        return textFieldFahrenheit;
    }

    public void setTextFieldFahrenheit(JTextField textFieldFahrenheit) {
        this.textFieldFahrenheit = textFieldFahrenheit;
    }

    public JTextField getTextFieldRankine() {
        return textFieldRankine;
    }

    public void setTextFieldRankine(JTextField textFieldRankine) {
        this.textFieldRankine = textFieldRankine;
    }

    public JButton getButtonClearThree() {
        return buttonClearThree;
    }

    public void setButtonClearThree(JButton buttonClearThree) {
        this.buttonClearThree = buttonClearThree;
    }
}
