package mobile.Screen;

import com.testvagrant.ekam.atoms.MultiPlatformFinder;
import com.testvagrant.ekam.atoms.mobile.MobileScreen;
import com.testvagrant.ekam.reports.annotations.MobileStep;
import org.openqa.selenium.By;


public class LoginScreen extends MobileScreen {

    private final MultiPlatformFinder usernameTextBox = finder(
            queryByContentDesc("test-Username"), queryById("test-Username"));

    private final MultiPlatformFinder passwordTextBox = finder(
            queryByContentDesc("test-Password"), queryById("test-Password"));

    private final MultiPlatformFinder loginButton = finder(
            queryByContentDesc("test-LOGIN"), queryById("test-LOGIN"));

    private final MultiPlatformFinder cart = finder(
            queryByContentDesc("test-Error message"), queryById("test-Cart"));

    @MobileStep(keyword = "When", description = "I login")
    public LoginScreen login() {
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