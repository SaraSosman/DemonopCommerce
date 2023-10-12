package org.example.StepDefintion;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.example.pages.P01_RegisterPage;
import org.example.pages.P01_RegisterResultPage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_Registration {

    P03_HomePage home = new P03_HomePage();
    @Given("user navigate to register page")

    public void GoToRegisterPage () {
        home.registerTab().click();
    }


    P01_RegisterPage registerPage = new P01_RegisterPage();
    @When("user select gender type")

    public void userSelectGenderType() {
        registerPage.genderType().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1) {
        registerPage.firstName().sendKeys(arg0);
        registerPage.lastName().sendKeys(arg1);


    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        //StaticDropDown
        registerPage.birthDay().click();
        Select staticList = new Select(registerPage.birthDay());
        staticList.selectByValue("19");

        registerPage.birthMonth().click();
        Select staticList2 = new Select(registerPage.birthMonth());
        staticList2.selectByIndex(6);

        registerPage.birthYear().click();
        Select staticList3 = new Select(registerPage.birthYear());
        staticList3.selectByVisibleText("1996");
    }


    @And("user enter email {string} field")
    public void userEnterEmailField(String arg0) {

        Faker fake = new Faker();
        String validEmail = fake.internet().safeEmailAddress();
        registerPage.email().sendKeys(validEmail);
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String arg0, String arg1) {
      registerPage.password().sendKeys(arg0);
      registerPage.ConfirmPassword().sendKeys(arg1);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        registerPage.registerButton().click();
    }


    P01_RegisterResultPage registerResultPage =new P01_RegisterResultPage();
    @Then("success message is displayed")
    public void successMessageIsDisplayed() {

        SoftAssert soft = new SoftAssert();
        //1- verify success message displayed is equal "Your registration completed"
        String actualMsg = registerResultPage.successMsg().getText();
        soft.assertEquals(actualMsg,"Your registration completed");

        //2-verify success message with green color
        String actualColor = registerResultPage.successMsg().getCssValue("color");
        soft.assertEquals(Color.fromString(actualColor).asHex(),"#4cb17c");







        soft.assertAll();

    }
}
