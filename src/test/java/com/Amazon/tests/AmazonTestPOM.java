package com.Amazon.tests;

import com.Amazon.pages.SearchPage;
import org.testng.annotations.Test;

public class AmazonTestPOM extends TestBase{

    SearchPage searchPage=new SearchPage();

    @Test
    public void test1(){

        searchPage.setSearchBox();
    }


}
