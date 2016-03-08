package net.sunzc.bandwagonhost.http;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestParams;
import com.socks.library.KLog;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;

/**
 * Created by sun on 16-3-8.
 */
public class API {
    private static final String TAG = API.class.getSimpleName();
    public String api_key = "private_zVnWR45ekzEN5uxdSfL3P0th";
    public String veid = "263095";
    private String mUrl;
    private AsyncHttpClient mClient;

    public API(String method) {
        mUrl = "https://api.kiwivm.it7.net/v1/" + method;
        mClient = new AsyncHttpClient();
    }

    public void post(ProgressResponseHandler callback) {
        RequestParams params = generateParams();
        mClient.post(mUrl, params, callback);
        KLog.i(TAG, "请求的接口：" + mUrl + "?" + params.toString());
    }

    public void get(ProgressResponseHandler callback) {
        RequestParams params = generateParams();
        mClient.get(mUrl, params, callback);
        KLog.i(TAG, "请求的接口：" + mUrl + "?" + params.toString());
    }

    private RequestParams generateParams() {
        RequestParams params = new RequestParams();
        Field[] fields = this.getClass().getFields();
        for (Field field : fields) {
            String type = field.getType().getSimpleName();
            String fieldName = field.getName();
            Object value = null;
            try {
                value = field.get(this);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (value == null)
                KLog.w(type + "接口的" + fieldName + "参数没有添加");
            else {
                switch (type) {
                    case "String":
                    case "int":
                    case "Integer":
                    case "float":
                    case "Float":
                    case "Double":
                    case "double":
                        params.add(fieldName, String.valueOf(value).trim());
                        break;
                    case "File":
                        try {
                            params.put(fieldName, (File) value);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                        break;
                    default:
                        KLog.w(type + "类还没有支持");
                        break;
                }
            }
        }
        return params;
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

    public static class GetAvailableOS extends API {

        public GetAvailableOS() {
            super("getAvailableOS");
        }
    }

    public static class ReinstallOS extends API {
        public String os;

        public ReinstallOS() {
            super("reinstallOS");
        }
    }

    public static class ResetRootPassword extends API {

        public ResetRootPassword() {
            super("resetRootPassword");
        }
    }

    public static class GetUsageGraphs extends API {

        public GetUsageGraphs() {
            super("getUsageGraphs");
        }
    }

    public static class GetRawUsageStats extends API {

        public GetRawUsageStats() {
            super("getRawUsageStats");
        }
    }

    public static class SetHostname extends API {
        String newHostname;

        public SetHostname() {
            super("setHostname");
        }
    }

    public static class SetPTR extends API {
        String ip, ptr;

        public SetPTR() {
            super("setPTR");
        }
    }

    public static class BasicShell extends API {
        public String command;

        private BasicShell() {
            super("basicShell/exec");
        }

    }

    public static class ShellScript extends API {
        public String script;

        private ShellScript() {
            super("shellScript/exec");
        }

    }

    public static class Snapshot extends API {
        public String snapshot;
        public int sticky;

        private Snapshot(String method) {
            super("snapshot/" + method);
        }

        public static Snapshot List() {
            return new Snapshot("list");
        }

        public static Snapshot delete() {
            return new Snapshot("delete");
        }

        public static Snapshot restore() {
            return new Snapshot("restore");
        }

    }

    public static class IpV6 extends API {
        public String ip;

        private IpV6(String method) {
            super("ipv6/" + method);
        }

        public static IpV6 delete() {
            return new IpV6("delete");
        }

        public static IpV6 add() {
            return new IpV6("add");
        }

    }

    public static class Migrate extends API {
        public String location;

        public Migrate(String method) {
            super("migrate/" + method);
        }

        public static Migrate start() {
            return new Migrate("start");
        }
    }

    public static class CloneFromExternalServer extends API {
        String externalServerIP,
                externalServerSSHport,
                externalServerRootPassword;

        public CloneFromExternalServer() {
            super("cloneFromExternalServer");
        }
    }

    public static class GetSuspensionDetails extends API {

        public GetSuspensionDetails() {
            super("getSuspensionDetails");
        }
    }

    public static class UnSuspend extends API {
        public String record_id;

        public UnSuspend() {
            super("unsuspend");
        }
    }

    public static class GetRateLimitStatus extends API {

        public GetRateLimitStatus() {
            super("getRateLimitStatus");
        }
    }

}
