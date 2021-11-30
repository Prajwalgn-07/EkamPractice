package web_tests;

import data_clients.UserInfoDataClient;
import org.testng.annotations.BeforeMethod;
import web.Pages.CreateAccountPage;
import web.Pages.HomePage;
import web.Pages.LoginPage;
import com.testvagrant.ekam.commons.data.DataSetsClient;
import com.testvagrant.ekam.testBases.testng.WebTest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;
import org.testng.annotations.Test;

import javax.inject.Inject;

@Test(groups ="web")
public class BuyerRegistrationTest extends WebTest {
    @Inject private UserInfoDataClient userInfoDataClient;

    @Test(groups ="web")
    public void ValidCredentials() {
        Page(HomePage.class).getLoginPage();
        Page(LoginPage.class).getCreateAccountPage();
        Page(CreateAccountPage.class)
                .fillFirstName(userInfoDataClient.getUiDetails().getFirstName())
                .fillLastName(userInfoDataClient.getUiDetails().getLastName())
                .fillEmailId(userInfoDataClient.getUiDetails().getEmail())
                .fillPassword(userInfoDataClient.getUiDetails().getPassword())
                .clickCreateButton();
    }

    @Test(enabled = false)
    public void BlankEmailId() {
        Page(HomePage.class).getLoginPage();
        Page(LoginPage.class).getCreateAccountPage();
        Page(CreateAccountPage.class)
                .fillFirstName(userInfoDataClient.getUiDetails().getFirstName())
                .fillLastName(userInfoDataClient.getUiDetails().getLastName())
                .fillPassword(userInfoDataClient.getUiDetails().getPassword())
                .clickCreateButton();
    }
    @Test(enabled = false)
    public void BlankPassword() {
        Page(HomePage.class).getLoginPage();
        Page(LoginPage.class).getCreateAccountPage();
        Page(CreateAccountPage.class)
                .fillFirstName(userInfoDataClient.getUiDetails().getFirstName())
                .fillLastName(userInfoDataClient.getUiDetails().getLastName())
                .fillEmailId(userInfoDataClient.getUiDetails().getEmail())
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
                .fillEmailId(userInfoDataClient.getUiDetails().getEmail())
                .fillPassword(userInfoDataClient.getUiDetails().getPassword())
                .clickOnSignInButton();
    }
}