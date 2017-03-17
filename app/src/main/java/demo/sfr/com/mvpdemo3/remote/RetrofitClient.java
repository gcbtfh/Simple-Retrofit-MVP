package demo.sfr.com.mvpdemo3.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Tong Hung on 17-Mar-17.
 */

public class RetrofitClient {
    public static Retrofit instance = null;
    public static Retrofit getClient(String baseUrl){
        if(instance == null){
            instance = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return instance;
    }
}
