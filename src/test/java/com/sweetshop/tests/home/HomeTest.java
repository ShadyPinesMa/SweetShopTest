package com.sweetshop.tests.home;

import com.sweetshop.base.BaseTest;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    @Test
    public void testGoToProducts() {
        homePage.clickBrowseSweetsButton();

    }
}
