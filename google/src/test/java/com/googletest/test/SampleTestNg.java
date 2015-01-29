package com.googletest.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by alexg on 29/01/15.
 */
public class SampleTestNg {
    public String baseUrl = ("http://newtours.demout.com");
    public WebDriver driver;

    @BeforeTest
    public void setBaseUrl(){
        driver = new ChromeDriver();
        driver.get(baseUrl);


    }

    @Test
    public void verifyHomePageTitle(){

        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @After
    public void endSession(){
        driver.quit();

    }

}
