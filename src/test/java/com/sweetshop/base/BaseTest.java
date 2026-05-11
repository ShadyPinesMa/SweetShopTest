package com.sweetshop.base;

import com.sweetshop.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    protected ProductsPage productsPage;
    protected LoginPage loginPage;
    protected BasketPage basketPage;
    protected AccountPage accountPage;

    private String url = "https://sweetshop.vivrichards.co.uk/";

    @BeforeTest(alwaysRun = true)
    public void setUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        homePage = new HomePage();
        productsPage = new ProductsPage();
        loginPage = new LoginPage();
        basketPage = new BasketPage();
        accountPage = new AccountPage();
    }



    @AfterTest(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
