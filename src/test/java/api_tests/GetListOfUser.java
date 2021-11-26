package api_tests;

import api.User.getlistOfUser.GetListOfUserClient;
import api.User.getlistOfUser.GetListOfUserResponse;
import com.testvagrant.ekam.testBases.testng.APITest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GetListOfUser extends APITest {

    @Test(groups = "api")
    public void allDetails() {
        GetListOfUserResponse users=Client(GetListOfUserClient.class).getListOfUser();
        System.out.println(users.getPerPage());
    }
}