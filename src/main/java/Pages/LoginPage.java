package Pages;

import com.testvagrant.ekam.reports.annotations.WebStep;
import com.testvagrant.ekam.atoms.web.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends WebPage {
    private By createAccount= query("//a[contains(text(),\"Create account\")]");
    private By emailId = queryByName("customer[email]");
    private By password = queryByName("customer[password]");
    private By signIn = query("//*[@id=\"customer_login\"]/button");



    @WebStep(keyword = "When", description = "I fill emailId")
    public LoginPage fillEmailId(String emailId) {
        element(this.emailId).click();
        textbox(this.emailId).setText(emailId);
        return this;
    }

    @WebStep(keyword = "When", description = "I fill password")
    public LoginPage fillPassword(String password) {
        element(this.password).click();
        textbox(this.password).setText(password);
        return this;
    }

    @WebStep(keyword = "When", description = "I press on create account link text")
    public LoginPage getCreateAccountPage() {
        element(createAccount).click();
        return this;
    }

    @WebStep(keyword = "When", description = "I click on login Button")
    public LoginPage clickOnSignInButton() {
        element(this.signIn).click();
        return this;
    }


}