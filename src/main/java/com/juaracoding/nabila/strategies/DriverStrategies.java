package com.juaracoding.nabila.strategies;

import org.openqa.selenium.WebDriver;

import com.juaracoding.nabila.managers.ChromeManager;
import com.juaracoding.nabila.managers.FirefoxManager;
import com.juaracoding.nabila.utils.Browser;

public class DriverStrategies {

    public static WebDriver setStrategy(String browser) {
        if (browser.equals(Browser.CHROME)) {
            return ChromeManager.buildDriver();
        } else if (browser.equals(Browser.FIREFOX)) {
            return FirefoxManager.buildDriver();
        } else {
            return ChromeManager.buildDriver();
        }
    }
}
