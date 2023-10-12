package org.example.StepDefintion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class D03_CurrenciesStepDef {
    P03_HomePage home = new P03_HomePage();
    @Given("user clicks on currencies list")
    public void UserClickOnCurrenciesList() {
        home.CurrencyList().click();
    }

    @When("user select Euro currency from the dropdown list")
    public void userSelectEuroCurrencyFromTheDropdownList() {
        Select staticList = new Select(home.CurrencyList());
        staticList.selectByVisibleText("Euro");
    }

    @Then("Euro Symbol is shown successfully")
    public void euroSymbolIsShownSuccessfully() {
        for (Integer i = 0; i < 3; i++) {
            String actualSym;
            actualSym = home.ItemPrice().get(i).getText();
            String expected = "€";
            Assert.assertTrue(actualSym.contains(expected));
        }


    }}

