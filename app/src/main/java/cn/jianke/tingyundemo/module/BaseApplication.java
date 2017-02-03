package cn.jianke.tingyundemo.module;

import android.app.Application;
import com.networkbench.agent.impl.NBSAppAgent;
import cn.jianke.tingyundemo.commom.Constants;

/**
 * @className: BaseApplication
 * @classDescription: 应用基类
 * @author: leibing
 * @createTime: 2017/2/3
 */
public class BaseApplication extends Application{
    // sington
    private static BaseApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        // init sington
        instance = this;
        // init tingyun sdk
        NBSAppAgent.setLicenseKey(Constants.TINGYUN_APP_KEY).
                withLocationServiceEnabled(true).
                startInApplication(this.getApplicationContext());
    }

    /**
     * get sington
     * @author leibing
     * @createTime 2017/2/3
     * @lastModify 2017/2/3
     * @param
     * @return
     */
    public static BaseApplication getInstance(){
        if (instance == null){
            synchronized (BaseApplication.class){
                if (instance == null){
                    instance = new BaseApplication();
                }
            }
        }

        return instance;
    }
}
