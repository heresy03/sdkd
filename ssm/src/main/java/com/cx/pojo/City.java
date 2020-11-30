package com.cx.pojo;

import java.util.Date;

public class City {
    private Integer cityId;

    private String cityName;

    private Integer proId;

    private Integer addNum;

    private Date createTime;

    private Date updateTime;

    private String reservedFields1;

    private String reservedFields2;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getAddNum() {
        return addNum;
    }

    public void setAddNum(Integer addNum) {
        this.addNum = addNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getReservedFields1() {
        return reservedFields1;
    }

    public void setReservedFields1(String reservedFields1) {
        this.reservedFields1 = reservedFields1 == null ? null : reservedFields1.trim();
    }

    public String getReservedFields2() {
        return reservedFields2;
    }

    public void setReservedFields2(String reservedFields2) {
        this.reservedFields2 = reservedFields2 == null ? null : reservedFields2.trim();
    }
}