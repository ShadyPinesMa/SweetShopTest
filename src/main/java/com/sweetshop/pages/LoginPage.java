package com.sweetshop.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private By emailField = By.id("exampleInputEmail");
    private By passwordField = By.id("exampleInputPassword");
    private By loginButton = By.id("btn_login");
    private By emailErrorMessage = By.xpath("//div[contains(@class, 'invalid-email)]");
    private By passwordErrorMessage = By.xpath("//div[contains(@class, 'invalid-password)]");

    public void setEmail(String email) {
        set(emailField, email);
    }

    public void setPassword(String password) {
        set(passwordField, password);
    }

    public AccountPage clickLoginButton() {
        click(loginButton);
        return new AccountPage();
    }

    public AccountPage logIntoApplication(String email, String password) {
        setEmail(email);
        setPassword(password);
        return clickLoginButton();
    }

    public String getEmailErrorMessage() {
        return find(emailErrorMessage).getText();
    }

    public String getPasswordErrorMessage() {
        return find(passwordErrorMessage).getText();
    }
}
