package pathdemo.zhexin.garfieldjlyproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jly on 2016/10/25.
 */
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportFragmentManager().beginTransaction().replace(R.id.content_view,new SecondFragment()).commit();
    }
}
