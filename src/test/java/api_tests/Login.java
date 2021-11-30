package api_tests;

import data_clients.UserInfoDataClient;
import api.User.loginUser.*;
import com.testvagrant.ekam.testBases.testng.APITest;
import static com.testvagrant.ekam.commons.LayoutInitiator.*;
import org.testng.annotations.Test;

import javax.inject.Inject;

public class Login extends APITest {
    @Inject private UserInfoDataClient userInfoDataClient;
    @Test(groups = "api",priority = 0)
    public void loginTest() {
        LoginUserRequest loginUserRequest = LoginUserRequest
                                                .builder()
                                                .email(userInfoDataClient.getApiDetails().getEmailId())
                                                .password(userInfoDataClient.getApiDetails().getPassword())
                                                .build();
        LoginUserResponse loginUserResponse=Client(LoginUserClient.class).loginUser(loginUserRequest);
        System.out.println(loginUserResponse.getToken());
    }

    @Test(groups = "api",priority = 1)
    public void loginWithOnlyEmail() {
        LoginUserNegativeRequest loginUserNegativeRequest=LoginUserNegativeRequest
                                                                        .builder()
                                                                        .email(userInfoDataClient.getApiDetails().getEmailId())
                                                                        .build();
        LoginUserNegativeResponse loginUserNegativeResponse=Client(LoginUserClient.class).loginUser(loginUserNegativeRequest);
        System.out.println(loginUserNegativeResponse.getError());
    }
}