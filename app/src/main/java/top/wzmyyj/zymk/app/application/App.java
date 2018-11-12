package top.wzmyyj.zymk.app.application;

//import com.ego.shadow.Shadow;

import com.ego.shadow.Shadow;

import top.wzmyyj.wzm_sdk.tools.L;
import top.wzmyyj.zymk.R;
import top.wzmyyj.zymk.common.utils.StatusBarUtil;
import top.wzmyyj.zymk.model.db.utils.DaoManager;
import top.wzmyyj.zymk.view.activity.LaunchActivity;
import top.wzmyyj.zymk.view.activity.MainActivity;

/**
 * Created by yyj on 2018/06/28. email: 2209011667@qq.com
 * 应用的Application。
 */

public class App extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        StatusBarUtil.initStatusBarHeight(this);
        DaoManager.getInstance(this.getApplicationContext());
        L.setTAG("ZZZZZZZ");
        L.setDebug(false);
//        Shadow.layout(R.layout.activity_launch);
//        Shadow.init("michael20181008zymk",MainActivity.class);
        Shadow.init(this,"1808051020",MainActivity.class);
    }
}
