package pathdemo.zhexin.garfieldjlyproject.bean;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by jly on 2016/10/26.
 */
public class User  {
    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<String> family_name = new ObservableField<>();
    public ObservableInt age = new ObservableInt();

    public User(ObservableField<String> name, ObservableField<String> family_name, ObservableInt age) {
        this.name = name;
        this.family_name = family_name;
        this.age = age;
    }
}
