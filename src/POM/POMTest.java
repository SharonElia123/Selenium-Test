package POM;
import Utility.BaseClass;
import org.openqa.selenium.By;
import Log.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utility.ScreenShut;

import java.util.List;

public class POMTest extends BaseClass {
    static ScreenShut screenExeption= new ScreenShut ();
    private static WebElement element = null;
    public POMTest(WebDriver driver){
        super(driver);
    }
    public static WebElement GoogleSearch() throws Exception{
        try{
            element = driver.findElement(By.xpath(".//*[@name='q']"));
            Log.info("My Account link is found on the Home Page");

        }catch (Exception e){
            Log.error("My Acocunt link is not found on the Home Page");
            screenExeption.ScreenShut(driver);
            throw(e);
        }

        return element;

    }
    public static WebElement GoogleImagesLink() throws Exception{
        try{
            element = driver.findElement(By.xpath("(//*[@class='gb_g'])[2]"));
            Log.info("Images link is found on the Home Page");

        }catch (Exception e){
            Log.error("Images link link is not found on the Home Page");
            screenExeption.ScreenShut(driver);
            throw(e);
        }
        return element;

    }
    public static WebElement GoogleButton() throws Exception{
        try{
            element = driver.findElement(By.xpath("(//*[@class='gNO89b'])[1]"));
            Log.info("Google Button is found on the Home Page");

        }catch (Exception e){
            Log.error("Google Button is not found on the Home Page");
            screenExeption.ScreenShut(driver);
            throw(e);
        }
        return element;

    }
    public static List<WebElement> SeleniumFoundSearch() throws Exception{
        try{
            List<WebElement> allInputElements = driver.findElements(By.xpath("//*[@class='LC20lb DKV0Md']"));
            Log.info("The list of Selenium from Google");
            return allInputElements;}
        catch (Exception e){
            Log.error("Google Button is not found on the Home Page");
            screenExeption.ScreenShut(driver);
            throw(e);
        }

    }


}
