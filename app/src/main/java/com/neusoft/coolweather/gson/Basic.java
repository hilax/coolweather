package com.neusoft.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Hilax on 2017/12/26.
 */

public class Basic {
    @SerializedName("city")
    public  String cityName;

    @SerializedName("id")
    public  String weatherId;

    public Update update;

    public  class Update{
        @SerializedName("loc")
        public  String updateTime;
    }
}
