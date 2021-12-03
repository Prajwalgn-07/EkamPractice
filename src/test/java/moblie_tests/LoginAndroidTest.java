package moblie_tests;

import mobile.Screen.LoginAndroidScreen;
import com.testvagrant.ekam.testBases.testng.MobileTest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginAndroidTest extends MobileTest {
    @Test(groups = "mobile")
    public void mobileExampleTest() {
        boolean cartDisplayed = Screen(LoginAndroidScreen.class)
                .login()
                .isCartDisplayed();
        assertTrue(cartDisplayed, "Cart is not displayed");
    }
}