package com.cx.pojo;

import java.util.Date;

public class CourierRcv {
    private Integer id;

    private Integer courierNum;

    private Integer pageId;

    private String pageNum;

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

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum == null ? null : pageNum.trim();
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