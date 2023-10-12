package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.StepDefintion.Hooks.driver;
public class P01_RegisterPage {
    public WebElement genderType() {

        WebElement genderType = driver.findElement(By.id("gender-female"));
        return genderType;
    }

    public WebElement firstName() {
        WebElement firstName = driver.findElement(By.id("FirstName"));
        return firstName;

    }

    public WebElement lastName() {
        WebElement lastName = driver.findElement(By.id("LastName"));
        return lastName;

    }

    public WebElement birthDay() {
        WebElement birthDay = driver.findElement(By.name("DateOfBirthDay"));
        return birthDay;
    }

    public WebElement birthMonth() {
        WebElement birthMonth = driver.findElement(By.name("DateOfBirthMonth"));
        return birthMonth;

    }

    public WebElement birthYear() {

         WebElement birthYear =driver.findElement(By.name("DateOfBirthYear"));
         return birthYear;

    }
    public WebElement email (){
        WebElement email = driver.findElement(By.id("Email"));
        return email ;
    }

    public WebElement password (){
        WebElement password = driver.findElement(By.id("Password"));
        return password;
    }

    public WebElement ConfirmPassword(){
        WebElement ConfirmPassword = driver.findElement(By.id("ConfirmPassword"));
        return ConfirmPassword;
    }

    public WebElement registerButton() {
        WebElement registerButton = driver.findElement(By.id("register-button"));
        return registerButton ;
    }


}
