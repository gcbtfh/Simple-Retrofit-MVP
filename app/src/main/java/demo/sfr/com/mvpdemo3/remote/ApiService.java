package demo.sfr.com.mvpdemo3.remote;

import java.util.List;

import demo.sfr.com.mvpdemo3.model.Repo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Tong Hung on 17-Mar-17.
 */

public interface ApiService {
    @GET("users/{user}/repos")
    Call<List<Repo>> getRepo(@Path("user") String user);
}
