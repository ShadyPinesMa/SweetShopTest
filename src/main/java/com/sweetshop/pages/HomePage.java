package com.sweetshop.pages;

import org.openqa.selenium.By;


public class HomePage extends BasePage {
    private By loginLink = By.xpath("//a[@href='/login']");
    private By browseSweetsButton = By.xpath("//a[@href='/sweets']");
    private By homeHeader = By.xpath("//h1[normalize-space()='Welcome to the sweet shop!']");
    private By basketLink = By.xpath("//a[@href='/basket']");

    public LoginPage clickLoginLink() {
        click(loginLink);
        return new LoginPage();
    }

    public ProductsPage clickBrowseSweetsButton() {
        click(browseSweetsButton);
        return new ProductsPage();
    }

    public boolean isHomeHeaderDisplayed() {
        return find(homeHeader).isDisplayed();
    }

    public BasketPage clickBasketLink() {
        click(basketLink);
        return new BasketPage();
    }



}
