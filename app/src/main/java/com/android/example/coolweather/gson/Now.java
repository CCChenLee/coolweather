package com.android.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 果粒橙 on 2017.10.23.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
