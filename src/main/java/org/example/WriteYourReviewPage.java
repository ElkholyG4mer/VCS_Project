package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WriteYourReviewPage {

     private WebDriver driver;
     private String PageUrl = "https://automationexercise.com/products";

    private By viewYourProductButton = By.xpath("//a[@href=\"/product_details/1\"]");
    private By writeYoueReviewHeaderCL = By.xpath("href=\"#reviews\"");
    private By yourNameTextBox = By.xpath("//input[@id=\"name\"]");
    private By emailAddtressTextBox = By.xpath("//input[@id=\"email\"]");
    private By addReviewHereTextBox = By.xpath("//textarea[@id=\"review\"]");
    private By submitButton = By.xpath("//button[@id=\"button-review\"]");


    public WriteYourReviewPage(WebDriver driver){
        this.driver = driver;

    }

    public void urlNavigate(){
        driver.get(PageUrl);
    }


public  void ClickOnViewProductButton(){
        driver.findElement(viewYourProductButton).click();

}
public  void FillReviewData(String name,String EmailAddress,String ReviewBodyText) {
    driver.findElement(yourNameTextBox).clear();
    driver.findElement(yourNameTextBox).sendKeys(name);
    driver.findElement(emailAddtressTextBox).clear();
    driver.findElement(emailAddtressTextBox).sendKeys(EmailAddress);
    driver.findElement(addReviewHereTextBox).clear();
    driver.findElement(addReviewHereTextBox).sendKeys(ReviewBodyText);

}


public  void CompareWriteYourReviewHeaderCLWIthExpected(String expectedHeaderCl){
    String actualHeadelCl= driver.findElement(writeYoueReviewHeaderCL).getText();
    Assert.assertEquals(actualHeadelCl,expectedHeaderCl,"the wrong header");
}
public  void CompareYourNameClWithExpected(String expectedNameCl){
    String actualNameCl = driver.findElement(yourNameTextBox).getText();
    Assert.assertEquals(actualNameCl,expectedNameCl,"this is the wrong namr cl ");

}
public  void CompareEmailAddressClWithExpected(String expectedEmilAddressCL){
    String actualEmilAddressCL= driver.findElement(emailAddtressTextBox).getText();
    Assert.assertEquals(actualEmilAddressCL,expectedEmilAddressCL,"this is the wrong email address cl");
}
public  void CompareWriteYourReviewHereCLWithExpected  (String expectedctualWriteYourReviewCl){
    String actualWriteYourReviewCl = driver.findElement(addReviewHereTextBox).getText();
    Assert.assertEquals(actualWriteYourReviewCl,expectedctualWriteYourReviewCl,"the wrong cl of Add review");

}
public  void ClickOnSubmitButton(){driver.findElement(submitButton).click();}

    public void writeReview(String name,String EmailAddress,String ReviewBodyText){
        ClickOnViewProductButton();
        FillReviewData(name,EmailAddress,ReviewBodyText);
        ClickOnSubmitButton();
    }




}
