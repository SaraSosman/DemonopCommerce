package org.example.StepDefintion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

import static org.example.StepDefintion.Hooks.driver;

public class D07_FollowUsStepDef {
    P03_HomePage home = new P03_HomePage();
    @Given("user clicks on facebook icon")
    public void userClicksOnFacebookIcon (){
        home.facebookIcon().click();
    }


    @Then("facebook page is opened in new tab")
    public void facebookPageIsOpenedInNewTab() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        SoftAssert soft1 = new SoftAssert();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +Hooks.driver.getCurrentUrl());
        String ActualUrl = driver.getCurrentUrl();
        soft1.assertEquals( ActualUrl ,  "https://www.facebook.com/nopCommerce");

        soft1.assertAll();
        driver.close();



    }


    @When("user clicks on twitter icon")
    public void userClicksOnTwitterIcon() {
        home.twitterIcon().click();
    }

    @Then("twitter page is opened in new tab")
    public void twitterPageIsOpenedInNewTab() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        SoftAssert soft2 = new SoftAssert();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +Hooks.driver.getCurrentUrl());
        String ActualUrl = driver.getCurrentUrl();
        soft2.assertEquals( ActualUrl ,     "https://twitter.com/nopCommerce" );


        soft2.assertAll();

    }

    @When("user clicks on rss icon")
    public void userClicksOnRssIcon() {
        home.rssIcon().click();

    }

    @Then("rss page is opened in new tab")
    public void rssPageIsOpenedInNewTab() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        SoftAssert soft3 = new SoftAssert();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +Hooks.driver.getCurrentUrl());
        String ActualUrl = driver.getCurrentUrl();
        soft3.assertEquals( ActualUrl ,    "https://demo.nopcommerce.com/new-online-store-is-open");


        soft3.assertAll();

    }

    @When("user clicks on youtube icon")
    public void userClicksOnYoutubeIcon() {
        home.youtubeIcon().click();
    }

    @Then("youtube page is opened in new tab")
    public void youtubePageIsOpenedInNewTab() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        SoftAssert soft3 = new SoftAssert();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +Hooks.driver.getCurrentUrl());
        String ActualUrl = driver.getCurrentUrl();
        soft3.assertEquals( ActualUrl ,     "https://www.youtube.com/user/nopCommerce");

        soft3.assertAll();
    }
}
