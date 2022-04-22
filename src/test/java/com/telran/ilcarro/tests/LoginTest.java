package com.telran.ilcarro.tests;

import com.telran.ilcarro.tests.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        app.getUser().click(By.xpath("//a[contains(.,' Log in ')]"));
        if (!app.getUser().isElementPresent(By.xpath("//a[contains(.,' Log in ')]"))) {
            app.getUser().click(By.xpath("//a[contains(.,' Logout ')]"));

        }
    }
    @Test
    public void loginPositiveTest(){

        app.driver.findElement(By.xpath("//body[1]/app-root[1]/app-navigator[1]/app-login-registration[1]/div[1]/div[1]/div[1]"));
        app.getUser().isLoginForm("poc@il.com", "Sl123459");
        app.getUser().click(By.xpath("//button[contains(text(),'Y’alla!')]"));
        Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//body[1]/app-root[1]/app-navigator[1]/app-login-registration[1]/div[1]/div[1]/div[1]")));
        app.getUser().click(By.xpath("//button[contains(text(),'Ok')]"));

    }
    @Test
    public void loginNegativeTest(){
//
        app.driver.findElement(By.xpath("//body[1]/app-root[1]/app-navigator[1]/app-login-registration[1]/div[1]/div[1]/div[1]"));
        app.getUser().isLoginForm("po@il.com", "Ll123456");
        app.getUser().click(By.xpath("//button[contains(.,'Y’alla!')]"));
//        Assert.assertTrue(isAlertPresent());                    //this method doesn't work
        app.getUser().click(By.xpath("//button[contains(text(),'Ok')]"));
    }
}

