package com.cx.pojo;

import java.util.Date;

public class Transfer {
    private Integer id;

    private String pageNum;

    private Integer driverId;

    private String driverName;

    private String startSiteName;

    private String nowSiteName;

    private String endSiteName;

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

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum == null ? null : pageNum.trim();
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public String getStartSiteName() {
        return startSiteName;
    }

    public void setStartSiteName(String startSiteName) {
        this.startSiteName = startSiteName == null ? null : startSiteName.trim();
    }

    public String getNowSiteName() {
        return nowSiteName;
    }

    public void setNowSiteName(String nowSiteName) {
        this.nowSiteName = nowSiteName == null ? null : nowSiteName.trim();
    }

    public String getEndSiteName() {
        return endSiteName;
    }

    public void setEndSiteName(String endSiteName) {
        this.endSiteName = endSiteName == null ? null : endSiteName.trim();
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