package org.example.StepDefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.StepDefintion.Hooks.driver;

public class D04_SearchStepDef {
    P03_HomePage home = new P03_HomePage();
   @Given("user write product {string} in search bar")
    public void user_write_product_in_Search_bar (String name){
       home.searchBar().sendKeys(name);
    }
    @When("user clicks on search button")
    public void userClicksOnSearchButton() {
       home.searchButton().click();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        soft.assertAll();
    }


    @Then("shows the results for the {string}")
    public void showsTheResultsForThe(String name) {
        SoftAssert soft = new SoftAssert();
        System.out.println("Number of search products result is" +Hooks.driver.findElements(By.className("product-title")).size());
        for (int i = 0; i < home.products().size();i++) {
            String actualTitle = home.productTitle().get(i).getText().toLowerCase();
            soft.assertTrue(actualTitle.contains((driver.findElement(By.id("small-searchterms"))).getText()));
            soft.assertAll();
        }
    }
    @Given("user write products {string} in search bar")
    public void user_write_product_sku_in_Search_bar (String sku){
        home.searchBar().sendKeys(sku);

    }
    @When("user clicks on the search button")
    public void userClicksOnTheSearchButton() {
        home.searchButton().click();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        soft.assertAll();

    }


    @And("user clicks on the products {string} in search result")
    public void userClicksOnTheProductInSearchResult(@org.jetbrains.annotations.NotNull String sku) {
        if (sku.contains("SCI_FAITH") ) {
         home.photo1().click();
        }
        else if(sku.contains("APPLE_CAM"))
        {
            home.photo2().click();
        } else if(sku.contains("SF_PRO_11"))
        {
            home.photo3().click();
        }
    }
    @Then("shows the result for the {string}")
    public void showsTheResultForTheSku(@NotNull String sku) {
        if (sku.contains("SCI_FAITH")){
            Assert.assertTrue(home.sku1().getText().contains(sku));
        }
        else if (sku.contains("APPLE_CAM")){
             Assert.assertTrue(home.sku2().getText().contains(sku));
        }
        else if (sku.contains("SF_PRO_11")) {
            Assert.assertTrue(home.sku3().getText().contains(sku));
        }
    }
}

