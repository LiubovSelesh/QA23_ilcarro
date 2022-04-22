package com.telran.ilcarro.fm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager  {

    public WebDriver driver;

    UserHelper user;
    HeaderHelper header;

    public HeaderHelper getHeader() {
        return header;
    }

    public UserHelper getUser() {
        return user;
    }



    public void init() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.xyz/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

       user = new UserHelper(driver);
       header = new HeaderHelper(driver);
    }

    public void stop() {
        driver.quit();
    }
}
