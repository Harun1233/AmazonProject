package com.Amazon.pages;

import com.Amazon.tests.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstHatPage extends BasePage {


    @FindBy(xpath = "//div[@class='a-section aok-relative s-image-square-aspect']")
    public static WebElement firstHat;

    @FindBy(xpath = "//span[@id='price_inside_buybox']")
    public static WebElement priceOfFirstHat;

    public void selectFirstHat(){
        BrowserUtils.waitForVisibility(firstHat,10);
        firstHat.click();
    }

    @Override
    public Double getPrices(WebElement element) {

        return super.getPrices(element);
    }

    @Override
    public String dropDowns(WebElement e, String str) {
        return super.dropDowns(e, str);
    }
}
