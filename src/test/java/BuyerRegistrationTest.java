import Pages.CreateAccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import com.testvagrant.ekam.commons.data.DataSetsClient;
import com.testvagrant.ekam.testBases.testng.WebTest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.security.util.Password;

import javax.inject.Inject;

import static org.testng.Assert.*;

public class BuyerRegistrationTest extends WebTest {
    @Inject private DataSetsClient dataSetsClient;


    @Test(groups = "web")
    public void ValidCredentials() {
        Page(HomePage.class).getLoginPage();
        Page(LoginPage.class).getCreateAccountPage();
        Page(CreateAccountPage.class)
                .fillFirstName(dataSetsClient.getValue("FirstName",String.class))
                .fillLastName(dataSetsClient.getValue("LastName",String.class))
                .fillEmailId(dataSetsClient.getValue("Email",String.class))
                .fillPassword(dataSetsClient.getValue("Password",String.class))
                .clickCreateButton();
    }

    @Test(enabled = false)
    public void BlankEmailId() {
        Page(HomePage.class).getLoginPage();
        Page(LoginPage.class).getCreateAccountPage();
        Page(CreateAccountPage.class)
                .fillFirstName(dataSetsClient.getValue("FirstName",String.class))
                .fillLastName(dataSetsClient.getValue("LastName",String.class))
                .fillPassword(dataSetsClient.getValue("Password",String.class))
                .clickCreateButton();
    }
    @Test(enabled = false)
    public void BlankPassword() {
        Page(HomePage.class).getLoginPage();
        Page(LoginPage.class).getCreateAccountPage();
        Page(CreateAccountPage.class)
                .fillFirstName(dataSetsClient.getValue("FirstName",String.class))
                .fillLastName(dataSetsClient.getValue("LastName",String.class))
                .fillEmailId(dataSetsClient.getValue("Email",String.class))
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
                .fillEmailId(dataSetsClient.getValue("Email",String.class))
                .fillPassword(dataSetsClient.getValue("Password",String.class))
                .clickOnSignInButton();
    }
}