package com.aijunhao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Author Aijunhao
 * @Time 2018-11-20 21:30
 * @Description
 */
public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
