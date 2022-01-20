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

        //Search for required item
        searchPage.setSearchBox();

        //Select the first displayed product
        firstHat.selectFirstHat();

        //Get the price of seelcted product
        priceOfHat= firstHat.getPrices(FirstHatPage.priceOfFirstHat);

        //Get the total price after quantity changed
        totalPrice=firstHat.dropDowns(FirstHatPage.quantityDropDown,quantityOfItem)*priceOfHat;

        //Add the product to the cart
        firstHat.addToCart();

        //Go to the cart page
        cart.navigateTo(CartPage.cartButton);

        //Get the displayed price on cart page
        Double cartPagePrices = cart.getPrices(CartPage.totalPriceOfCart);

        //Verify the total price is correct
        Assert.assertTrue(totalPrice==cartPagePrices,"Verify that the cart page prices matches with the correct amount");

        //Get the quantity of products which is displayed on cart page
        quantityOfCart=cart.getTextOfCartQuantity(CartPage.quantityOfCart);

        //Verify that selected item quantity is correct
        Assert.assertEquals(quantityOfCart,quantityOfItem,"Verify that quantity of cart page is equal selected quantity");

        //Change the qunatity on cart page
        quantityOfCart="1";
        totalPrice=cart.dropDowns(CartPage.quantityOfCart,quantityOfCart)*priceOfHat;

        //Verify that quantity in Cart page has been changed successfully
        Assert.assertEquals(quantityOfCart,cart.getTextOfCartQuantity(CartPage.quantityOfCart));

        //Verify that total price has been changed successfully
        Assert.assertTrue(totalPrice==priceOfHat,"Verify that total price has been changed");


    }


}
