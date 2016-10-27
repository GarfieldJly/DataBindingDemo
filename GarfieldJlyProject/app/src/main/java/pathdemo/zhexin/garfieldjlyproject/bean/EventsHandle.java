package pathdemo.zhexin.garfieldjlyproject.bean;

import android.view.View;
import android.widget.Toast;

/**
 * Created by jly on 2016/10/25.
 */
public class EventsHandle  {
    public void handleClick(View view) {
        Toast.makeText(view.getContext(), "you clicked the view", Toast.LENGTH_LONG).show();
    }
}
