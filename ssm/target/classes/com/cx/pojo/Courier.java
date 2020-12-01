package com.cx.pojo;

import java.util.Date;

public class Courier {
    private Integer id;

    private Integer courierNum;

    private String courierPhone;

    private String courierPassword;

    private String courierName;

    private String courierProvince;

    private String courierCity;

    private String courierArea;

    private String sex;

    private String idCard;

    private Integer siteId;

    private Integer rights;

    private Date createTime;

    private Date updateTime;

    private String reservedFields1;

    private String reservedFields2;

    @Override
    public String toString() {
        return "Courier{" +
                "id=" + id +
                ", courierNum=" + courierNum +
                ", courierPhone='" + courierPhone + '\'' +
                ", courierPassword='" + courierPassword + '\'' +
                ", courierName='" + courierName + '\'' +
                ", courierProvince='" + courierProvince + '\'' +
                ", courierCity='" + courierCity + '\'' +
                ", courierArea='" + courierArea + '\'' +
                ", sex='" + sex + '\'' +
                ", idCard='" + idCard + '\'' +
                ", siteId=" + siteId +
                ", rights=" + rights +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", reservedFields1='" + reservedFields1 + '\'' +
                ", reservedFields2='" + reservedFields2 + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourierNum() {
        return courierNum;
    }

    public void setCourierNum(Integer courierNum) {
        this.courierNum = courierNum;
    }

    public String getCourierPhone() {
        return courierPhone;
    }

    public void setCourierPhone(String courierPhone) {
        this.courierPhone = courierPhone == null ? null : courierPhone.trim();
    }

    public String getCourierPassword() {
        return courierPassword;
    }

    public void setCourierPassword(String courierPassword) {
        this.courierPassword = courierPassword == null ? null : courierPassword.trim();
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName == null ? null : courierName.trim();
    }

    public String getCourierProvince() {
        return courierProvince;
    }

    public void setCourierProvince(String courierProvince) {
        this.courierProvince = courierProvince == null ? null : courierProvince.trim();
    }

    public String getCourierCity() {
        return courierCity;
    }

    public void setCourierCity(String courierCity) {
        this.courierCity = courierCity == null ? null : courierCity.trim();
    }

    public String getCourierArea() {
        return courierArea;
    }

    public void setCourierArea(String courierArea) {
        this.courierArea = courierArea == null ? null : courierArea.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getRights() {
        return rights;
    }

    public void setRights(Integer rights) {
        this.rights = rights;
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