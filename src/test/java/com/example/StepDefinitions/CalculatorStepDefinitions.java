package com.example.StepDefinitions;



import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatorStepDefinitions extends BaseTest {



    @Given("user already login")
    public void userAlreadyLogin() {
        loginCalculatorPage.inputUsername();
        loginCalculatorPage.inputPassword();
        loginCalculatorPage.clickLoginButton();
    }

    @When("user input {int} on first number field")
    public void userInputOnFirstNumberField(int angka1) {
        calculatorPage.inputAngka1(angka1);
    }

    @And("user choose subtract operator")
    public void userChooseSubtractOperator() {
        calculatorPage.tapDropdownButton();
        calculatorPage.chooseSubtractionOperator();

    }

    @And("user input {int} on second number field")
    public void userInputOnSecondNumberField(int angka2) {
        calculatorPage.inputAngka2(angka2);
    }

    @And("user tap equal button")
    public void userTapEqualButton() {
        calculatorPage.tapEqualButton();

    }

    @Then("the result label is {string}")
    public void theResultLabelIs(String expectedResult) {
        String actualResult = calculatorPage.getCalculationResult();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("user choose add operator")
    public void userChooseAddOperator() {
        calculatorPage.tapDropdownButton();
        calculatorPage.chooseAdditionOperator();
    }

    @And("user choose divide operator")
    public void userChooseDivideOperator() {
        calculatorPage.tapDropdownButton();
        calculatorPage.chooseDivisionOperator();
    }

    @And("user choose multiplicate operator")
    public void userChooseMultiplicateOperator() {
        calculatorPage.tapDropdownButton();
        calculatorPage.chooseMultiplicationOperator();
    }

    @When("user input {double} at first number field")
    public void userInputOnFirstNumberField(double decimal1) {
        calculatorPage.inputDecimal1(decimal1);
    }

    @And("user choose {string} operator")
    public void userChooseOperator(String operator) {
        if (operator.equalsIgnoreCase("add")) {
            calculatorPage.tapDropdownButton();
            calculatorPage.chooseAdditionOperator();
        } else if (operator.equalsIgnoreCase("subtract")) {
            calculatorPage.tapDropdownButton();
            calculatorPage.chooseSubtractionOperator();
        } else if (operator.equalsIgnoreCase("divide")) {
            calculatorPage.tapDropdownButton();
            calculatorPage.chooseDivisionOperator();
        } else {
            calculatorPage.tapDropdownButton();
            calculatorPage.chooseMultiplicationOperator();
        }
        }

    @And("user input {double} at second number field")
    public void userInputOnSecondNumberField(double decimal2) {
        calculatorPage.inputDecimal2(decimal2);
    }

    @Then("the app is closed")
    public void theAppIsClosed() {

    }
}
