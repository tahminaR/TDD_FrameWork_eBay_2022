package com.ebay.pages;

import configuration.common.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.ebay.pageElement.HomePageElements.*;
import static configuration.common.GlobalReUsableMethods.clickOnElement;
import static configuration.common.GlobalReUsableMethods.enterValueOnElement;
import static configuration.utilities.DataDriven.getItemsListFromDB;

public class HomePage extends WebTestBase {




    // Modern Approach: @FindBy
    @FindBy(xpath = ebaySearchBoxWebElement)
    public WebElement ebaySearchBox;
    @FindBy(xpath = ebaySearchButtonWebElement)
    public WebElement ebaySearchButton;


    public void checkSearchBoxWithValidProducts(String productName) throws InterruptedException {
        enterValueOnElement(ebaySearchBox, productName);
        waitFor(3);
        clickOnElement(ebaySearchButton);
    }






}
