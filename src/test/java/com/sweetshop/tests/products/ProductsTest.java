package com.sweetshop.tests.products;

import com.sweetshop.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {
    @Test
    public void testViewProducts() {
        homePage.clickBrowseSweetsButton();
        Assert.assertTrue(productsPage.isProductsHeaderDisplayed(),
                "\n Products Header is not Displayed \n");
    }
}
