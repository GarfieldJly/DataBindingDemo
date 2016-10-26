package pathdemo.zhexin.garfieldjlyproject;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jly on 2016/10/26.
 */
public abstract class BaseBindingViewHolder<T> extends RecyclerView.ViewHolder {
    protected Context mContext;
    protected ViewDataBinding mBinding;

    public BaseBindingViewHolder(Context context, View view) {
        this(context, DataBindingUtil.bind(view));
    }

    public BaseBindingViewHolder(Context context, ViewDataBinding binding) {
        super(binding.getRoot());
        mContext = context;
        mBinding = binding;
    }

    public BaseBindingViewHolder(Context context, int layoutResId, ViewGroup parent) {
        this(context, DataBindingUtil.bind(LayoutInflater.from(context).inflate(layoutResId, parent, false)));
    }

    public abstract void bindData(int position, T data);


}
