package web.Pages;

import com.testvagrant.ekam.reports.annotations.WebStep;
import com.testvagrant.ekam.atoms.web.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.inject.Inject;


public class CreateAccountPage extends WebPage {
    private By firstName = queryByName("customer[first_name]");
    private By lastName = queryByName("customer[last_name]");
    private By emailId = queryByName("customer[email]");
    private By password = queryByName("customer[password]");
    private By createButton = query("//button[normalize-space()='Create']");
    @WebStep(keyword = "When", description = "I fill first Name")
    public CreateAccountPage fillFirstName(String firstName) {
        element(this.firstName).click();
        textbox(this.firstName).setText(firstName);
        return this;
    }

    @WebStep(keyword = "When", description = "I fill Last Name")
    public CreateAccountPage fillLastName(String lastName) {
        element(this.lastName).click();
        textbox(this.lastName).setText(lastName);
        return this;
    }

    @WebStep(keyword = "When", description = "I fill emailId")
    public CreateAccountPage fillEmailId(String emailId) {
        element(this.emailId).click();
        textbox(this.emailId).setText(emailId);
        return this;
    }

    @WebStep(keyword = "When", description = "I fill password ")
    public CreateAccountPage fillPassword(String  password) {
        element(this.password).click();
        textbox(this.password).setText(password);
        return this;
    }

    @WebStep(keyword = "When", description = "I press on create button")
    public CreateAccountPage clickCreateButton() {
        element(createButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("ul-web-playground"));
        return this;
    }

}