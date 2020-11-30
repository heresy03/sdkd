package com.cx.pojo;

import java.util.Date;

public class Site {
    private Integer siteId;

    private String siteName;

    private String sitePhone;

    private Integer areaId;

    private Integer cityId;

    private Integer proId;

    private Date createTime;

    private Date updateTime;

    private String reservedFields1;

    private String reservedFields2;

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    public String getSitePhone() {
        return sitePhone;
    }

    public void setSitePhone(String sitePhone) {
        this.sitePhone = sitePhone == null ? null : sitePhone.trim();
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
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