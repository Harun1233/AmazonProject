package com.Amazon.pages;

import com.Amazon.tests.utilities.BrowserUtils;
import com.Amazon.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstHatPage extends BasePage {


    @FindBy(xpath = "//div[@class='a-section aok-relative s-image-square-aspect']")
    public static WebElement firstHat;

    @FindBy(xpath = "//span[@id='price_inside_buybox']")
    public static WebElement priceOfFirstHat;

    @FindBy(xpath = "//select[@name='quantity']")
    public static WebElement quantityDropDown;



    public void selectFirstHat(){
        BrowserUtils.waitForVisibility(firstHat,10);
        firstHat.click();
    }

    @Override
    public Double getPrices(WebElement element) {

        return super.getPrices(element);
    }

    @Override
    public double dropDowns(WebElement e, String str) {
        return super.dropDowns(e, str);
    }

    public void addToCart(){
        WebElement addToCart= Driver.get().findElement(By.cssSelector("#add-to-cart-button"));
        addToCart.click();

    }
}
