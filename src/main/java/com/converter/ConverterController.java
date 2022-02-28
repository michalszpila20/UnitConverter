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

    private static final Logger loggerController = LogManager.getLogger(ConverterController.class);
    private final ConverterView view;
    private final MassView viewMass;
    private final CurrencyView viewCurr;
    private final TemperatureView viewTemp;

    public ConverterController(ConverterView v, MassView vMass, CurrencyView vCurr, TemperatureView vTemp){
        view = v;
        viewMass = vMass;
        viewCurr = vCurr;
        viewTemp = vTemp;
        loggerController.trace("Inside ConverterController Constructor");
    }

    public void initController() {

        viewMass.getButtonKg().addActionListener(e -> {
            StrategyMass strategy = new StrategyMass(new ConvertFromKg());
            strategy.executeStrategy();
            loggerController.trace("Action performed - ConvertKg");
        });

        viewMass.getButtonLbs().addActionListener(e -> {
            StrategyMass strategy = new StrategyMass(new ConvertFromLbs());
            strategy.executeStrategy();
            loggerController.trace("Action performed - ConvertLbs");
        });

        viewMass.getButtonOunce().addActionListener(e -> {
            StrategyMass strategy = new StrategyMass(new ConvertFromOunce());
            strategy.executeStrategy();
            loggerController.trace("Action performed - ConvertOunce");
        });

        viewMass.getButtonGram().addActionListener(e -> {
            StrategyMass strategy = new StrategyMass(new ConvertFromGram());
            strategy.executeStrategy();
            loggerController.trace("Action performed - ConvertGram");
        });

        viewMass.getButtonTon().addActionListener(e -> {
            StrategyMass strategy = new StrategyMass(new ConvertFromTon());
            strategy.executeStrategy();
            loggerController.trace("Action performed - ConvertTon");
        });

        viewCurr.getButtonPLN().addActionListener(e -> {
            StrategyCurrency strategy = new StrategyCurrency(new ConvertFromPLN());
            try {
                strategy.executeStrategy();
                loggerController.trace("Action performed - ConvertPLN");
            } catch (IOException ioException) {
                loggerController.error("Fetching error from website, conversionFromPLN", ioException);
            }
        });

        viewCurr.getButtonUSD().addActionListener(e -> {
            StrategyCurrency strategy = new StrategyCurrency(new ConvertFromUSD());
            try {
                strategy.executeStrategy();
                loggerController.trace("Action performed - ConvertUSD");
            } catch (IOException ioException) {
                loggerController.error("Fetching error from website, conversionFromUSD", ioException);
            }
        });

        viewCurr.getButtonEUR().addActionListener(e -> {
            StrategyCurrency strategy = new StrategyCurrency(new ConvertFromEUR());
            try {
                strategy.executeStrategy();
                loggerController.trace("Action performed - ConvertEUR");
            } catch (IOException ioException) {
                loggerController.error("Fetching error from website, conversionFromEUR", ioException);
            }
        });

        viewCurr.getButtonGBP().addActionListener(e -> {
            StrategyCurrency strategy = new StrategyCurrency(new ConvertFromGBP());
            try {
                strategy.executeStrategy();
                loggerController.trace("Action performed - ConvertGBP");
            } catch (IOException ioException) {
                loggerController.error("Fetching error from website, conversionFromGBP", ioException);
            }
        });

        viewCurr.getButtonJPY().addActionListener(e -> {
            StrategyCurrency strategy = new StrategyCurrency(new ConvertFromJPY());
            try {
                strategy.executeStrategy();
                loggerController.trace("Action performed - ConvertJPY");
            } catch (IOException ioException) {
                loggerController.error("Fetching error from website, conversionFromJPY", ioException);
            }
        });

        viewTemp.getButtonCelsius().addActionListener(e -> {
            StrategyTemp strategyTemp = new StrategyTemp(new ConvertFromCelsius());
            strategyTemp.executeStrategy();
            loggerController.trace("Action performed - ConvertCelsius");
        });

        viewTemp.getButtonKelvin().addActionListener(e -> {
            StrategyTemp strategyTemp = new StrategyTemp(new ConvertFromKelvin());
            strategyTemp.executeStrategy();
            loggerController.trace("Action performed - ConvertKelvin");
        });

        viewTemp.getButtonFahrenheit().addActionListener(e -> {
            StrategyTemp strategyTemp = new StrategyTemp(new ConvertFromFahrenheit());
            strategyTemp.executeStrategy();
            loggerController.trace("Action performed - ConvertFahrenheit");
        });

        viewTemp.getButtonRankine().addActionListener(e -> {
            StrategyTemp strategyTemp = new StrategyTemp(new ConvertFromRankine());
            strategyTemp.executeStrategy();
            loggerController.trace("Action performed - ConvertRankine");
        });

        viewMass.getButtonClearOne().addActionListener(e -> {
            CleanUp.clearFirstPanel();
            loggerController.trace("Action performed - Clear all TextFields in panel Mass");
        });
        viewCurr.getButtonClearTwo().addActionListener(e -> {
            CleanUp.clearSecondPanel();
            loggerController.trace("Action performed - Clear all TextFields in panel Currency");
        });
        viewTemp.getButtonClearThree().addActionListener(e -> {
            CleanUp.clearThirdPanel();
            loggerController.trace("Action performed - Clear all TextFields in panel Temperature");
        });
    }

}