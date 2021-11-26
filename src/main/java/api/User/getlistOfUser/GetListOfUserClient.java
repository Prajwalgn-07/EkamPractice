package api.User.getlistOfUser;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import retrofit2.Call;
import retrofit2.http.*;
import com.testvagrant.ekam.reports.annotations.APIStep;

public class GetListOfUserClient extends RetrofitBaseClient {

    private interface GetListOfUserService {
        @GET("/api/users/2")
        Call<GetListOfUserResponse> listOfUser();
    }

    private final GetListOfUserService service;

    @Inject
    public GetListOfUserClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(GetListOfUserService.class);
    }

    @APIStep(keyword = "When", description = "I invoke getListOfUser")
    public GetListOfUserResponse getListOfUser() {
        Call<GetListOfUserResponse>call=service.listOfUser();
        return httpClient.execute(call);
    }

}