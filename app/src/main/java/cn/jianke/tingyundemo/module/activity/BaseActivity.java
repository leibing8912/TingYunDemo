package cn.jianke.tingyundemo.module.activity;

import android.app.Activity;
import android.os.Bundle;
import com.networkbench.agent.impl.NBSAppAgent;
import cn.jianke.tingyundemo.commom.Constants;

/**
 * @className: BaseActivity
 * @classDescription:  activity基类
 * @author: leibing
 * @createTime: 2017/2/3
 */

public class BaseActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // init tingyun sdk
        NBSAppAgent.setLicenseKey(Constants.TINGYUN_APP_KEY).
                withLocationServiceEnabled(true).start(this.getApplicationContext());
        // 启用腾讯X5框架初始化方法
        NBSAppAgent.setLicenseKey(Constants.TINGYUN_APP_KEY).start(this.getApplicationContext());
        // 禁用地理位置信息采集
        NBSAppAgent.setLicenseKey(Constants.TINGYUN_APP_KEY).start(this.getApplicationContext());
    }
}
