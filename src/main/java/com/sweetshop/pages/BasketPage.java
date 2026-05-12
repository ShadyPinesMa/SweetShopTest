package com.sweetshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BasketPage extends BasePage{
    //first name field "//label[text()='firstName']/preceding-sibling::input"
    //last name field "//label[text()='lastName']/following-sibling::input"
    //email field (id) "email"
    //address 1 (id) "address"
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

    //firstNameError "//div[normalize-space()='Valid first name is required.']"
    //lastNameError "//div[normalize-space()='Valid last name is required.']"
    //emailError "//div[normalize-space()='Please enter a valid email address for shipping updates.']"
    //addressError "//div[normalize-space()='Please enter your shipping address.']"
    //countryError "//div[normalize-space()='Please select a valid country.']"
    //cityError "//div[normalize-space()='Please provide a valid state.']"
    //zipError "//div[normalize-space()='Zip code required.']"
    //cardNameError "//div[normalize-space()='Name on card is required']"
    //cardNumError "//div[normalize-space()='Credit card number is required']"
    //expDateError "//div[normalize-space()='Expiration date required']"
    //cvvError "//div[normalize-space()='Security code required']"

    private By firstNameField = By.xpath("//label[text()='firstName']/preceding-sibling::input");
    private By lastNameField = By.xpath("//label[text()='lastName']/following-sibling::input");
    private By emailField = By.id("email");
    private By address1Field = By.id("address");
    private By countryDropDown = By.id("country");
    private By cityDropDown = By.id("city");
    private By zipField = By.id("zip");
    private By cardNameField = By.id("cc-name");
    private By cardNumField = By.id("cc-number");
    private By expDateField = By.id("cc-expiration");
    private By cvvField = By.id("cc-cvv");
    private By checkoutButton = By.xpath("//button[contains(text(), 'checkout')]");
    private By radioBtnFreeShipping = By.xpath("//label[radio()='exampleRadios1']");
    private By radioBtnStandardShipping = By.xpath("//label[radio()='exampleRadios2']");
    private By emptyBasketLink = By.xpath("//a[@href='#']");
    private By basketHeader = By.xpath("//h1[normalize-space()='Your Basket']");
    private By yourBasket = By.xpath("//ul[@id='basketItems']");

    //ERRORS

    private By firstNameError = By.xpath("//div[normalize-space()='Valid first name is required.']");
    private By lastNameError = By.xpath("//div[normalize-space()='Valid last name is required.']");
    private By emailError = By.xpath("//div[normalize-space()='Please enter a valid email address for shipping updates.']");
    private By addressError = By.xpath("//div[normalize-space()='Please enter your shipping address.']");
    private By countryError = By.xpath("//div[normalize-space()='Please select a valid country.']");
    private By cityError = By.xpath("//div[normalize-space()='Please provide a valid state.']");
    private By zipError = By.xpath("//div[normalize-space()='Zip code required.']");
    private By cardNameError = By.xpath("//div[normalize-space()='Name on card is required']");
    private By cardNumError = By.xpath("//div[normalize-space()='Credit card number is required']");
    private By expDateError = By.xpath("//div[normalize-space()='Expiration date required']");
    private By cvvError = By.xpath("//div[normalize-space()='Security code required']");


    public void setFirstName(String firstName) {set(firstNameField, firstName);}

    public void setLastName(String lastName) {set(lastNameField, lastName);}

    public void setEmail(String email) {set(emailField, email);}

    public void setAddress1(String addressPt1) {set(address1Field, addressPt1);}

    public void setCountry(String country) {set(countryDropDown, country);}

    public void setCity(String city) {set(cityDropDown, city);}

    public void setZip(int zip) {set(zipField, String.valueOf(zip));}

    public void setCardName(String cardName) {set(cardNameField, cardName);}

    public void setCardNum(int cardNum) {set(cardNumField, String.valueOf(cardNum));}

    public void setExpDate(int expDate) {set(expDateField, String.valueOf(expDate));}

    public void setCvv(int cvv) {set(cvvField, String.valueOf(cvv));}

    public void clickCheckoutButton() {click(checkoutButton);}

    public void clickFreeShipping() {click(radioBtnFreeShipping);}

    public void clickStandardShipping() {click(radioBtnStandardShipping);}

    public void clearBasket() {click(emptyBasketLink);}

    public boolean isBasketHeaderDisplayed() {
        return find(basketHeader).isDisplayed();
    }

    public String getFirstNameError() {
        return find(firstNameError).getText();
    }

    public String getLastNameError() {
        return find(lastNameError).getText();
    }

    public String getEmailError() {
        return find(emailError).getText();
    }

    public String getAddressError() {
        return find(addressError).getText();
    }

    public String getCountryError() {
        return find(countryError).getText();
    }

    public String getCityError() {
        return find(cityError).getText();
    }

    public String getZipError() {
        return find(zipError).getText();
    }

    public String getCardNameError() {
        return find(cardNameError).getText();
    }

    public String getCardNumError() {
        return find(cardNumError).getText();
    }

    public String getExpDateError() {
        return find(expDateError).getText();
    }

    public String getCvvError() {
        return find(cvvError).getText();
    }

    public boolean isProductInBasket(String productName) {
        List<WebElement> items = driver.findElements(yourBasket);
        for (WebElement item : items) {
            if(item.getText().contains(productName)) {
                return true;
            }
        }
        return false;
    }
}
