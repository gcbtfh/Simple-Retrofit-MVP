package demo.sfr.com.mvpdemo3.remote;

/**
 * Created by Tong Hung on 17-Mar-17.
 */

public class ApiUtil {
    public static final String BASE_URL = "https://api.github.com/";
    public static ApiService getApiService(){
        return RetrofitClient.getClient(BASE_URL).create(ApiService.class);
    }
}
