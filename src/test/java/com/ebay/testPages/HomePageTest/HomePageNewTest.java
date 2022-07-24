package com.ebay.testPages.HomePageTest;

import com.ebay.pages.HomePage;

import configuration.common.WebTestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static configuration.common.GlobalReUsableMethods.*;
import static configuration.common.GlobalReUsableMethods.getCurrentUrl;

public class HomePageNewTest extends WebTestBase {
    HomePage homePage;

    @BeforeMethod
    public void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }
    @Test
    public void verifyCostcoSearchBox() throws InterruptedException {
        homePage.checkSearchBoxWithValidProducts("Designer Handbags");
        waitFor(3);
        navigateBack();
        waitFor(2);
        navigateForward();
        waitFor(2);
        System.out.println("Current URL==========> " + getCurrentUrl());



    }





}
