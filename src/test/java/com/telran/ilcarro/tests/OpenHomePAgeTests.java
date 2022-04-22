package com.telran.ilcarro.tests;

import com.telran.ilcarro.tests.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OpenHomePAgeTests extends TestBase {

    @Test
    public void openHomePageTest(){
        System.out.println("Opened home page");
        app.getUser().isElementPresent(By.cssSelector("body:nth-child(2) app-root:nth-child(1) app-navigator:nth-child(1)"));
        System.out.println("Sign up component: " + app.getHeader().isSignUpTabPresent());
    }

}
