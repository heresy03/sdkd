package com.cx.pojo;

import java.util.Date;

public class CourierWork {
    private Integer id;

    private Integer courierNum;

    private Integer sendAmount;

    private Integer completeAmount;

    private Date createTime;

    private Date updateTime;

    private String reservedFields1;

    private String reservedFields2;

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

    public Integer getSendAmount() {
        return sendAmount;
    }

    public void setSendAmount(Integer sendAmount) {
        this.sendAmount = sendAmount;
    }

    public Integer getCompleteAmount() {
        return completeAmount;
    }

    public void setCompleteAmount(Integer completeAmount) {
        this.completeAmount = completeAmount;
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