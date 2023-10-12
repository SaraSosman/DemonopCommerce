package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDefintion.Hooks.driver;

public class P01_RegisterResultPage {

    public WebElement successMsg (){

        WebElement successMsg = driver .findElement(By.className("result"));
        return successMsg;

    }


}
