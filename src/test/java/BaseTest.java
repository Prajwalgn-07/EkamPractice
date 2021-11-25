import com.testvagrant.ekam.testBases.testng.WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest extends WebTest {
    private Integer timeOutInSeconds;
    public BaseTest(Integer timeOutInSeconds){
        this.timeOutInSeconds=timeOutInSeconds;
    }
    public void explicitWaitUsingTitle(WebDriver driver, String title){
        WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);
        wait.until(ExpectedConditions.titleIs(title));
    }
}