package moblie_tests;

import com.testvagrant.ekam.testBases.testng.MobileTest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import mobile.Screen.LoginIosScreen;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginIosTest extends MobileTest {

    @Test(groups = "mobile")
    public void mobileExampleTest() {
            boolean cartDisplayed = Screen(LoginIosScreen.class)
                    .login()
                    .isCartDisplayed();
            assertTrue(cartDisplayed, "Cart is not displayed");
        }
    }