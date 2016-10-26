package pathdemo.zhexin.garfieldjlyproject;

import android.app.Activity;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import pathdemo.zhexin.garfieldjlyproject.bean.User;

/**
 * Created by jly on 2016/10/26.
 */
public class UserActivity extends Activity {
    private UserAdapter mUserAdapter;
    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user1);
        mRecyclerView = (RecyclerView) findViewById(R.id.rv);
        ArrayList<User> users = new ArrayList<>();
        for(int i = 0; i < 10 ;i++){
            User user = new User(new ObservableField<>("景"+i),new ObservableField<>("丽媛"+i),new ObservableInt(i));
            users.add(user);
        }
        mUserAdapter = new UserAdapter(this,users);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        mRecyclerView.setAdapter(mUserAdapter);
    }
}
