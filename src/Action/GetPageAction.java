package Action;
import POM.POMTest;
import POM.SearchItemsGoogle;
import Utility.BaseClass;
import Utility.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GetPageAction {
    static WebDriver driver=null;
    public static void StartGooglePage(String browserName) throws Exception {
        driver= Util.getBrowser(browserName);
        new BaseClass(driver);
        driver.get("https://google.co.il");

    }
    public static String GetLinkImagesGoogle() throws Exception {
        String language=POMTest.GoogleImagesLink().getText();
        return language;
    }
    public static String GetGoogleButtonName() throws Exception {
        String language=POMTest.GoogleImagesLink().getText();
        return language;
    }
    public static void SearchGooglePage() throws Exception {
        SearchItemsGoogle HomePage = PageFactory.initElements(driver, SearchItemsGoogle.class);
        HomePage.Search_Items.sendKeys("Selenium");
        Thread.sleep(1000);
        ClickSearch();


    }
    public static void ClickSearch() throws Exception {
        SearchItemsGoogle HomePage = PageFactory.initElements(driver, SearchItemsGoogle.class);
        HomePage.ClickSearch.click();
        System.out.println("Found Successfully, now it is the time to Log Off buddy.");

    }
    public static int FoundListNumber() throws Exception {
        Thread.sleep(3000);
        List<WebElement> allInputElements=POMTest.SeleniumFoundSearch();
        int seleniumInputSize= allInputElements.size();
        System.out.println("Send the size of selenium pages size");
        return seleniumInputSize;
    }

}
