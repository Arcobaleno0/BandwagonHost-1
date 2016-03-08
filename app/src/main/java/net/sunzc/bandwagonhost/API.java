package net.sunzc.bandwagonhost;

/**
 * Created by sun on 16-3-8.
 */
public class API {
    public static final String SERVER_URL = "https://api.kiwivm.it7.net/v1/";
    public static final String API_KEY = "private_zVnWR45ekzEN5uxdSfL3P0th";
    public static final String VEID = "263095";
    private String mUrl;

    public API(String method) {
        mUrl = SERVER_URL + method;
    }

    public void post() {

    }

    /**
     * 开启VPS
     */
    public static class Start extends API {

        public Start() {
            super("start");
        }
    }

    /**
     * 关闭VPS
     */
    public static class Stop extends API {

        public Stop() {
            super("stop");
        }
    }

    /**
     * 重启VPS
     */
    public static class Restart extends API {

        public Restart() {
            super("restart");
        }
    }

    /**
     * 强制关闭VPS，所有的工作及数据都不会被保存
     */
    public static class Kill extends API {

        public Kill() {
            super("kill");
        }
    }

    /**
     * 获取主机的所有信息
     */
    public static class GetServiceInfo extends API {

        public GetServiceInfo() {
            super("getServiceInfo");
        }
    }

    /**
     * 获取主机的用量信息
     */
    public static class GetLiveServiceInfo extends API {

        public GetLiveServiceInfo() {
            super("getLiveServiceInfo");
        }
    }
}
