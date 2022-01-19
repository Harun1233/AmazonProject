package com.Amazon.pages;

import com.Amazon.tests.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    @FindBy(css = "#twotabsearchtextbox")
    public WebElement searchBox;

    public void setSearchBox() {
        searchBox.sendKeys(ConfigurationReader.get("searchItem"), Keys.ENTER);
    }



}
