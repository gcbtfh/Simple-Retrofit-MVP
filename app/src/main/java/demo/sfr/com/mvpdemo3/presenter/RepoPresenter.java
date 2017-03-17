package demo.sfr.com.mvpdemo3.presenter;

import java.util.List;

import demo.sfr.com.mvpdemo3.model.Repo;
import demo.sfr.com.mvpdemo3.model.RepoModel;
import demo.sfr.com.mvpdemo3.view.RepoView;
import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by Tong Hung on 17-Mar-17.
 */

public class RepoPresenter implements OnGetRepoListener {
    private RepoView view;
    private RepoModel model;

    public RepoPresenter(RepoView view) {
        this.view = view;
        model = new RepoModel(this);

    }

    public void getGithubRepo(String user){
        model.getGithubRepo(user);
    }

    @Override
    public void onGetRepoSuccess(Call<List<Repo>> call, Response<List<Repo>> response) {
        view.showSuccess(call, response);
    }

    @Override
    public void onGetRepoFailed(Call<List<Repo>> call, Throwable t) {
        view.showFailure(call, t);
    }
}
