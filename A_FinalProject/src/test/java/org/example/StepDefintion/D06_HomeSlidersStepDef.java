package org.example.StepDefintion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_HomePage;
import org.testng.asserts.SoftAssert;

import static org.example.StepDefintion.Hooks.driver;

public class D06_HomeSlidersStepDef {
    P03_HomePage home =new P03_HomePage();
    @Given("User select first slider")
    public void UserSelectFirstSlider (){
        home.slider1().click();

    }


    @Then("User navigate to product page")
    public void userNavigateToProductPage() {
        home.slider1().click();
        SoftAssert soft = new SoftAssert();
        String ActualUrl = driver.getCurrentUrl();
        soft.assertEquals( ActualUrl , "https://demo.nopcommerce.com/nokia-lumia-1020");

        soft.assertAll();




    }

    @Given("User select second slider")
    public void userSelectSecondSlider() {
       home.slider2().click();
    }


    @Then("User Navigate to second product page")
    public void userNavigateToSecondProductPage() {
        home.slider2().click();
        SoftAssert soft2 = new SoftAssert();
        String ActualUrl = driver.getCurrentUrl();
        soft2.assertEquals( ActualUrl , "https://demo.nopcommerce.com/iphone-6");

        soft2.assertAll();



    }
}

