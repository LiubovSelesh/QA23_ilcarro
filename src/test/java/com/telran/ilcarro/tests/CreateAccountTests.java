package com.telran.ilcarro.tests;

import com.telran.ilcarro.model.User;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        if (!app.getHeader().isSignUpTabPresent()) {
            app.getUser().click(By.xpath("//a[contains(.,' Logout ')]"));
        }
    }

    @Test
    public void createAccountPositiveTest() {
        app.getUser().click(By.xpath("//a[contains(.,' Sign up ')]"));
        int i = (int) ((System.currentTimeMillis() / 1000 % 3600));
//       app.fillRegistrationForm(new User().setName("Norma").setLastName("Miller")
//                .setEmail("norma" + i + "@gmail.com").setPassword("Nn8521" + i + "$"));

        app.getUser().fillRegistrationForm(new User().setName("Li").setLastName("us")
                .setEmail("pol" + i + "@il.com").setPassword("Ll12345" + i));

//        app.fillRegistrationForm(new User().setName("Li").setLastName("us")
//                .setEmail("poc@il.com").setPassword("Sl123459"));
        app.getUser().clickPolicyBox();
        app.getUser().click(By.xpath("//button[text()='Y’alla!']"));
        app.getUser().click(By.xpath("//button[contains(text(),'Ok')]"));

    }

//    @Test(enabled = false)
    @Test
    public void registrationNegativeWithoutPasswordTest() {

        app.getUser().click(By.xpath("//a[contains(.,' Sign up ')]"));
//        int i = (int) ((System.currentTimeMillis() / 1000 % 3600));
//        app.fillRegistrationForm(new User().setName("Norma").setLastName("Miller")
//                .setEmail("norma" + i + "@gmail.com"));
        app.getUser().fillRegistrationForm(new User().setName("Li").setLastName("us")
                .setEmail("po@il.com"));
        app.getUser().clickPolicyBox();
        app.getUser().click(By.xpath("//button[text()='Y’alla!']"));

    }

}