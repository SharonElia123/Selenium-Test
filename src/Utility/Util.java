package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.HashMap;
import java.util.Map;

public class Util {
    private static  Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
    /*
     * Factory method for getting browsers
     */
    public static WebDriver getBrowser(String browserName) {
        WebDriver driver = null;
        //
        switch (browserName) {
            case "Firefox":
                driver = drivers.get("fox");
                if (driver == null) {
                    System.setProperty("webdriver.chrome.driver",
                            "C:\\Chrome\\chromedriver.exe");
                    driver = new ChromeDriver();
                    drivers.put("fox", driver);
                }
                break;
            case "IE":
                driver = drivers.get("ccc");
                if (driver == null) {
                    System.setProperty("webdriver.chrome.driver",
                            "C:\\Chrome\\chromedriver.exe");
                    driver = new ChromeDriver();
                    drivers.put("Chrome", driver);
                }
                break;
                case "Chrome":
                driver = drivers.get("Chrome");
                if (driver == null) {
                    System.setProperty("webdriver.chrome.driver",
                            "C:\\Chrome\\chromedriver.exe");
                    driver = new ChromeDriver();
                    drivers.put("Chrome", driver);
                }
                break;
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeAllDriver() {
        for (String key : drivers.keySet()) {
            drivers.get(key).close();
            drivers.get(key).quit();

        }
    }
}



