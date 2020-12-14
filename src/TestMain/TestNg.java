package TestMain;
import Action.GetPageAction;
import POM.SearchItemsGoogle;
import org.apache.log4j.xml.DOMConfigurator;

import org.testng.annotations.*;
import Log.Log;
import Utility.Util;
import static org.junit.Assert.*;
class TestNg {

    @Parameters("browserName")
    @BeforeTest
    public void beforeMethod(String browserName) throws Exception {
        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase("Selenium_Test_001");
        GetPageAction.StartGooglePage(browserName);
    }

    @Test
    public void TestImagesLinkGooglePage() throws Exception {
        Log.info("Found Images Link Name");
        String language= GetPageAction.GetLinkImagesGoogle();
        assertEquals(language,"חיפוש תמונות");
    }

    @Test
    public void TestButttonLinkGooglePage() throws Exception {
        Log.info("Found button Link Name");
        String buttonMame= GetPageAction.GetGoogleButtonName();
        assertEquals(buttonMame,"חיפוש תמונות");

    }
    @Test
    public void testSearchItems() throws Exception {
        Log.info("Search Selenium Items in Google");
        GetPageAction.SearchGooglePage();
        int listSeleniumSize= GetPageAction.FoundListNumber();
        assertEquals(9,listSeleniumSize);
    }

    @AfterTest

    public void tearDown()
    {
        Util.closeAllDriver();
        Log.endTestCase("Complete ");
    }


}