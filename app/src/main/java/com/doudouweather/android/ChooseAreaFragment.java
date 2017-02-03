package com.doudouweather.android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.doudouweather.android.db.City;
import com.doudouweather.android.db.County;
import com.doudouweather.android.db.Province;

import java.util.List;

/**
 * Created by Administrator on 2017/2/3.
 */

public class ChooseAreaFragment extends Fragment {

    public static final int LEVEL_PROVINCE = 0;
    public static final int LEVEL_CITY = 1;
    public static final int LEVEL_COUNTY= 2;

    private TextView titleText;
    private Button backButton;
    private ListView listView;

    private ArrayAdapter<String> arrayAdapter;
    private List<String> dataList;

    /**
     * 省份列表
     */
    private List<Province> provinceList;

    /**
     * 城市列表
     */
    private List<City> cityList;

    /**
     * 县列表
     */
    private List<County> countyList;
    /**
     * 选中的省份
     */
    private Province selectedProvince;
    /**
     * 选中的市
     */
    private City selectedCity;
    /**
     * 选中的县
     */
    private County selectedCounty;
    /**
     * 选中的等级
     */
    private int currentLevel;


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.choose_area);


        return null;
    }
}
