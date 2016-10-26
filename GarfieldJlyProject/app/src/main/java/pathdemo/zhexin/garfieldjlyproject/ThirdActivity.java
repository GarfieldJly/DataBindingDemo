package pathdemo.zhexin.garfieldjlyproject;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;

import pathdemo.zhexin.garfieldjlyproject.bean.People;
import pathdemo.zhexin.garfieldjlyproject.databinding.ActivityThirdBinding;

/**
 * Created by jly on 2016/10/25.
 */
public class ThirdActivity extends Activity {
    ArrayList<People> mPeoples = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityThirdBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_third);


        for(int i = 0; i < 20; i++){
            People people = new People();
            people.name.set("媛媛"+i);
            people.age.set(i);
            mPeoples.add(people);
        }
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        binding.recyclerView.setAdapter(new PeopleAdapter(mPeoples));

        binding.setImageUrl("http://a.hiphotos.baidu.com/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=5bc95157f8dcd100d991f07313e22c75/622762d0f703918fc0e2c690513d269759eec4bd.jpg");
    }
}
