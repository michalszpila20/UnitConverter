package com.converter;
import com.converter.views.CurrencyView;
import com.converter.views.MassView;
import com.converter.views.TemperatureView;

public class Converter {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            ConverterView v = ConverterView.getConverterView();
            MassView vMass = MassView.getMassView();
            CurrencyView vCurr = CurrencyView.getCurrView();
            TemperatureView vTemp = TemperatureView.getTempView();
            ConverterController c = new ConverterController(v, vMass, vCurr, vTemp);
            c.initController();
        });
    }
}
