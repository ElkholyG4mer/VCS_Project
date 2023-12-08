import org.example.LoginAndRegistrationPage;
import org.example.WriteYourReviewPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.JsonFileManager;


public class WriteYourReviewPageTests {
    private WebDriver driver;
    private JsonFileManager testData;
    private WriteYourReviewPage WriteReview;

    @BeforeClass
    public void beforeClass(){
        testData = new JsonFileManager("src/test/resources/Test Data/ReviewTestData.json");

    }
    @BeforeMethod
    public void Setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WriteReview=new WriteYourReviewPage(driver);
        WriteReview.urlNavigate();
    }
    @Test
    public void WriteReview(){
        WriteReview.ClickOnViewProductButton();
        WriteReview.FillReviewData(testData.getTestData("name"),testData.getTestData("EmailAddress"),
                testData.getTestData("ReviewBodyText"));
        WriteReview.ClickOnSubmitButton();
    }



}