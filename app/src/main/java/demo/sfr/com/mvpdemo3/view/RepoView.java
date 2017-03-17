package demo.sfr.com.mvpdemo3.view;

import java.util.List;

import demo.sfr.com.mvpdemo3.model.Repo;
import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by Tong Hung on 17-Mar-17.
 */

public interface RepoView {
    void showSuccess(Call<List<Repo>> call, Response<List<Repo>> response);
    void showFailure(Call<List<Repo>> call, Throwable t);
}
