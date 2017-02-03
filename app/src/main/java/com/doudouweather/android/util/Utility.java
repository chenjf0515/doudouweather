package com.doudouweather.android.util;

import android.text.TextUtils;

import com.doudouweather.android.db.City;
import com.doudouweather.android.db.County;
import com.doudouweather.android.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Administrator on 2017/2/3.
 */

public class Utility {
    /**
     * 解析处理province数据
     *
     * @param response
     * @return
     */

    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allprovinces = new JSONArray(response);
                for (int i = 0; i < allprovinces.length(); i++) {
                    JSONObject provinceObiect = allprovinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObiect.getString("name"));
                    province.setProvinceCode(provinceObiect.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析返回的city数据
     *
     * @param response
     * @param provinceId
     * @return
     */
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析返回的county数据
     * @param response
     * @param ciytId
     * @return
     */

    public static boolean handleCountyResponse(String response,int ciytId){
        try {
            JSONArray allCounties = new JSONArray(response);
            for (int i = 0; i < allCounties.length(); i++) {
                JSONObject countyObject = allCounties.getJSONObject(i);
                County county = new County();
                county.setCountyName(countyObject.getString("name"));
                county.setCityId(ciytId);
                county.setWeatherId(countyObject.getInt("weather_id"));
                county.save();
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return false;
    }


}
