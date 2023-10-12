package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDefintion.Hooks.driver;

public class P04_WishList {
    public WebElement ProductQty () {
        WebElement ProductQty =driver.findElement(By.cssSelector(" input[class='qty-input']"));
        return ProductQty;
    }
}
