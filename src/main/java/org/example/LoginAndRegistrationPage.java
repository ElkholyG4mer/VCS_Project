package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginAndRegistrationPage {
    private WebDriver driver ;

    //variables
    private String pageURL = "https://automationexercise.com";

    //Locators
    private By loginTabButton = By.xpath("//a[@href='/login']");
    private By loginHeaderCL = By.xpath("//div[@class='login-form']//h2");
    private By emailTextBox = By.xpath("//input[@data-qa='login-email']");
    private By passwordTextBox = By.xpath("//input[@data-qa='login-password']");
    private By loginButton = By.xpath("//button[@data-qa='login-button']");
    private By logoutButton = By.xpath("//a[@href='/logout']");
    /*private WebElement loginTabButton = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
    private WebElement loginHeaderCL = driver.findElement(By.xpath("//div[@class=\"login-form\"]//h2"));
    private WebElement emailTextBox = driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
    private WebElement passwordTextBox = driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
    private WebElement loginButton = driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));*/

    //Actions
    public LoginAndRegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void urlNavigate(){
        driver.get(pageURL);
    }

    public void ClickOnLoginTabButton (){
        driver.findElement(loginTabButton).click();
        //loginTabButton.click();
    }

    public void FillLoginData (String userName , String password){
        driver.findElement(emailTextBox).clear();
        driver.findElement(emailTextBox).sendKeys(userName);
        driver.findElement(passwordTextBox).clear();
        driver.findElement(passwordTextBox).sendKeys(password);
        /*emailTextBox.clear();
        emailTextBox.sendKeys(userName);
        passwordTextBox.clear();
        passwordTextBox.sendKeys(password);*/
    }

    public void ClickOnLoginButton(){
        driver.findElement(loginButton).click();
        //loginButton.click();
    }

    public void login (String userName , String password){
        ClickOnLoginTabButton();
        FillLoginData(userName,password);
        ClickOnLoginButton();
    }

    //Validations
    public void validateLogin (String logoutText){
        String actualText = driver.findElement(logoutButton).getText();
        Assert.assertEquals(actualText,logoutText,"Text Doesn't Match");
    }

}
