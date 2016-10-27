package pathdemo.zhexin.garfieldjlyproject;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import pathdemo.zhexin.garfieldjlyproject.bean.People;
import pathdemo.zhexin.garfieldjlyproject.databinding.AdapterPeopleBinding;

/**
 * Created by jly on 2016/10/25.
 */
public class PeopleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<People> mPeoples = new ArrayList<>();

    public PeopleAdapter(ArrayList<People> peoples) {
        mPeoples = peoples;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AdapterPeopleBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.adapter_people,parent,false);
        BaseViewHolder viewHolder = new BaseViewHolder(binding.getRoot());
        viewHolder.setBinding(binding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        BaseViewHolder baseViewHolder = (BaseViewHolder) holder;
        baseViewHolder.getBinding().setVariable(pathdemo.zhexin.garfieldjlyproject.BR.pp,mPeoples.get(position));
        baseViewHolder.getBinding().image.setImageResource(R.mipmap.ic_launcher);
        baseViewHolder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mPeoples.size();
    }

    class BaseViewHolder extends RecyclerView.ViewHolder{
        AdapterPeopleBinding binding;

        public AdapterPeopleBinding getBinding() {
            return binding;
        }

        public void setBinding(AdapterPeopleBinding binding) {
            this.binding = binding;
        }

        public BaseViewHolder(View itemView) {
            super(itemView);
        }
    }
}
