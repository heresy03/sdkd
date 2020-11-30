package com.cx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransferExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPageNumIsNull() {
            addCriterion("page_num is null");
            return (Criteria) this;
        }

        public Criteria andPageNumIsNotNull() {
            addCriterion("page_num is not null");
            return (Criteria) this;
        }

        public Criteria andPageNumEqualTo(String value) {
            addCriterion("page_num =", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumNotEqualTo(String value) {
            addCriterion("page_num <>", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumGreaterThan(String value) {
            addCriterion("page_num >", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumGreaterThanOrEqualTo(String value) {
            addCriterion("page_num >=", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumLessThan(String value) {
            addCriterion("page_num <", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumLessThanOrEqualTo(String value) {
            addCriterion("page_num <=", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumLike(String value) {
            addCriterion("page_num like", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumNotLike(String value) {
            addCriterion("page_num not like", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumIn(List<String> values) {
            addCriterion("page_num in", values, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumNotIn(List<String> values) {
            addCriterion("page_num not in", values, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumBetween(String value1, String value2) {
            addCriterion("page_num between", value1, value2, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumNotBetween(String value1, String value2) {
            addCriterion("page_num not between", value1, value2, "pageNum");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNull() {
            addCriterion("driver_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("driver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(Integer value) {
            addCriterion("driver_id =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(Integer value) {
            addCriterion("driver_id <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(Integer value) {
            addCriterion("driver_id >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("driver_id >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(Integer value) {
            addCriterion("driver_id <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(Integer value) {
            addCriterion("driver_id <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<Integer> values) {
            addCriterion("driver_id in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<Integer> values) {
            addCriterion("driver_id not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(Integer value1, Integer value2) {
            addCriterion("driver_id between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("driver_id not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNull() {
            addCriterion("driver_name is null");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNotNull() {
            addCriterion("driver_name is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNameEqualTo(String value) {
            addCriterion("driver_name =", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotEqualTo(String value) {
            addCriterion("driver_name <>", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThan(String value) {
            addCriterion("driver_name >", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("driver_name >=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThan(String value) {
            addCriterion("driver_name <", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThanOrEqualTo(String value) {
            addCriterion("driver_name <=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLike(String value) {
            addCriterion("driver_name like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotLike(String value) {
            addCriterion("driver_name not like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIn(List<String> values) {
            addCriterion("driver_name in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotIn(List<String> values) {
            addCriterion("driver_name not in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameBetween(String value1, String value2) {
            addCriterion("driver_name between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotBetween(String value1, String value2) {
            addCriterion("driver_name not between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andStartSiteNameIsNull() {
            addCriterion("start_site_name is null");
            return (Criteria) this;
        }

        public Criteria andStartSiteNameIsNotNull() {
            addCriterion("start_site_name is not null");
            return (Criteria) this;
        }

        public Criteria andStartSiteNameEqualTo(String value) {
            addCriterion("start_site_name =", value, "startSiteName");
            return (Criteria) this;
        }

        public Criteria andStartSiteNameNotEqualTo(String value) {
            addCriterion("start_site_name <>", value, "startSiteName");
            return (Criteria) this;
        }

        public Criteria andStartSiteNameGreaterThan(String value) {
            addCriterion("start_site_name >", value, "startSiteName");
            return (Criteria) this;
        }

        public Criteria andStartSiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("start_site_name >=", value, "startSiteName");
            return (Criteria) this;
        }

        public Criteria andStartSiteNameLessThan(String value) {
            addCriterion("start_site_name <", value, "startSiteName");
            return (Criteria) this;
        }

        public Criteria andStartSiteNameLessThanOrEqualTo(String value) {
            addCriterion("start_site_name <=", value, "startSiteName");
            return (Criteria) this;
        }

        public Criteria andStartSiteNameLike(String value) {
            addCriterion("start_site_name like", value, "startSiteName");
            return (Criteria) this;
        }

        public Criteria andStartSiteNameNotLike(String value) {
            addCriterion("start_site_name not like", value, "startSiteName");
            return (Criteria) this;
        }

        public Criteria andStartSiteNameIn(List<String> values) {
            addCriterion("start_site_name in", values, "startSiteName");
            return (Criteria) this;
        }

        public Criteria andStartSiteNameNotIn(List<String> values) {
            addCriterion("start_site_name not in", values, "startSiteName");
            return (Criteria) this;
        }

        public Criteria andStartSiteNameBetween(String value1, String value2) {
            addCriterion("start_site_name between", value1, value2, "startSiteName");
            return (Criteria) this;
        }

        public Criteria andStartSiteNameNotBetween(String value1, String value2) {
            addCriterion("start_site_name not between", value1, value2, "startSiteName");
            return (Criteria) this;
        }

        public Criteria andNowSiteNameIsNull() {
            addCriterion("now_site_name is null");
            return (Criteria) this;
        }

        public Criteria andNowSiteNameIsNotNull() {
            addCriterion("now_site_name is not null");
            return (Criteria) this;
        }

        public Criteria andNowSiteNameEqualTo(String value) {
            addCriterion("now_site_name =", value, "nowSiteName");
            return (Criteria) this;
        }

        public Criteria andNowSiteNameNotEqualTo(String value) {
            addCriterion("now_site_name <>", value, "nowSiteName");
            return (Criteria) this;
        }

        public Criteria andNowSiteNameGreaterThan(String value) {
            addCriterion("now_site_name >", value, "nowSiteName");
            return (Criteria) this;
        }

        public Criteria andNowSiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("now_site_name >=", value, "nowSiteName");
            return (Criteria) this;
        }

        public Criteria andNowSiteNameLessThan(String value) {
            addCriterion("now_site_name <", value, "nowSiteName");
            return (Criteria) this;
        }

        public Criteria andNowSiteNameLessThanOrEqualTo(String value) {
            addCriterion("now_site_name <=", value, "nowSiteName");
            return (Criteria) this;
        }

        public Criteria andNowSiteNameLike(String value) {
            addCriterion("now_site_name like", value, "nowSiteName");
            return (Criteria) this;
        }

        public Criteria andNowSiteNameNotLike(String value) {
            addCriterion("now_site_name not like", value, "nowSiteName");
            return (Criteria) this;
        }

        public Criteria andNowSiteNameIn(List<String> values) {
            addCriterion("now_site_name in", values, "nowSiteName");
            return (Criteria) this;
        }

        public Criteria andNowSiteNameNotIn(List<String> values) {
            addCriterion("now_site_name not in", values, "nowSiteName");
            return (Criteria) this;
        }

        public Criteria andNowSiteNameBetween(String value1, String value2) {
            addCriterion("now_site_name between", value1, value2, "nowSiteName");
            return (Criteria) this;
        }

        public Criteria andNowSiteNameNotBetween(String value1, String value2) {
            addCriterion("now_site_name not between", value1, value2, "nowSiteName");
            return (Criteria) this;
        }

        public Criteria andEndSiteNameIsNull() {
            addCriterion("end_site_name is null");
            return (Criteria) this;
        }

        public Criteria andEndSiteNameIsNotNull() {
            addCriterion("end_site_name is not null");
            return (Criteria) this;
        }

        public Criteria andEndSiteNameEqualTo(String value) {
            addCriterion("end_site_name =", value, "endSiteName");
            return (Criteria) this;
        }

        public Criteria andEndSiteNameNotEqualTo(String value) {
            addCriterion("end_site_name <>", value, "endSiteName");
            return (Criteria) this;
        }

        public Criteria andEndSiteNameGreaterThan(String value) {
            addCriterion("end_site_name >", value, "endSiteName");
            return (Criteria) this;
        }

        public Criteria andEndSiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("end_site_name >=", value, "endSiteName");
            return (Criteria) this;
        }

        public Criteria andEndSiteNameLessThan(String value) {
            addCriterion("end_site_name <", value, "endSiteName");
            return (Criteria) this;
        }

        public Criteria andEndSiteNameLessThanOrEqualTo(String value) {
            addCriterion("end_site_name <=", value, "endSiteName");
            return (Criteria) this;
        }

        public Criteria andEndSiteNameLike(String value) {
            addCriterion("end_site_name like", value, "endSiteName");
            return (Criteria) this;
        }

        public Criteria andEndSiteNameNotLike(String value) {
            addCriterion("end_site_name not like", value, "endSiteName");
            return (Criteria) this;
        }

        public Criteria andEndSiteNameIn(List<String> values) {
            addCriterion("end_site_name in", values, "endSiteName");
            return (Criteria) this;
        }

        public Criteria andEndSiteNameNotIn(List<String> values) {
            addCriterion("end_site_name not in", values, "endSiteName");
            return (Criteria) this;
        }

        public Criteria andEndSiteNameBetween(String value1, String value2) {
            addCriterion("end_site_name between", value1, value2, "endSiteName");
            return (Criteria) this;
        }

        public Criteria andEndSiteNameNotBetween(String value1, String value2) {
            addCriterion("end_site_name not between", value1, value2, "endSiteName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andReservedFields1IsNull() {
            addCriterion("reserved_fields1 is null");
            return (Criteria) this;
        }

        public Criteria andReservedFields1IsNotNull() {
            addCriterion("reserved_fields1 is not null");
            return (Criteria) this;
        }

        public Criteria andReservedFields1EqualTo(String value) {
            addCriterion("reserved_fields1 =", value, "reservedFields1");
            return (Criteria) this;
        }

        public Criteria andReservedFields1NotEqualTo(String value) {
            addCriterion("reserved_fields1 <>", value, "reservedFields1");
            return (Criteria) this;
        }

        public Criteria andReservedFields1GreaterThan(String value) {
            addCriterion("reserved_fields1 >", value, "reservedFields1");
            return (Criteria) this;
        }

        public Criteria andReservedFields1GreaterThanOrEqualTo(String value) {
            addCriterion("reserved_fields1 >=", value, "reservedFields1");
            return (Criteria) this;
        }

        public Criteria andReservedFields1LessThan(String value) {
            addCriterion("reserved_fields1 <", value, "reservedFields1");
            return (Criteria) this;
        }

        public Criteria andReservedFields1LessThanOrEqualTo(String value) {
            addCriterion("reserved_fields1 <=", value, "reservedFields1");
            return (Criteria) this;
        }

        public Criteria andReservedFields1Like(String value) {
            addCriterion("reserved_fields1 like", value, "reservedFields1");
            return (Criteria) this;
        }

        public Criteria andReservedFields1NotLike(String value) {
            addCriterion("reserved_fields1 not like", value, "reservedFields1");
            return (Criteria) this;
        }

        public Criteria andReservedFields1In(List<String> values) {
            addCriterion("reserved_fields1 in", values, "reservedFields1");
            return (Criteria) this;
        }

        public Criteria andReservedFields1NotIn(List<String> values) {
            addCriterion("reserved_fields1 not in", values, "reservedFields1");
            return (Criteria) this;
        }

        public Criteria andReservedFields1Between(String value1, String value2) {
            addCriterion("reserved_fields1 between", value1, value2, "reservedFields1");
            return (Criteria) this;
        }

        public Criteria andReservedFields1NotBetween(String value1, String value2) {
            addCriterion("reserved_fields1 not between", value1, value2, "reservedFields1");
            return (Criteria) this;
        }

        public Criteria andReservedFields2IsNull() {
            addCriterion("reserved_fields2 is null");
            return (Criteria) this;
        }

        public Criteria andReservedFields2IsNotNull() {
            addCriterion("reserved_fields2 is not null");
            return (Criteria) this;
        }

        public Criteria andReservedFields2EqualTo(String value) {
            addCriterion("reserved_fields2 =", value, "reservedFields2");
            return (Criteria) this;
        }

        public Criteria andReservedFields2NotEqualTo(String value) {
            addCriterion("reserved_fields2 <>", value, "reservedFields2");
            return (Criteria) this;
        }

        public Criteria andReservedFields2GreaterThan(String value) {
            addCriterion("reserved_fields2 >", value, "reservedFields2");
            return (Criteria) this;
        }

        public Criteria andReservedFields2GreaterThanOrEqualTo(String value) {
            addCriterion("reserved_fields2 >=", value, "reservedFields2");
            return (Criteria) this;
        }

        public Criteria andReservedFields2LessThan(String value) {
            addCriterion("reserved_fields2 <", value, "reservedFields2");
            return (Criteria) this;
        }

        public Criteria andReservedFields2LessThanOrEqualTo(String value) {
            addCriterion("reserved_fields2 <=", value, "reservedFields2");
            return (Criteria) this;
        }

        public Criteria andReservedFields2Like(String value) {
            addCriterion("reserved_fields2 like", value, "reservedFields2");
            return (Criteria) this;
        }

        public Criteria andReservedFields2NotLike(String value) {
            addCriterion("reserved_fields2 not like", value, "reservedFields2");
            return (Criteria) this;
        }

        public Criteria andReservedFields2In(List<String> values) {
            addCriterion("reserved_fields2 in", values, "reservedFields2");
            return (Criteria) this;
        }

        public Criteria andReservedFields2NotIn(List<String> values) {
            addCriterion("reserved_fields2 not in", values, "reservedFields2");
            return (Criteria) this;
        }

        public Criteria andReservedFields2Between(String value1, String value2) {
            addCriterion("reserved_fields2 between", value1, value2, "reservedFields2");
            return (Criteria) this;
        }

        public Criteria andReservedFields2NotBetween(String value1, String value2) {
            addCriterion("reserved_fields2 not between", value1, value2, "reservedFields2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}