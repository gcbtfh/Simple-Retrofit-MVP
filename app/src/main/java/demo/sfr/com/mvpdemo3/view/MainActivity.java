package demo.sfr.com.mvpdemo3.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.List;

import demo.sfr.com.mvpdemo3.R;
import demo.sfr.com.mvpdemo3.model.Repo;
import demo.sfr.com.mvpdemo3.presenter.RepoPresenter;
import retrofit2.Call;
import retrofit2.Response;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity implements RepoView {
    @ViewById
    EditText etName;
    @ViewById
    Button btnSubmit;
    @ViewById
    ListView lv;
    private RepoPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @AfterViews
    void init(){
        presenter = new RepoPresenter(this);
    }

    @Click(R.id.btnSubmit)
    void loadRepos(){
        presenter.getGithubRepo("gcbtfh");
    }

    @Override
    public void showSuccess(Call<List<Repo>> call, Response<List<Repo>> response) {
        List<Repo> listRepos = response.body();
        if(!listRepos.isEmpty()){
            lv.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listRepos));
        }
    }

    @Override
    public void showFailure(Call<List<Repo>> call, Throwable t) {
        Toast.makeText(this, "Get list repo failed", Toast.LENGTH_SHORT).show();
    }
}
