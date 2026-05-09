package com.sweetshop.pages;

import org.openqa.selenium.By;

public class AccountPage extends BasePage{
    //Orders placed number (id) : "accountOrderCount"
    //Past transactions (id) : "transactions"

    private By numberOfOrdersPlaced = By.id("accountOrderCount");
    private By pastTransactions = By.id("transactions");
    private By homePageLink = By.xpath("//a[contains(@class, 'navbar-brand)]");

    public boolean isNumberOfOrdersPlacedDisplayed() {
        return find(numberOfOrdersPlaced).isDisplayed();
    }

    public boolean arePastTransactionsDisplayed() {
        return find(pastTransactions).isDisplayed();
    }

    public HomePage goToHomePage() {
        click(homePageLink);
        return new HomePage();
    }
}
