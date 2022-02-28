package com.converter;

import com.converter.views.CurrencyView;
import com.converter.views.MassView;
import com.converter.views.TemperatureView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class ConverterView extends JFrame {

    private static ConverterView instance;

    JFrame frame = new JFrame("Unit Converter");
    JTabbedPane tabbedPane = new JTabbedPane();
    MassView panelMass = MassView.getMassView();
    CurrencyView panelCurrency = CurrencyView.getCurrView();
    TemperatureView panelTemperature = TemperatureView.getTempView();

    final Logger logger = LogManager.getLogger(Converter.class);

    public static ConverterView getConverterView(){
        if(instance == null){
            instance = new ConverterView();
        }
        return instance;
    }

    private ConverterView() {

        //Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 270);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        logger.trace("Creating JFrame");

        frame.getContentPane().add(tabbedPane);
        tabbedPane.addTab("Mass", null, panelMass, "Mass conversion");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        tabbedPane.addTab("Currency", null, panelCurrency, "Currency conversion");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_2);

        tabbedPane.addTab("Temperature", null, panelTemperature, "Temperature conversion");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_2);


    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

}