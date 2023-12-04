package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopManuTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void verifyPageNavigation() {

        homePage.selectMenu("Gift Cards");
        Assert.assertEquals(homePage.getTitleOfPage(), "Gift Cards", "Page Navigated Successfully");
    }

}
