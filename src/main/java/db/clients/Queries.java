package db.clients;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;

public interface Queries {
    @SqlQuery("SELECT otp FROM otp_details WHERE mobileNumber = :mobileNumber")
    Integer getOtp(@Bind("mobileNumber") String mobileNumber);
}
