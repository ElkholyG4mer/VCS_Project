import org.example.LoginAndRegistrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginAndRegistrationTests extends LoginAndRegistrationPage {
    @Test
    public static void ValidateLogin (){
        OpenBrowser();
        ClickOnLoginTabButton();
        FillLoginData("mostafa@gmail.com","abcd123456");
        ClickOnLoginButton();
    }
}
