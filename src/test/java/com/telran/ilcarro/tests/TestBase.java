package com.telran.ilcarro.tests;

import com.telran.ilcarro.fm.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setup(){
        app.init();
    }

    @AfterMethod(enabled = false)
//    @AfterMethod
    public void tearDown(){
        app.stop();
    }

}