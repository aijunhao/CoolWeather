package com.aijunhao.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @Author Aijunhao
 * @Time 2018-11-20 18:36
 * @Description
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
