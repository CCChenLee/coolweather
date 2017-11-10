package com.android.example.coolweather.gson;

/**
 * Created by 果粒橙 on 2017.10.23.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
