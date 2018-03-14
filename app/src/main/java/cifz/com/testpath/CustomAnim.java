package cifz.com.testpath;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by wangzhen on 2018/3/14.
 */

public class CustomAnim extends Animation {



    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
    }
}
