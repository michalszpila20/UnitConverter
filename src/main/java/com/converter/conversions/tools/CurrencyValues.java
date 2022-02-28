package com.converter.conversions.tools;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class CurrencyValues {

    private static final Logger loggerCurrValues = LogManager.getLogger(CurrencyValues.class);

    public static Map<String, Double> getCurrencyValues() throws IOException {

        URL url = new URL("https://www.nbp.pl/home.aspx?f=/kursy/kursya.html");
        org.jsoup.nodes.Document doc = Jsoup.parse(url, 3000);
        doc.outputSettings().indentAmount(0).prettyPrint(false);

        Elements tables = doc.select("table.nbptable > tbody > tr ");

        int j = 0;
        double number;

        Map<String, Double> Currency = new HashMap<>();

        for(org.jsoup.nodes.Element table : tables)
        {
            if(j == 0){
                loggerCurrValues.info("Nothing happens");
            }
            else if(j==2){
                String[] parts = table.getElementsByIndexEquals(2).text().split(" ");
                String lastWord = parts[parts.length - 1];
                lastWord = lastWord.replaceAll(",",".");
                number = Double.parseDouble(lastWord);
                Currency.put(table.getElementsByIndexEquals(0).text(),number);
            }
            else{
                String text = table.getElementsByIndexEquals(2).text().replaceAll(",",".");
                number = Double.parseDouble(text);
                Currency.put(table.getElementsByIndexEquals(0).text(),number);
            }
            ++j;
        }
        loggerCurrValues.trace("Returning values from website");
        return Currency;
    }

}
