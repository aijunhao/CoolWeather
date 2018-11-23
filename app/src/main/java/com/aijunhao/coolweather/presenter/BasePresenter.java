package com.aijunhao.coolweather.presenter;


import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * @Author Aijunhao
 * @Time 2018-11-22 19:18
 * @Description
 */
public abstract class BasePresenter {

    protected MyCallback callback;
    protected Gson gson;

    public BasePresenter(){
        callback = new MyCallback();
        gson = new Gson();
    }

    public class MyCallback implements Callback{


        @Override
        public void onFailure(Call call, IOException e) {
            System.out.print("数据加载失败" + e.getMessage());
        }

        @Override
        public void onResponse(Call call, Response response) throws IOException {
            System.out.print("数据加载成功");
            String json = response.body().string();
            parseDestInfo(json);
        }
    }

    // 解析数据
    protected abstract void parseDestInfo(String json);
}
