package xblydxj.gank.utils;

import xblydxj.gank.AppConfig;

/**
 * Created by 46321 on 2016/7/26/026.
 */
public class Utils {
    public static void runOnUIThread(Runnable runnable){
        AppConfig.sHandler.post(runnable);
    }
}
