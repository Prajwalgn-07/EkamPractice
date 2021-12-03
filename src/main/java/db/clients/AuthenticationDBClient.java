package db.clients;

import com.testvagrant.ekam.db.clients.PostgresDBClient;

public class AuthenticationDBClient extends PostgresDBClient {
    private final Queries queries;

    protected AuthenticationDBClient() {
        super("testdb", "details");
        queries = load(Queries.class);
    }

    public Integer getOTP(String mobileNumber) {
        return queries.getOtp(mobileNumber);
    }
}
