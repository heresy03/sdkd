package com.cx.pojo;

import com.alibaba.druid.sql.visitor.functions.Char;

public class Courier {
    private Integer id;
    private Integer courierNum;
    private String courierPhone;
    private String courierPassword;
    private String courierName;
    private String courierProvince;
    private String courierArea;
    private Char sex;
    private Long idCard;
    private Integer siteId;
    private Integer rights;

    @Override
    public String toString() {
        return "Courier{" +
                "id=" + id +
                ", courierNum=" + courierNum +
                ", courierPhone='" + courierPhone + '\'' +
                ", courierPassword='" + courierPassword + '\'' +
                ", courierName='" + courierName + '\'' +
                ", courierProvince='" + courierProvince + '\'' +
                ", courierArea='" + courierArea + '\'' +
                ", sex=" + sex +
                ", idCard=" + idCard +
                ", siteId=" + siteId +
                ", rights=" + rights +
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
        this.courierPhone = courierPhone;
    }

    public String getCourierPassword() {
        return courierPassword;
    }

    public void setCourierPassword(String courierPassword) {
        this.courierPassword = courierPassword;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public String getCourierProvince() {
        return courierProvince;
    }

    public void setCourierProvince(String courierProvince) {
        this.courierProvince = courierProvince;
    }

    public String getCourierArea() {
        return courierArea;
    }

    public void setCourierArea(String courierArea) {
        this.courierArea = courierArea;
    }

    public Char getSex() {
        return sex;
    }

    public void setSex(Char sex) {
        this.sex = sex;
    }

    public Long getIdCard() {
        return idCard;
    }

    public void setIdCard(Long idCard) {
        this.idCard = idCard;
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
}
