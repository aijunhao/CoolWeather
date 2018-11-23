package com.aijunhao.coolweather.dagger.component.activity;

import com.aijunhao.coolweather.dagger.module.activity.WeatherActivityModule;
import com.aijunhao.coolweather.ui.activity.WeatherActivity;

import dagger.Component;

/**
 * @Author Aijunhao
 * @Time 2018-11-23 19:05
 * @Description
 */
@Component(modules = WeatherActivityModule.class)
public interface WeatherActivityComponent {
    void in(WeatherActivity weatherActivity);
}

