package com.sweetshop.base;

import com.sweetshop.pages.BasePage;
import com.sweetshop.pages.HomePage;
import com.sweetshop.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    protected ProductsPage productsPage;

    private String url = "https://sweetshop.vivrichards.co.uk/";

    @BeforeClass
    public void setUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        basePage = new BasePage();
        homePage = new HomePage();
        productsPage = new ProductsPage();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
