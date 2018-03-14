package cifz.com.testpath;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by wangzhen on 2018/3/5.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
