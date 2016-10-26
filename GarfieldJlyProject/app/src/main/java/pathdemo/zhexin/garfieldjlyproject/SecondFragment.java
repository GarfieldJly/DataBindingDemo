package pathdemo.zhexin.garfieldjlyproject;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pathdemo.zhexin.garfieldjlyproject.bean.People;
import pathdemo.zhexin.garfieldjlyproject.databinding.FragmentSecondBinding;

/**
 * Created by jly on 2016/10/25.
 */
public class SecondFragment extends Fragment {
    People mPeople;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentSecondBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_second,container,false);
        mPeople = new People();
        mPeople.name.set("媛媛");
        mPeople.age.set(20);
        binding.setPeople(mPeople);
        binding.setClick(this);
        return binding.getRoot();
    }

    public void OnClick(View view){
        mPeople.name.set("娟娟");
    }
}
