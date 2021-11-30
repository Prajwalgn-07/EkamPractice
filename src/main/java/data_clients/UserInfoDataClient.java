package data_clients;

import data_clients.data_pojo.UserInfoForAPI;
import data_clients.data_pojo.UserInfoForUi;
import com.testvagrant.ekam.commons.data.DataSetsClient;
import java.lang.reflect.Type;

public class UserInfoDataClient extends DataSetsClient {
  public UserInfoForAPI getApiDetails(){
    return (UserInfoForAPI) getDetails(DataKeys.API_USER_DETAILS,UserInfoForAPI.class);
  }
  public UserInfoForUi getUiDetails(){
    System.out.println(DataKeys.UI_USER_DETAILS);
    return (UserInfoForUi) getDetails(DataKeys.UI_USER_DETAILS,UserInfoForUi.class);
  }
  private Object getDetails(String key,Type classValue) {
    System.out.println(key);
    return getValue(key,classValue);
  }
  private static class DataKeys {
    public static final String UI_USER_DETAILS = "ui";
    public static final String API_USER_DETAILS  = "api";
  }
}