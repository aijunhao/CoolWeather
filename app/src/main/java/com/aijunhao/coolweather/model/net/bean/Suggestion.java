package com.aijunhao.coolweather.model.net.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @Author Aijunhao
 * @Time 2018-11-21 14:45
 * @Description
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
