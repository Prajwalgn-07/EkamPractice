package api.User.loginUser;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import retrofit2.Call;
import retrofit2.http.*;
import com.testvagrant.ekam.reports.annotations.APIStep;

public class LoginUserClient extends RetrofitBaseClient {

    private interface LoginUserService {
        @POST("/api/login")
        Call<LoginUserResponse> newRequest(@Body LoginUserRequest request);
        @POST("/api/login")
        Call<LoginUserNegativeResponse> newRequest(@Body LoginUserNegativeRequest request);
    }


    private final LoginUserService service;

    @Inject
    public LoginUserClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(LoginUserService.class);
    }

    @APIStep(keyword = "When", description = "I invoke login user api")
    public LoginUserResponse loginUser(LoginUserRequest loginUserRequest) {
        Call<LoginUserResponse> call=service.newRequest(loginUserRequest);
        return httpClient.execute(call);
    }

    @APIStep(keyword = "When", description = "I invoke login user api")
    public LoginUserNegativeResponse loginUser(LoginUserNegativeRequest loginUserNegativeRequest) {
        Call<LoginUserNegativeResponse> call=service.newRequest(loginUserNegativeRequest);
        return httpClient.execute(call);
    }


}