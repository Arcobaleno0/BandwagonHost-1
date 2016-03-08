package net.sunzc.bandwagonhost.http;

import com.loopj.android.http.BaseJsonHttpResponseHandler;
import cz.msebera.android.httpclient.Header;

/**
 * Created by sunzc on 2016/3/8.
 */
public class ProgressResponseHandler extends BaseJsonHttpResponseHandler {

    @Override
    public void onSuccess(int statusCode, Header[] headers, String rawJsonResponse, Object response) {

    }

    @Override
    public void onFailure(int statusCode, Header[] headers, Throwable throwable, String rawJsonData, Object errorResponse) {

    }

    @Override
    protected Object parseResponse(String rawJsonData, boolean isFailure) throws Throwable {
        return null;
    }
}
