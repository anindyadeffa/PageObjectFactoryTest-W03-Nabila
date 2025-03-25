package com.juaracoding.nabila;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.juaracoding.nabila.pages.InventoryPage;

public class InventoryTest {
    private InventoryPage inventoryPage;
    private WebDriver driver;

    @BeforeClass
    public void init() {
        driver = DriverSingleton.getDriver();
        inventoryPage = new InventoryPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test(priority = 1)
    public void addToCart() throws InterruptedException {
        Thread.sleep(1000);
        inventoryPage.addToCart(1);
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    public void verifyCartCount() {
        Assert.assertEquals(inventoryPage.getShoppingCartBadge(), "1");
    }

    @Test(priority = 3)
    public void clickCart() {
        inventoryPage.clickCart();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

}
