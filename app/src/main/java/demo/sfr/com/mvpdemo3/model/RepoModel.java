package demo.sfr.com.mvpdemo3.model;

import java.util.List;

import demo.sfr.com.mvpdemo3.presenter.OnGetRepoListener;
import demo.sfr.com.mvpdemo3.remote.ApiUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Tong Hung on 17-Mar-17.
 */

public class RepoModel implements Callback<List<Repo>> {
    private OnGetRepoListener listener;

    public RepoModel(OnGetRepoListener listener) {
        this.listener = listener;
    }

    public void getGithubRepo(String user){
        ApiUtil.getApiService().getRepo(user).enqueue(this);
    }

    @Override
    public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
        listener.onGetRepoSuccess(call, response);
    }

    @Override
    public void onFailure(Call<List<Repo>> call, Throwable t) {
        listener.onGetRepoFailed(call, t);
    }
}
