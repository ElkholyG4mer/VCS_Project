package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginAndRegistrationPage {
    private WebDriver driver ;
    //static String pageURL = "https://automationexercise.com";
    public LoginAndRegistrationPage(WebDriver driver) {
        this.driver = driver;
        //PageFactory.initElements(driver,this);
    }

    //Locators
    private WebElement loginTabButton = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
    private WebElement loginHeaderCL = driver.findElement(By.xpath("//div[@class=\"login-form\"]//h2"));
    private WebElement emailTextBox = driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
    private WebElement passwordTextBox = driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
    private WebElement loginButton = driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));

    //Actions
    /*public static void OpenBrowser (){
        driver.get("https://automationexercise.com");
        driver.manage().window().maximize();
    }*/
    public void ClickOnLoginTabButton (){
        loginTabButton.click();
    }

    public void FillLoginData (String userName , String password){
        emailTextBox.clear();
        emailTextBox.sendKeys(userName);
        passwordTextBox.clear();
        passwordTextBox.sendKeys(password);
    }

    public void ClickOnLoginButton(){
        loginButton.click();
    }

    public void login (String userName , String password){
        ClickOnLoginTabButton();
        FillLoginData(userName,password);
        ClickOnLoginButton();
    }
}
