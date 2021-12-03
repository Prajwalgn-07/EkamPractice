package mobile.Screen;

import com.testvagrant.ekam.atoms.mobile.MobileScreen;
import com.testvagrant.ekam.reports.annotations.MobileStep;
import org.openqa.selenium.By;


public class LoginIosScreen extends MobileScreen {
    private final By usernameTextBox = queryById("test-Username");
    private final By passwordTextBox = queryById("test-Password");
    private final By loginButton = queryById("test-LOGIN");
    private final By cart = queryById("test-Cart");

    @MobileStep(keyword = "When", description = "I login")
    public LoginIosScreen login() {
        textbox(usernameTextBox).setText("standard_user");
        textbox(passwordTextBox).setText("secret_sauce");
        element(loginButton).click();
        return this;
    }

    @MobileStep(keyword = "Then", description = "Return if cart is displayed")
    public boolean isCartDisplayed() {
        return element(cart).isDisplayed();
    }
}