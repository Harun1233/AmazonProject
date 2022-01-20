package com.Amazon.tests;

import com.Amazon.pages.FirstHatPage;
import com.Amazon.pages.SearchPage;

import org.testng.annotations.Test;

public class AmazonTestPOM extends TestBase{

    SearchPage searchPage=new SearchPage();
    FirstHatPage firstHat=new FirstHatPage();
    double priceOfHat=0.0;
    double totalPrice=0.0;

    @Test
    public void test1(){

        searchPage.setSearchBox();
        firstHat.selectFirstHat();
        priceOfHat= firstHat.getPrices(FirstHatPage.priceOfFirstHat);
        totalPrice=firstHat.dropDowns(FirstHatPage.quantityDropDown,"2")*priceOfHat;
        firstHat.addToCart();


    }


}
