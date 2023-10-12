package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDefintion.Hooks.driver;

public class P02_login {
    public WebElement loginEmail (){
        WebElement loginEmail = driver.findElement(By.id("Email"));
        return loginEmail;
    }
    public WebElement loginPassword () {
        WebElement loginPassword = driver.findElement(By.id("Password"));
        return loginPassword;
    }
    public WebElement loginButton () {
        WebElement loginButton = driver.findElement(By.className("login-button"));
        return loginButton;
    }

    public WebElement MyAccTab() {
        WebElement MyAccTab = driver.findElement(By.className("ico-account"));
        return MyAccTab;

    }

    public WebElement ErrorMsg () {
    WebElement ErrorMsg = driver.findElement(By.className("message-error"));
    return  ErrorMsg ;
    }
}

