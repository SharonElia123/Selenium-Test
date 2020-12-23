package TestMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridIE {

    WebDriver driver;
    String baseURL, nodeURL;

    @BeforeTest
    public void setUp() throws MalformedURLException {

        baseURL = "http://Google.com/";
        nodeURL = "http://192.168.1.230:4444/wd/hub";
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability("browserName","internet explorer");
        driver = new RemoteWebDriver(new URL(nodeURL), capability);

    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
    @Test
    public void sampleTest() {
        driver.get(baseURL);
        driver.manage().window().maximize();

        if (driver.getPageSource().contains("MOBILE TESTING")) {
            Assert.assertTrue(true, "Mobile Testing Link Found");
        } else {
            Assert.assertTrue(false, "Failed: Link not found");
        }

    }

}