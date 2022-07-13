package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePageObject{

  public String getTitle() {
    //By locator = MobileBy.xpath(
     //  "//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
    //AndroidElement labelTitle = driver.findElement(locator);
    //return labelTitle.getText();
    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
  }

  public boolean checkHamburgerBtnAppear() {
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    AndroidElement hamburgerBtn = driver.findElement(locator);
    return hamburgerBtn.isDisplayed();

    //explicit wait
    //By locator = MobileBy.AccessibilityId("Open navigation drawer");
    //WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    //AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    //return hamburgerBtn.isDisplayed();
  }

  public void inputAngka1(int angka1){
    inputNumber(MobileBy.id("com.isl.simpleapp:id/et_1"), angka1);
  }

  public void inputAngka2(int angka2){
    inputNumber(MobileBy.id("com.isl.simpleapp:id/et_2"), angka2);
  }

  public void tapDropdownButton(){
    click(MobileBy.id("com.isl.simpleapp:id/spinner_1"));
  }

  public void chooseAdditionOperator(){
    click(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]"));
  }

  public void chooseSubtractionOperator(){
    click(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"));
  }

  public void chooseDivisionOperator(){
    click(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]"));
  }

  public void chooseMultiplicationOperator(){
    click(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]"));
  }

  public void tapEqualButton(){
    click(MobileBy.id("com.isl.simpleapp:id/acb_calculate"));
  }

  public String getCalculationResult(){
    return getText(MobileBy.id("com.isl.simpleapp:id/tv_result"));
  }

  public void tapHamburgerButton(){
    click(MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));
  }

  public void tapCalculatorButton(){
    click(MobileBy.id("com.isl.simpleapp:id/nav_calculator"));
  }

  public void tapListButton(){
    click(MobileBy.id("com.isl.simpleapp:id/nav_list"));
  }

  public void inputDecimal1(double decimal1){
    inputDecimalNumber(MobileBy.id("com.isl.simpleapp:id/et_1"), decimal1);
  }
  public void inputDecimal2(double decimal2){
    inputDecimalNumber(MobileBy.id("com.isl.simpleapp:id/et_2"), decimal2);
  }

}
