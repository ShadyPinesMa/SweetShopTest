package com.sweetshop.pages;

import org.openqa.selenium.By;

public class AccountPage extends BasePage{
    //Orders placed number (id) : "accountOrderCount"
    //Past transactions (id) : "transactions"
    private By numberOfOrdersPlaced = By.id("accountOrderCount");
    private By pastTransactions = By.id("transactions");

    public boolean isNumberOfOrdersPlacedDisplayed() {
        return find(numberOfOrdersPlaced).isDisplayed();
    }

    public boolean arePastTransactionsDisplayed() {
        return find(pastTransactions).isDisplayed();
    }
}
