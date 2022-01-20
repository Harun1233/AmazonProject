package com.Amazon.tests;

import com.Amazon.pages.CartPage;
import com.Amazon.pages.FirstHatPage;
import com.Amazon.pages.SearchPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTestPOM extends TestBase{

    SearchPage searchPage=new SearchPage();
    FirstHatPage firstHat=new FirstHatPage();
    CartPage cart=new CartPage();
    double priceOfHat=0.0;
    double totalPrice=0.0;
    String quantity="";

    @Test
    public void test1(){

        quantity="2";
        searchPage.setSearchBox();
        firstHat.selectFirstHat();
        priceOfHat= firstHat.getPrices(FirstHatPage.priceOfFirstHat);
        totalPrice=firstHat.dropDowns(FirstHatPage.quantityDropDown,quantity)*priceOfHat;
        firstHat.addToCart();
        cart.navigateTo(CartPage.cartButton);
        Double cartPagePrices = cart.getPrices(CartPage.totalPriceOfCart);
        Assert.assertTrue(totalPrice==cartPagePrices,"Verify that the cart page prices matches with the correct amount");



    }


}
