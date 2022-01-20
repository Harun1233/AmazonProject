package com.Amazon.tests;

import com.Amazon.pages.FirstHatPage;
import com.Amazon.pages.SearchPage;

import org.testng.annotations.Test;

public class AmazonTestPOM extends TestBase{


    SearchPage searchPage=new SearchPage();
    FirstHatPage firstHat=new FirstHatPage();

    @Test
    public void test1(){

        searchPage.setSearchBox();
        firstHat.selectFirstHat();
        firstHat.getPrices(FirstHatPage.priceOfFirstHat);

    }


}
