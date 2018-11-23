package com.aijunhao.coolweather.presenter.activity;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;

import com.aijunhao.coolweather.presenter.BasePresenter;
import com.aijunhao.coolweather.ui.activity.WeatherActivity;

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
        weatherActivity.updateSharedPreferences("bing_pic", json);
        weatherActivity.updateBackground(json);
    }
}
