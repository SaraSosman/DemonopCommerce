package org.example.StepDefintion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.example.pages.P04_WishList;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.StepDefintion.Hooks.driver;

public class D08_WishlistStepDef {
    P03_HomePage home = new P03_HomePage();
    P04_WishList wishListPage = new P04_WishList();

    @Given("user clicks on the add to wish list button")
    public void userClicksOnTheAddToWishListButton () {
        home.WishList().click();
    }


    @Then("confirmation message is displayed")
    public void confirmationMessageIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfAllElements());
        SoftAssert soft = new SoftAssert();
        //1-success message is displayed
         String ActualSuccessMsg = home.SuccessMSg().getText();
         String ExpectedSuccessMsg ="The product has been added to your ";
         soft.assertTrue(ActualSuccessMsg.contains(ExpectedSuccessMsg));


        //2-background color is green
         String ActualBkColor = home.SuccessMSg().getCssValue("background-color");
         soft.assertEquals(Color.fromString(ActualBkColor).asHex(),"#4bb07a");


        soft.assertAll();



    }


    @When("user clicks on wishlist tab")
    public void userClicksOnWishlistTab() {
        // wait until this success message with green color to disappear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10).plusMillis(500));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[id='bar-notification'] div[class='bar-notification success']")));
         home.WishListTab().click();



    }

    @Then("verify the product added and the quantity is bigger than zero")
    public void verifyTheProductAddedAndTheQuantityIsBiggerThanZero() {
       wishListPage.ProductQty().getAttribute("value");
        Assert.assertNotEquals(wishListPage.ProductQty().getAttribute("value"), '0');

    }
}
