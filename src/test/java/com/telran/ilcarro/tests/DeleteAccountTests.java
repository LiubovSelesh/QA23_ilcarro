package com.telran.ilcarro.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteAccountTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        app.getUser().click(By.xpath("//a[contains(.,' Log in ')]"));
        app.getUser().isLoginForm("poc@il.com", "Sl123459");
        app.getUser().click(By.xpath("//button[contains(text(),'Y’alla!')]"));
        Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//body[1]/app-root[1]/app-navigator[1]/app-login-registration[1]/div[1]/div[1]/div[1]")));
        app.getUser().click(By.xpath("//button[contains(text(),'Ok')]"));
//

    }
   @Test
    public void deleteAccountTest(){   //Test doesn't work

       app.getUser().click(By.xpath("//a[contains(text(.,'Delete account')]"));
       app.getUser().click(By.xpath(" //button[contains(text(),'Delete')]"));
       app.getUser().click(By.xpath("//a[contains(text(.,'Delete account')]"));



    }
}

