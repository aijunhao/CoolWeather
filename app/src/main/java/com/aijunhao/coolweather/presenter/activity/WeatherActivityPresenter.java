package com.aijunhao.coolweather.presenter.activity;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;
import android.util.Log;

import com.aijunhao.coolweather.presenter.BasePresenter;
import com.aijunhao.coolweather.ui.activity.WeatherActivity;
import com.aijunhao.coolweather.util.Constant;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @Author Aijunhao
 * @Time 2018-11-23 19:00
 * @Description
 */
public class WeatherActivityPresenter extends BasePresenter{

    private static final String TAG = WeatherActivityPresenter.class.getName();
    private WeatherActivity weatherActivity;

    @Inject
    public WeatherActivityPresenter(WeatherActivity weatherActivity) {
        this.weatherActivity = weatherActivity;
    }

    public void getData(String url) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(callback);
    }

    @Override
    protected void parseDestInfo(String json) {
        String bingPicUrl = Constant.BING;
        try {
            /**
             * 解析必应每日一图的json数据，获取图片地址，与必应头部拼接，得到每日一图的地址
             */
            String url = new JSONArray(new JSONObject(json).getString("images")).getJSONObject(0).getString("url");
            bingPicUrl += url;
            Log.d(TAG, "bingPicUrl: " + bingPicUrl);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        weatherActivity.updateSharedPreferences("bing_pic", bingPicUrl);
        weatherActivity.updateBackground(bingPicUrl);
    }
}
