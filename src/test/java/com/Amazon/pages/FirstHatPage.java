package com.Amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstHatPage extends BasePage {

    @FindBy(xpath = "//div[@class='a-section a-spacing-base'][1]//div[3]//div//a//span//span[1]")
    public WebElement firstHat;

    public void selectFirstHat(){
        firstHat.click();
    }

    @Override
    public Double getPrices(WebElement element) {
        element=firstHat;
        return super.getPrices(element);
    }
}
