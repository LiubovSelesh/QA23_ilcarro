package com.telran.ilcarro.tests;

import com.telran.ilcarro.model.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteAccountTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        app.getUser().click(By.xpath("//a[contains(.,' Sign up ')]"));
        int i = (int) ((System.currentTimeMillis() / 1000 % 3600));
        app.getUser().fillRegistrationForm(new User().setName("Li").setLastName("us")
                .setEmail("pol" + i + "@il.com").setPassword("Ll12345" + i));
        app.getUser().clickPolicyBox();
        app.getUser().click(By.xpath("//button[text()='Y’alla!']"));
        app.getUser().click(By.xpath("//button[contains(text(),'Ok')]"));

    }
   @Test

    public void deleteAccountTest() throws InterruptedException {

       app.getUser().click(By.cssSelector(".navigation-link:nth-child(6)"));
       Thread.sleep(2000);
       app.getUser().click(By.cssSelector(".positive-button"));
    }
}

