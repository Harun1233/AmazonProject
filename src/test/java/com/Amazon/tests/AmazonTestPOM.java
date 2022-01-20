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
    String quantityOfItem="";
    String quantityOfCart="";

    @Test
    public void test1(){

        quantityOfItem="2";
        searchPage.setSearchBox();
        firstHat.selectFirstHat();
        priceOfHat= firstHat.getPrices(FirstHatPage.priceOfFirstHat);
        totalPrice=firstHat.dropDowns(FirstHatPage.quantityDropDown,quantityOfItem)*priceOfHat;
        firstHat.addToCart();
        cart.navigateTo(CartPage.cartButton);
        Double cartPagePrices = cart.getPrices(CartPage.totalPriceOfCart);
        //Verify the total price is correct
        Assert.assertTrue(totalPrice==cartPagePrices,"Verify that the cart page prices matches with the correct amount");
        quantityOfCart=cart.getTextOfCartQuantity(CartPage.quantityOfCart);
        //Verify that selected item quantity is correct
        Assert.assertEquals(quantityOfCart,quantityOfItem,"Verify that quantity of cart page is equal selected quantity");

        quantityOfCart="1";

        totalPrice=cart.dropDowns(CartPage.quantityOfCart,quantityOfCart)*priceOfHat;
        //Verify that quantity in Cart page has been changed successfully
        Assert.assertEquals(quantityOfCart,cart.getTextOfCartQuantity(CartPage.quantityOfCart));
        //Verify that total price has been changed successfully
        Assert.assertTrue(totalPrice==priceOfHat,"Verify that total price has been changed");


    }


}
