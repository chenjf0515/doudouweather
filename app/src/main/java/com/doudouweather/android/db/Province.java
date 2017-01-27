package com.doudouweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by jiafa on 2017/1/27.
 */

public class Province extends DataSupport {
    private int id;
    private int provinceCode;
    private String provinceName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
