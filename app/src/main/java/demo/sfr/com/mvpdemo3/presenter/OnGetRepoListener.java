package demo.sfr.com.mvpdemo3.presenter;

import java.util.List;

import demo.sfr.com.mvpdemo3.model.Repo;
import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by Tong Hung on 17-Mar-17.
 */

public interface OnGetRepoListener {
    void onGetRepoSuccess(Call<List<Repo>> call, Response<List<Repo>> response);
    void onGetRepoFailed(Call<List<Repo>> call, Throwable t);
}
