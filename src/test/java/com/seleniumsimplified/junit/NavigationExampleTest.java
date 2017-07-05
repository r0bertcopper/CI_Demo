package com.seleniumsimplified.junit;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class NavigationExampleTest {

    private static WebDriver driver;
    final private String PROTOCOL = "http";
    final private String DOMAIN = "www.compendiumdev.co.uk";
    final private String ROOT_URL = PROTOCOL + "://" + DOMAIN;

    @BeforeClass
    public static void createDriver(){

        driver = new FirefoxDriver();

    }

    public static void addDelay(int delay){

        try{
            Thread.sleep(delay);
        } catch(Exception e){
            System.out.println(e);
        }
    }

    @Test
    public void navigateToSearch() {

        driver.navigate().to(ROOT_URL + "/selenium/search.php");
        addDelay(5000);
        driver.manage().window().maximize();
        addDelay(5000);
        assertTrue(driver.getTitle().startsWith("Selenium Simplified Search Engine"));
        driver.navigate().refresh();
        addDelay(5000);

    }

    @Test
    public void navigateToForm() throws MalformedURLException {

        //Simplify URL access
        URL goToForm = new URL(PROTOCOL,DOMAIN,"/selenium/basic_html_form.html");

        driver.navigate().to(goToForm);
        addDelay(5000);
        driver.manage().window().maximize();
        addDelay(5000);

        assertTrue(driver.getTitle().contains("HTML Form Elements"));
        addDelay(3000);

        driver.navigate().back();
        addDelay(5000);

        driver.navigate().forward();
        addDelay(5000);

        //assertTrue(driver.getTitle().startsWith("Selenium Simplified Search Engine"));
    }

    @Test
    public void navigateToBacicWeb(){

        driver.navigate().to(ROOT_URL + "/selenium/basic_web_page.html");
        addDelay(3000);
        driver.manage().window().maximize();
        assertTrue(driver.getTitle().contains("Basic Web Page Title"));
        addDelay(5000);
    }

    @AfterClass
    public static void quitDriver(){
        driver.quit();
    }
}
