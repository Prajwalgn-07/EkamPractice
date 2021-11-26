package moblie_tests;

import mobile.Screen.LoginScreen;
import com.testvagrant.ekam.testBases.testng.MobileTest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends MobileTest {

    @Test(groups = "mobile")
    public void mobileExampleTest() {

        boolean cartDisplayed = Screen(LoginScreen.class)
                .login()
                .isCartDisplayed();
        assertTrue(cartDisplayed, "Cart is not displayed");
    }
}