package com.sweetshop.pages;

import org.openqa.selenium.By;

public class AccountPage extends BasePage{
    //Orders placed number (id) : "accountOrderCount"
    //Past transactions (id) : "transactions"

    private By numberOfOrdersPlaced = By.id("accountOrderCount");
    private By pastTransactions = By.id("transactions");
    private By homePageLink = By.xpath("//a[contains(@class, 'navbar-brand)]");
    private By accountHeader = By.xpath("//h1[normalize-space()='Your Account']");

    public String NumberOfOrdersPlacedDisplayed() {
        return find(numberOfOrdersPlaced).getText();
    }

    public boolean arePastTransactionsDisplayed() {
        return find(pastTransactions).isDisplayed();
    }

    public HomePage goToHomePage() {
        click(homePageLink);
        return new HomePage();
    }

    public boolean isAccountHeaderDisplayed() {
        return find(accountHeader).isDisplayed();
    }
}
