package com.sweetshop.pages;

import org.openqa.selenium.By;

public class BasketPage extends BasePage{
    //first name field "//label[text()='firstName']/preceding-sibling::input"
    //last name field "//label[text()='lastName']/following-sibling::input"
    //email field (id) "email"
    //address 1 (id) "address"
    //address 2 (id) "address2"
    //country (id) "country"
    //city (id) "city"
    //zip (id) "zip"
    //ccname (id) "cc-name"
    //ccnum (id) "cc-number"
    //expiration date (id) "cc-expiration"
    //cvv (id) "cc-cvv"
    //checkout button "//button[contains(text(), 'checkout')]"
    //radio button free shipping "//label[radio()='exampleRadios1']"
    //radio button standard shipping "//label[radio()='exampleRadios2']"
    //empty basket "//a[@href='#']"

    private By firstNameField = By.xpath("//label[text()='firstName']/preceding-sibling::input");
    private By lastNameField = By.xpath("//label[text()='lastName']/following-sibling::input");
    private By emailField = By.id("email");
    private By address1Field = By.id("address");
    private By address2Field = By.id("address2");
    private By countryField = By.id("country");
    private By cityField = By.id("city");
    private By zipField = By.id("zip");
    private By cardNameField = By.id("cc-name");
    private By cardNumField = By.id("cc-number");
    private By expDateField = By.id("cc-expiration");
    private By cvvField = By.id("cc-cvv");
    private By checkoutButton = By.xpath("//button[contains(text(), 'checkout')]");
    private By radioBtnFreeShipping = By.xpath("//label[radio()='exampleRadios1']");
    private By radioBtnStandardShipping = By.xpath("//label[radio()='exampleRadios2']");
    private By emptyBasketLink = By.xpath("//a[@href='#']");
    private By homePageLink = By.xpath("//a[contains(@class, 'navbar-brand)]");

    public void setFirstName(String firstName) {
        set(firstNameField, firstName);
    }

    public void setLastName(String lastName) {
        set(lastNameField, lastName);
    }

    public void setEmail(String email) {
        set(emailField, email);
    }

    public void setAddress1(String addressPt1) {
        set(address1Field, addressPt1);
    }

    public void setAddress2(String addressPt2) {
        set(address2Field, addressPt2);
    }

    public void setCountry(String country) {
        set(countryField, country);
    }

    public void setCity(String city) {
        set(cityField, city);
    }

    public void setZip(int zip) {
        set(zipField, String.valueOf(zip));
    }

    public void setCardName(String cardName) {
        set(cardNameField, cardName);
    }

    public void setCardNum(int cardNum) {
        set(cardNumField, String.valueOf(cardNum));
    }

    public void setExpDate(int expDate) {
        set(expDateField, String.valueOf(expDate));
    }

    public void setCvv(int cvv) {
        set(cvvField, String.valueOf(cvv));
    }

    public HomePage goToHomePage() {
        click(homePageLink);
        return new HomePage();
    }
}
