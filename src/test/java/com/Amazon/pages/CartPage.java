package com.Amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(css = "nav-cart-count-container")
    public static WebElement cartButton;

    @Override
    public void navigateTo(WebElement e) {
        super.navigateTo(e);
    }
}
