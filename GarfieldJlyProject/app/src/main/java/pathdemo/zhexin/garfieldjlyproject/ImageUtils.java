package pathdemo.zhexin.garfieldjlyproject;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by jly on 2016/10/25.
 */
public class ImageUtils {
    @BindingAdapter({"bind:jlyimage"})
    public static void setImageUrl(ImageView image,String url){
        Glide.with(image.getContext()).load(url).into(image);
    }
}
