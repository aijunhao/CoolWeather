package com.aijunhao.coolweather.model.net.bean;

/**
 * @Author Aijunhao
 * @Time 2018-11-20 21:33
 * @Description
 */
public class AQI {

    public AQICity city;

    public class AQICity{

        public String aqi;
        public String pm25;
    }
}
