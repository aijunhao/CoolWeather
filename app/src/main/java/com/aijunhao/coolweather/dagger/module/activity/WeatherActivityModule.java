package com.aijunhao.coolweather.dagger.module.activity;

import com.aijunhao.coolweather.ui.activity.WeatherActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @Author Aijunhao
 * @Time 2018-11-23 19:04
 * @Description
 */
@Module
public class WeatherActivityModule {

    WeatherActivity weatherActivity;

    public WeatherActivityModule(WeatherActivity weatherActivity){
        this.weatherActivity = weatherActivity;
    }

    @Provides
    WeatherActivity ProviderGoodsActivity(){
        return weatherActivity;
    }
}
