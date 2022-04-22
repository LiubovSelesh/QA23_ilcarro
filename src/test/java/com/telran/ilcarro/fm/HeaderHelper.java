package com.telran.ilcarro.fm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends HelperBase {

    public HeaderHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isSignUpTabPresent() {
        return isElementPresent(By.xpath("//a[contains(.,' Sign up ')]"));
    }

    public boolean isDeletePresent(){
        return isElementPresent(By.xpath("//a[contains(text(),'Delete account')]"));

    }
}
