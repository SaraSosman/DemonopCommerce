package org.example.StepDefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import static org.example.StepDefintion.Hooks.driver;

public class D02_loginStepDef {

    P03_HomePage home = new P03_HomePage();
    P02_login login = new P02_login();

    @Given("user go to login page")
    public void UserGoToLoginPage (){
     home.loginTab().click();
    }
    @When("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String arg0, String arg1) throws InterruptedException {
        login.loginEmail().sendKeys(arg0);
        login.loginPassword().sendKeys(arg1);
        Thread.sleep(3000);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
       login.loginButton().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert soft = new SoftAssert();
        //1- getCurrentUrl and verify it equals https://demo.nopcommerce.com/
        soft.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");

        //2-  "My account" tab isDisplayed
        String MyAccTab = login.MyAccTab().getText();
        soft.assertEquals(MyAccTab,"My account");

        soft.assertAll();
    }





    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String arg0, String arg1) {
        login.loginEmail().sendKeys(arg0);
        login.loginPassword().sendKeys(arg1);

    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert soft = new SoftAssert();
        //1- error message contains "Login was unsuccessful."
        String ActualErrorMsg = login.ErrorMsg().getText();
        String ExpectedErrorMsg = "Login was unsuccessful";
        soft.assertTrue(ActualErrorMsg.contains(ExpectedErrorMsg));


        //2-the color of this message is red "#e4434b"
        String actualColor = login.ErrorMsg().getCssValue("color");
        soft.assertEquals(Color.fromString(actualColor).asHex(),"#e4434b");

        soft.assertAll();

    }


}
