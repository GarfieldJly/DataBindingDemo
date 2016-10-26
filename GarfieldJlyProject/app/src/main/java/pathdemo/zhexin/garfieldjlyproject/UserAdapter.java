package pathdemo.zhexin.garfieldjlyproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import pathdemo.zhexin.garfieldjlyproject.bean.User;

/**
 * Created by jly on 2016/10/26.
 */
public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private Context mContext;
    private List<User> mUsers;

    public UserAdapter(Context context, List<User> users) {
        mContext = context;
        mUsers = users;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new UserViewHolder(mContext,parent);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.bindData(position,mUsers.get(position));
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }
}
