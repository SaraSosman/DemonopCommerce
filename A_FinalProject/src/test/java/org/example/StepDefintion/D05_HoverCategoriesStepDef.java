package org.example.StepDefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


import javax.swing.*;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.TimeUnit;

import static org.example.StepDefintion.Hooks.driver;

public class D05_HoverCategoriesStepDef {
P03_HomePage home = new P03_HomePage();
static String text = null;

    @Given("user hover on one of the main categories computer")
    public void userHoverOnOneOfTheMainCategoriesComputer() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(home.hoverComputer()).perform();
        Thread.sleep(5000);
    }


    @When("user hover on the sub categories desktops")
    public void userHoverOnTheSubCategoriesDesktops() {
        text = home.hoverDesktop().getText();
        System.out.println("The text in the sub-category is "+text);
        home.hoverDesktop().click();


    }


    @Then("user gets the desktops page")
    public void userGetsTheDesktopsPage() {
        Assert.assertEquals(home.headerDesktop().getText().trim(),text);
    }


}






