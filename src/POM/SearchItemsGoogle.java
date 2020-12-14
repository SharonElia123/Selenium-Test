package POM;
import Log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;

public   class SearchItemsGoogle {
    WebDriver driver;

    @FindBy(how = How.NAME, using ="q")

    public WebElement  Search_Items;

    @FindBy(how = How.CLASS_NAME, using ="sbtc")

    public WebElement  ClickSearch;



// This is a constructor, as every page need a base driver to find web elements

    public SearchItemsGoogle(WebDriver driver)

    {

        this.driver = driver;

    }

    public SearchItemsGoogle() {

    }


}
