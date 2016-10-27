package pathdemo.zhexin.garfieldjlyproject;

import android.content.Context;
import android.view.ViewGroup;

import pathdemo.zhexin.garfieldjlyproject.bean.User;

/**
 * Created by jly on 2016/10/26.
 * 把数据的绑定写在ViewHolder中
 */
public class UserViewHolder extends BaseBindingViewHolder {

    public UserViewHolder(Context context,  ViewGroup parent) {
        super(context, R.layout.adapter_user, parent);
    }

    @Override
    public void bindData(int position, Object data) {
        User user = (User) data;
        mBinding.setVariable(pathdemo.zhexin.garfieldjlyproject.BR.user,user);
        mBinding.executePendingBindings();
    }
}
