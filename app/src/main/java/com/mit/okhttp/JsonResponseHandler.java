package com.mit.okhttp;

/**
 * json类型的回调接口
 * Created by tsy on 16/8/15.
 */
public abstract class JsonResponseHandler implements IResponseHandler {

    public abstract void onSuccess(int statusCode, String response) ;

    @Override
    public void onProgress(long currentBytes, long totalBytes) {

    }
}
