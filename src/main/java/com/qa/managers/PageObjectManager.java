package com.qa.managers;

import com.pages.PageDetails;
import com.qa.util.ElementUtil;
import org.openqa.selenium.WebDriver;

public class PageObjectManager extends DriverManager {
    public DriverManager driverManager;
    public ElementUtil elementUtil;
    //public CurrencyCalcPage currencyCalcPage;
    public PageDetails pageDetails;
    protected WebDriver driver = getDriver();

    public void launchBrowser() {
        driverManager = new DriverManager();
        elementUtil = new ElementUtil(driver);
        pageDetails = new PageDetails(driver);

    }
}
