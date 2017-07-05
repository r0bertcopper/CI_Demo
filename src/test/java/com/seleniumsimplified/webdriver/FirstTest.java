package com.seleniumsimplified.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.StringHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by user on 11/11/2016.
 */
public class FirstTest {

    @Test

    public void driverIsTheKing()
    {
        System.setProperty("webdriver.gecko.driver", "C:\\Webdrivers\\Marionette\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.compendiumdev.co.uk/selenium");

        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
    }
}
