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
    @Parameters("nameSearch")
    @Test
    public void TestImagesLinkGooglePage(String nameSearch) throws Exception {
        Log.info("Found Images Link Name");
        String language= GetPageAction.GetLinkImagesGoogle();
        assertEquals(language,nameSearch);
    }

    @Parameters("listNumber")
    @Test
    public void testSearchItems(int listNumber) throws Exception {
        Log.info("Search Selenium Items in Google");
        GetPageAction.SearchGooglePage();
        int listSeleniumSize= GetPageAction.FoundListNumber();
        assertEquals(listNumber,listSeleniumSize);
    }

    @AfterTest
    public void tearDown()
    {
        Util.closeAllDriver();
        Log.endTestCase("Complete ");
    }


}