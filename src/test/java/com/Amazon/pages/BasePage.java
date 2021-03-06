package com.Amazon.pages;

import com.Amazon.tests.utilities.BrowserUtils;
import com.Amazon.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public abstract class BasePage {

    BrowserUtils browserUtils;
    Select select;

    public BasePage() {
        PageFactory.initElements(Driver.get(),this);

    }
    public void navigateTo(WebElement e){
        browserUtils=new BrowserUtils();
        browserUtils.waitForVisibility(e,10);
        e.click();
    }

    //selects quantities and returns selected quantity
    public double dropDowns(WebElement e, String str) {
        select = new Select(e);
        select.selectByVisibleText(str);

        return Double.parseDouble(str);
    }

    public Double getPrices(WebElement element){

        double priceOfItems=0.0;
        try{
            String ItemPrice = element.getText().substring(1);

             priceOfItems=Double.parseDouble(ItemPrice);

        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
            System.out.println("Getting prices did not work");
        }


        return priceOfItems;
    }




}
