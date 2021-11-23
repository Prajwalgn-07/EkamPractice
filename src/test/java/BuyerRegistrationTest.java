import Pages.CreateAccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import com.testvagrant.ekam.testBases.testng.WebTest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BuyerRegistrationTest extends WebTest {

    @Test(groups = "web")
    public void ValidCredentials() {
        Page(HomePage.class).getLoginPage();
        Page(LoginPage.class).getCreateAccountPage();
        Page(CreateAccountPage.class)
                .fillFirstName("Alice")
                .fillLastName("Mark")
                .fillEmailId("test65@mail.com")
                .fillPassword("54377273")
                .clickCreateButton();
    }

    @Test(enabled = false)
    public void BlankEmailId() {
        Page(HomePage.class).getLoginPage();
        Page(LoginPage.class).getCreateAccountPage();
        Page(CreateAccountPage.class)
                .fillFirstName("Alice")
                .fillLastName("Mark")
                .fillPassword("12345")
                .clickCreateButton();
    }
    @Test(enabled = false)
    public void BlankPassword() {
        Page(HomePage.class).getLoginPage();
        Page(LoginPage.class).getCreateAccountPage();
        Page(CreateAccountPage.class)
                .fillFirstName("Alice")
                .fillLastName("Mark")
                .fillEmailId("test2@mail.com")
                .clickCreateButton();
    }
    @Test(enabled = false)
    public void BlankData() {
        Page(HomePage.class).getLoginPage();
        Page(LoginPage.class).getCreateAccountPage();
        Page(CreateAccountPage.class).clickCreateButton();
    }
    @Test(enabled = false)
    public void login(){
        Page(HomePage.class).getLoginPage();
        Page(LoginPage.class)
                .fillEmailId("test@mail.com")
                .fillPassword("12345")
                .clickOnSignInButton();
    }
}