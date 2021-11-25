package api_tests;

import api.User.loginUser.*;
import com.testvagrant.ekam.testBases.testng.APITest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import org.testng.annotations.Test;

public class Login extends APITest {

    @Test(groups = "api",priority = 0)
    public void loginTest() {
        LoginUserRequest loginUserRequest = LoginUserRequest.builder().email("eve.holt@reqres.in").password("cityslicka").build();
        LoginUserResponse loginUserResponse=Client(LoginUserClient.class).loginUser(loginUserRequest);
        System.out.println(loginUserResponse.getToken());
    }

    @Test(groups = "api",priority = 1)
    public void loginWithOnlyEmail() {
        LoginUserNegativeRequest loginUserNegativeRequest=LoginUserNegativeRequest.builder().email("eve.holt@reqres.in").build();
        LoginUserNegativeResponse loginUserNegativeResponse=Client(LoginUserClient.class).loginUser(loginUserNegativeRequest);
        System.out.println(loginUserNegativeResponse.getError());
    }
}