import org.example.LoginAndRegistrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.JsonFileManager;

import java.util.concurrent.TimeUnit;



public class LoginAndRegistrationTests {
    private WebDriver driver;
    private JsonFileManager testData;
    private LoginAndRegistrationPage loginpage ;

    @BeforeClass
    public void beforeClass() {
        testData = new JsonFileManager("src/test/resources/Test Data/loginTestData.json");
    }

    @BeforeMethod
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        //driver = new ChromeDriver();
        //driver.manage().window().maximize();
        loginpage = new LoginAndRegistrationPage(driver);
        loginpage.urlNavigate();
    }

    @Test
    public void ValidateLogin (){
        loginpage.ClickOnLoginTabButton();
        loginpage.FillLoginData(testData.getTestData("userName"),testData.getTestData("passWord"));
        loginpage.ClickOnLoginButton();
        loginpage.validateLogin(testData.getTestData("expectedText"));
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
