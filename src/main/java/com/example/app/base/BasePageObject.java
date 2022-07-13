package com.example.app.base;

import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class BasePageObject {

  public AndroidDriver<AndroidElement> getDriver(){
    return AndroidDriverInit.driver;
  }

  public AndroidElement find(By by){
    return getDriver().findElement(by);
  }

  public void type(By by, String text){
    AndroidElement element = find(by);
    element.clear();
    element.sendKeys(text);
  }

  public void click(By by){
    find(by).click();
  }

  public String getText(By by){
    return find(by).getText();
  }

  public boolean isDisplayed(By by){
    return find(by).isDisplayed();
  }

  public void loginSuccess(By by){
    AndroidElement element = find(by);
    element.clear();
    element.sendKeys("admin");
  }

  public void inputNumber(By by, int number){
    AndroidElement element = find(by);
    element.click();
    element.sendKeys(String.valueOf(number));
  }

  public void inputDecimalNumber(By by, double number){
    AndroidElement element = find(by);
    element.click();
    element.sendKeys(String.valueOf(number));
  }

  public void longPressList(By by){
    AndroidElement element = find(by);
    TouchAction action = new TouchAction(getDriver());
    action.longPress(PointOption.point(element.getCenter()))
            .waitAction(WaitOptions.waitOptions(Duration.of(10, ChronoUnit.SECONDS)))
            .release().perform();
  }

  public void tapMultipleTimes(By by){
    AndroidElement element = find(by);
    TouchAction action = new TouchAction(getDriver());
    action.tap(TapOptions.tapOptions().withTapsCount(10)
            .withElement(ElementOption.element(element)))
            .perform();
  }

}
