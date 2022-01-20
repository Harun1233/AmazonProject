package com.Amazon.pages;

import com.Amazon.tests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CartPage extends BasePage{
    Select select;

    @FindBy(css = "#sw-gtc")
    public static WebElement cartButton;

    @FindBy(xpath = "//select[@name='quantity']")
    public static WebElement quantityOfCart;

    @FindBy(xpath = "//*[@id='sc-subtotal-amount-buybox']//span")
    public static WebElement totalPriceOfCart;

    public String getTextOfCartQuantity(WebElement element){

        select=new Select(element);

        return select.getFirstSelectedOption().getText();

    }

    public void changeQuantityOfCart(WebElement element,String str){

        select=new Select(element);

        select.selectByVisibleText(str);

    }

}
