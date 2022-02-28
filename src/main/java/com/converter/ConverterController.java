package com.converter;

import com.converter.conversions.currency.*;
import com.converter.conversions.mass.*;
import com.converter.conversions.strategies.StrategyCurrency;
import com.converter.conversions.strategies.StrategyMass;
import com.converter.conversions.strategies.StrategyTemp;
import com.converter.conversions.temperature.ConvertFromCelsius;
import com.converter.conversions.temperature.ConvertFromFahrenheit;
import com.converter.conversions.temperature.ConvertFromKelvin;
import com.converter.conversions.temperature.ConvertFromRankine;
import com.converter.conversions.tools.CleanUp;
import com.converter.views.CurrencyView;
import com.converter.views.MassView;
import com.converter.views.TemperatureView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;

public class ConverterController {

    private final ConverterView view;
    private final MassView viewMass;
    private final CurrencyView viewCurr;
    private final TemperatureView viewTemp;

    public ConverterController(ConverterView v, MassView vMass, CurrencyView vCurr, TemperatureView vTemp){
        view = v;
        viewMass = vMass;
        viewCurr = vCurr;
        viewTemp = vTemp;
    }

    final Logger logger = LogManager.getLogger(Converter.class);

    public void initController() {

        viewMass.getButtonKg().addActionListener(e -> {
            StrategyMass strategy = new StrategyMass(new ConvertFromKg());
            strategy.executeStrategy();
        });

        viewMass.getButtonLbs().addActionListener(e -> {
            StrategyMass strategy = new StrategyMass(new ConvertFromLbs());
            strategy.executeStrategy();
        });

        viewMass.getButtonOunce().addActionListener(e -> {
            StrategyMass strategy = new StrategyMass(new ConvertFromOunce());
            strategy.executeStrategy();
        });

        viewMass.getButtonGram().addActionListener(e -> {
            StrategyMass strategy = new StrategyMass(new ConvertFromGram());
            strategy.executeStrategy();
        });

        viewMass.getButtonTon().addActionListener(e -> {
            StrategyMass strategy = new StrategyMass(new ConvertFromTon());
            strategy.executeStrategy();
        });

        viewCurr.getButtonPLN().addActionListener(e -> {
            StrategyCurrency strategy = new StrategyCurrency(new ConvertFromPLN());
            try {
                strategy.executeStrategy();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        viewCurr.getButtonUSD().addActionListener(e -> {
            StrategyCurrency strategy = new StrategyCurrency(new ConvertFromUSD());
            try {
                strategy.executeStrategy();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        viewCurr.getButtonEUR().addActionListener(e -> {
            StrategyCurrency strategy = new StrategyCurrency(new ConvertFromEUR());
            try {
                strategy.executeStrategy();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        viewCurr.getButtonGBP().addActionListener(e -> {
            StrategyCurrency strategy = new StrategyCurrency(new ConvertFromGBP());
            try {
                strategy.executeStrategy();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        viewCurr.getButtonJPY().addActionListener(e -> {
            StrategyCurrency strategy = new StrategyCurrency(new ConvertFromJPY());
            try {
                strategy.executeStrategy();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        viewTemp.getButtonCelsius().addActionListener(e -> {
            StrategyTemp strategyTemp = new StrategyTemp(new ConvertFromCelsius());
            strategyTemp.executeStrategy();
        });

        viewTemp.getButtonKelvin().addActionListener(e -> {
            StrategyTemp strategyTemp = new StrategyTemp(new ConvertFromKelvin());
            strategyTemp.executeStrategy();
        });

        viewTemp.getButtonFahrenheit().addActionListener(e -> {
            StrategyTemp strategyTemp = new StrategyTemp(new ConvertFromFahrenheit());
            strategyTemp.executeStrategy();
        });

        viewTemp.getButtonRankine().addActionListener(e -> {
            StrategyTemp strategyTemp = new StrategyTemp(new ConvertFromRankine());
            strategyTemp.executeStrategy();
        });

        viewMass.getButtonClearOne().addActionListener(e -> CleanUp.clearFirstPanel());
        viewCurr.getButtonClearTwo().addActionListener(e -> CleanUp.clearSecondPanel());
        viewTemp.getButtonClearThree().addActionListener(e -> CleanUp.clearThirdPanel());
    }

}