package TestMain;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.remote.DesiredCapabilities;
public class SeleniumGrid {

    WebDriver driver;
    String baseURL, nodeURL;

    @BeforeTest
    public void setUp() throws MalformedURLException {

        baseURL = "http://demo.guru99.com/test/guru99home/";
        nodeURL = "http://192.168.1.230:4444/wd/hub";

        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability("browserName","chrome");
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