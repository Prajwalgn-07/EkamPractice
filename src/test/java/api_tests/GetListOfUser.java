package api_tests;

import api.User.getlistOfUser.GetListOfUserClient;
import api.User.getlistOfUser.GetListOfUserResponse;
import com.testvagrant.ekam.testBases.testng.APITest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GetListOfUser extends APITest {

    @Test(groups = "api")
    public void allDetails() {
        String page="2";
        GetListOfUserResponse users=Client(GetListOfUserClient.class).getListOfUser(page);
        Assert.assertEquals(Integer.parseInt(page),users.getPage().intValue());
    }
}