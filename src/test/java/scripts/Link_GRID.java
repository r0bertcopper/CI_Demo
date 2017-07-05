package scripts;

import core.Selenium;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


import static org.junit.Assert.assertTrue;

/**
 * Created by user on 02/07/2017.
 */
public class Link_GRID extends Selenium {

    private static WebDriver driver = null;
    final private String PROTOCOL = "http";
    final private String DOMAIN = "www.compendiumdev.co.uk";
    final private String ROOT_URL = PROTOCOL + "://" + DOMAIN;

    @BeforeClass
    public static void linkGrid(){

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("platform", Platform.WIN8_1);

        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
            }
            catch (MalformedURLException e){

                e.printStackTrace();
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

    @AfterClass
    public static void quitDriver(){
        driver.quit();
    }

    }
