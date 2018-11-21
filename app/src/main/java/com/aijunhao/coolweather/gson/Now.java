package com.aijunhao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Author Aijunhao
 * @Time 2018-11-20 21:33
 * @Description
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
