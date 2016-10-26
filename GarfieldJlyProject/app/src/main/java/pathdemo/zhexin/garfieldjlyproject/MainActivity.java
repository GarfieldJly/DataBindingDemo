package pathdemo.zhexin.garfieldjlyproject;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

import pathdemo.zhexin.garfieldjlyproject.bean.EventsHandle;
import pathdemo.zhexin.garfieldjlyproject.bean.People;

public class MainActivity extends AppCompatActivity {
    People mPeople;
    ArrayList<String> mList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pathdemo.zhexin.garfieldjlyproject.Custom custom =  DataBindingUtil.setContentView(this,R.layout.activity_main);

        custom.setFamilyname("景景景景景景景景景景景景景景景景景景景景景景景景");
        custom.setMoney(100000.80f);
        custom.setError(false);
        custom.setHandlers(new EventsHandle());
        custom.setOnClick(this);
        mPeople = new People();
        mPeople.name.set("景仕进");
        custom.setPerson(mPeople);
        mList.add("你好");
//        custom.setList(mList);
    }

    public void click(View view){
//        userBean.setName("丽媛");
        mPeople.name.set("景丽娟");
        startActivity(new Intent(this,SecondActivity.class));
    }

}
