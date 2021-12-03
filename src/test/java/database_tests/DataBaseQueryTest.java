package database_tests;

import com.google.inject.Inject;
import com.testvagrant.ekam.testBases.testng.APITest;
import db.clients.AuthenticationDBClient;
import io.cucumber.java.sl.In;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataBaseQueryTest extends APITest{

    @Inject
    AuthenticationDBClient client;

    @Test(groups = "db")
    public void shouldGetOtp() {
        Integer otp1 = client.getOTP("9898989898");
        Integer otp2=client.getOTP("9900990099");
        System.out.println(otp1);
        System.out.println(otp2);
        Assert.assertNotNull(otp1);
        Assert.assertNotNull(otp2);
    }
}
