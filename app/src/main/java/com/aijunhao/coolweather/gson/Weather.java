package com.aijunhao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Author Aijunhao
 * @Time 2018-11-21 14:55
 * @Description
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Suggestion suggestion;
    public Now now;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
