package com.Amazon.pages;

import com.Amazon.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(),this);

    }
    public void navigateTo(WebElement e){
        e.click();
    }

}
