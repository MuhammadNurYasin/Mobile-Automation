package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import static com.example.app.drivers.AndroidDriverInit.driver;

public class LoginCalculatorPage extends BasePageObject{
    public void inputUsername() {
        loginSuccess(MobileBy.id("username"));
    }

    public void inputPassword() {
        loginSuccess(MobileBy.id("password"));
    }

    public void clickLoginButton() {
       click(MobileBy.id("login"));
    }

}

