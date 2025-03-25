package com.juaracoding.nabila;

import org.openqa.selenium.WebDriver;

import com.juaracoding.nabila.strategies.DriverStrategies;


public abstract class DriverSingleton {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("Driver not initialized");
        }

        return driver;
    }

    public static void setDriver(String browser) {
        if (driver == null) {
            driver = DriverStrategies.setStrategy(browser);
        }
    }

    public static void exit() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
