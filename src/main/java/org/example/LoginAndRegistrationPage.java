package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndRegistrationPage {
    static WebDriver driver = new ChromeDriver();

    //Locators
    static WebElement loginTabButton = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
    static WebElement loginHeaderCL = driver.findElement(By.xpath("//div[@class=\"login-form\"]//h2"));
    static WebElement emailTextBox = driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
    static WebElement passwordTextBox = driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
    static WebElement loginButton = driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));

    //Actions
    public static void OpenBrowser (){
        driver.get("https://automationexercise.com");
        driver.manage().window().maximize();
    }
    public static void ClickOnLoginTabButton (){
        loginTabButton.click();
    }

    public static void FillLoginData (String userName , String password){
        emailTextBox.clear();
        emailTextBox.sendKeys(userName);
        passwordTextBox.clear();
        passwordTextBox.sendKeys(password);
    }

    public static void ClickOnLoginButton(){
        loginButton.click();
    }

    public static void login (String userName , String password){
        ClickOnLoginTabButton();
        FillLoginData(userName,password);
        ClickOnLoginButton();
    }
}
