package com.telran.ilcarro.fm;

import com.telran.ilcarro.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UserHelper extends HelperBase {

    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void fillRegistrationForm(User user) {
        type(By.cssSelector("#name"), user.getName());
        type(By.cssSelector("#lastName"), user.getLastName());
        type(By.cssSelector("#email"), user.getEmail());
        type(By.cssSelector("#password"), user.getPassword());
    }

    public void isLoginForm(String email, String password) {
        type(By.xpath("//input[@id='email']"), email);
        type(By.cssSelector("#password"), password);
    }

    public void clickPolicyBox() {
        WebElement element = driver.findElement(By.xpath("//label[@for='terms-of-use']"));
        Rectangle rectangle = element.getRect();
        int offSetX = rectangle.getWidth() / 5;
        int ofSetY = rectangle.getHeight() / 2;
        Actions actions = new Actions(driver);
        actions.moveToElement(element).release().build().perform();

        System.out.println(offSetX + " " + ofSetY);
        actions.moveByOffset(offSetX, ofSetY).click().release().build().perform();
    }
}
