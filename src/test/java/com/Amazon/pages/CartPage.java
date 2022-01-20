package com.Amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(css = "nav-cart-count-container")
    public static WebElement cartButton;

    @FindBy(xpath = "//select[@name='quantity']")
    public static WebElement quantityOfCart;

    @FindBy(xpath = "//*[@id='sc-subtotal-amount-buybox']//span")
    public static WebElement totalPriceOfCart;


}
