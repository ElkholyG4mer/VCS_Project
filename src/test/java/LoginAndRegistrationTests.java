import org.example.LoginAndRegistrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;



public class LoginAndRegistrationTests {
    public WebDriver driver;
    public LoginAndRegistrationPage loginpage ;
    //driver = new ChromeDriver();
    //private LoginAndRegistrationPage LoginPage = new LoginAndRegistrationPage(driver);
    @BeforeMethod
    public void setup(){
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\mosta\\IdeaProjects\\First_Automation_Project\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        loginpage = new LoginAndRegistrationPage(driver);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://automationexercise.com");
        driver.manage().window().maximize();
    }

    @Test
    public void ValidateLogin (){
        //LoginAndRegistrationPage loginpage = new LoginAndRegistrationPage(driver);
        loginpage.ClickOnLoginTabButton();
        loginpage.FillLoginData("mostafa@gmail.com","abcd123456");
        loginpage.ClickOnLoginButton();
    }

    /*@AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }*/
}
