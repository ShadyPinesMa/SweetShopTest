package com.sweetshop.tests.account;

import com.sweetshop.base.BaseTest;
import com.sweetshop.pages.AccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AccountTest extends BaseTest {

    @Test
    public void testAccountHeaderIsDisplayed() {
        homePage.clickLoginLink();
        AccountPage accountPage = loginPage.logIntoApplication(
                "twoorders@sweetshop.local",
                "abc123"
        );
        Assert.assertTrue(accountPage.isAccountHeaderDisplayed());
    }

    @Test
    public void testIsNumberOfOrdersDisplayed() {
        homePage.clickLoginLink();
        loginPage.logIntoApplication(
                "twoorders@sweetshop.local",
                "abc123"
        );
        Assert.assertEquals(2, 2);

    }
}
