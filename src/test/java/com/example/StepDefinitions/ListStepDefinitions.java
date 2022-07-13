package com.example.StepDefinitions;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListStepDefinitions extends BaseTest {

    @When("user tap hamburger button")
    public void userTapHamburgerButton() {
        calculatorPage.tapHamburgerButton();
    }


    @And("user choose list menu")
    public void userChooseListMenu() {
        calculatorPage.tapListButton();

    }

    @And("user long press in first list")
    public void userLongPressInFirstList() {
        listPage.longPress();
        
    }

    @Then("pop up message appear")
    public void popUpMessageAppear() {

    }

    @And("user tap in first list with ten times")
    public void userTapInFirstListWithTenTimes() {
        listPage.tapMultipleTImes();
    }
}
