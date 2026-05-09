package com.sweetshop.pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage{

    //chocolate cups xpath "//*[@data-name='Chocolate Cups']"
    //sherbert discs xpath "//*[@data-name='Sherbert Discs']"
    //Bon bons xpath "//*[@data-name='Strawberry Bon Bons']"
    //jellies xpath "//*[@data-name='Jellies']"
    //fruit salads xpath "//*[@data-name='Fruit Salads']"

    //wham bars "//*[@data-name='Wham Bar']"
    //chocolate beans "//*[@data-name='Chocolate Beans']"
    //nerds "//*[@data-name='Nerds']"

    //go to basket link : //a[@href='/basket']
    private By chocolateCups = By.xpath("//*[@data-name='Chocolate Cups']");
    private By sherbertDiscs = By.xpath("//*[@data-name='Sherbert Discs']");
    private By bonbons = By.xpath("//*[@data-name='Strawberry Bon Bons']");
    private By jellies = By.xpath("//*[@data-name='Jellies']");
    private By fruitSalads = By.xpath("//*[@data-name='Fruit Salads']");
    private By whamBars = By.xpath("//*[@data-name='Wham Bar']");
    private By chocolateBeans = By.xpath("//*[@data-name='Chocolate Beans']");
    private By nerds = By.xpath("//*[@data-name='Nerds']");
    private By homePageLink = By.xpath("//a[contains(@class, 'navbar-brand)]");
    private By basketLink = By.xpath("//a[@href='/basket']");
    private By productsHeader = By.xpath("//h1[text()='Browse sweets']");

    public void addChocolateCupsToBasket() {
        click(chocolateCups);
    }

    public void addSherbertDiscsToBasket() {
        click(sherbertDiscs);
    }

    public void addBonBonsToBasket() {
        click(bonbons);
    }

    public void addJelliesToBasket() {
        click(jellies);
    }

    public void addFruitSaladsToBasket() {
        click(fruitSalads);
    }

    public void addWhamBarsToBasket() {
        click(whamBars);
    }

    public void addChocolateBeansToBasket() {
        click(chocolateBeans);
    }

    public void addNerdsToBasket() {
        click(nerds);
    }

    public HomePage goToHomePage() {
        click(homePageLink);
        return new HomePage();
    }

    public BasketPage goToBasketPage() {
        click(basketLink);
        return new BasketPage();
    }

    public boolean isProductsHeaderDisplayed() {
        return find(productsHeader).isDisplayed();
    }
}
