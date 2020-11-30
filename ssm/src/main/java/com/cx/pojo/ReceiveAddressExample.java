package com.cx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReceiveAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceiveAddressExample() {
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

        public Criteria andRcvIdIsNull() {
            addCriterion("rcv_id is null");
            return (Criteria) this;
        }

        public Criteria andRcvIdIsNotNull() {
            addCriterion("rcv_id is not null");
            return (Criteria) this;
        }

        public Criteria andRcvIdEqualTo(Integer value) {
            addCriterion("rcv_id =", value, "rcvId");
            return (Criteria) this;
        }

        public Criteria andRcvIdNotEqualTo(Integer value) {
            addCriterion("rcv_id <>", value, "rcvId");
            return (Criteria) this;
        }

        public Criteria andRcvIdGreaterThan(Integer value) {
            addCriterion("rcv_id >", value, "rcvId");
            return (Criteria) this;
        }

        public Criteria andRcvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rcv_id >=", value, "rcvId");
            return (Criteria) this;
        }

        public Criteria andRcvIdLessThan(Integer value) {
            addCriterion("rcv_id <", value, "rcvId");
            return (Criteria) this;
        }

        public Criteria andRcvIdLessThanOrEqualTo(Integer value) {
            addCriterion("rcv_id <=", value, "rcvId");
            return (Criteria) this;
        }

        public Criteria andRcvIdIn(List<Integer> values) {
            addCriterion("rcv_id in", values, "rcvId");
            return (Criteria) this;
        }

        public Criteria andRcvIdNotIn(List<Integer> values) {
            addCriterion("rcv_id not in", values, "rcvId");
            return (Criteria) this;
        }

        public Criteria andRcvIdBetween(Integer value1, Integer value2) {
            addCriterion("rcv_id between", value1, value2, "rcvId");
            return (Criteria) this;
        }

        public Criteria andRcvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rcv_id not between", value1, value2, "rcvId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andReceiveNameIsNull() {
            addCriterion("receive_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNotNull() {
            addCriterion("receive_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameEqualTo(String value) {
            addCriterion("receive_name =", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotEqualTo(String value) {
            addCriterion("receive_name <>", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThan(String value) {
            addCriterion("receive_name >", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_name >=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThan(String value) {
            addCriterion("receive_name <", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThanOrEqualTo(String value) {
            addCriterion("receive_name <=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLike(String value) {
            addCriterion("receive_name like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotLike(String value) {
            addCriterion("receive_name not like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIn(List<String> values) {
            addCriterion("receive_name in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotIn(List<String> values) {
            addCriterion("receive_name not in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameBetween(String value1, String value2) {
            addCriterion("receive_name between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotBetween(String value1, String value2) {
            addCriterion("receive_name not between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIsNull() {
            addCriterion("receive_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIsNotNull() {
            addCriterion("receive_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneEqualTo(String value) {
            addCriterion("receive_phone =", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotEqualTo(String value) {
            addCriterion("receive_phone <>", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneGreaterThan(String value) {
            addCriterion("receive_phone >", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("receive_phone >=", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLessThan(String value) {
            addCriterion("receive_phone <", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLessThanOrEqualTo(String value) {
            addCriterion("receive_phone <=", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLike(String value) {
            addCriterion("receive_phone like", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotLike(String value) {
            addCriterion("receive_phone not like", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIn(List<String> values) {
            addCriterion("receive_phone in", values, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotIn(List<String> values) {
            addCriterion("receive_phone not in", values, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneBetween(String value1, String value2) {
            addCriterion("receive_phone between", value1, value2, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotBetween(String value1, String value2) {
            addCriterion("receive_phone not between", value1, value2, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIsNull() {
            addCriterion("receive_province is null");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIsNotNull() {
            addCriterion("receive_province is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceEqualTo(String value) {
            addCriterion("receive_province =", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNotEqualTo(String value) {
            addCriterion("receive_province <>", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceGreaterThan(String value) {
            addCriterion("receive_province >", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("receive_province >=", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceLessThan(String value) {
            addCriterion("receive_province <", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceLessThanOrEqualTo(String value) {
            addCriterion("receive_province <=", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceLike(String value) {
            addCriterion("receive_province like", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNotLike(String value) {
            addCriterion("receive_province not like", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIn(List<String> values) {
            addCriterion("receive_province in", values, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNotIn(List<String> values) {
            addCriterion("receive_province not in", values, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceBetween(String value1, String value2) {
            addCriterion("receive_province between", value1, value2, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNotBetween(String value1, String value2) {
            addCriterion("receive_province not between", value1, value2, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIsNull() {
            addCriterion("receive_city is null");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIsNotNull() {
            addCriterion("receive_city is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveCityEqualTo(String value) {
            addCriterion("receive_city =", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNotEqualTo(String value) {
            addCriterion("receive_city <>", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityGreaterThan(String value) {
            addCriterion("receive_city >", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityGreaterThanOrEqualTo(String value) {
            addCriterion("receive_city >=", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityLessThan(String value) {
            addCriterion("receive_city <", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityLessThanOrEqualTo(String value) {
            addCriterion("receive_city <=", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityLike(String value) {
            addCriterion("receive_city like", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNotLike(String value) {
            addCriterion("receive_city not like", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIn(List<String> values) {
            addCriterion("receive_city in", values, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNotIn(List<String> values) {
            addCriterion("receive_city not in", values, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityBetween(String value1, String value2) {
            addCriterion("receive_city between", value1, value2, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNotBetween(String value1, String value2) {
            addCriterion("receive_city not between", value1, value2, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaIsNull() {
            addCriterion("receive_area is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaIsNotNull() {
            addCriterion("receive_area is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaEqualTo(String value) {
            addCriterion("receive_area =", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaNotEqualTo(String value) {
            addCriterion("receive_area <>", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaGreaterThan(String value) {
            addCriterion("receive_area >", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaGreaterThanOrEqualTo(String value) {
            addCriterion("receive_area >=", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaLessThan(String value) {
            addCriterion("receive_area <", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaLessThanOrEqualTo(String value) {
            addCriterion("receive_area <=", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaLike(String value) {
            addCriterion("receive_area like", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaNotLike(String value) {
            addCriterion("receive_area not like", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaIn(List<String> values) {
            addCriterion("receive_area in", values, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaNotIn(List<String> values) {
            addCriterion("receive_area not in", values, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaBetween(String value1, String value2) {
            addCriterion("receive_area between", value1, value2, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaNotBetween(String value1, String value2) {
            addCriterion("receive_area not between", value1, value2, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailIsNull() {
            addCriterion("receive_detail is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailIsNotNull() {
            addCriterion("receive_detail is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailEqualTo(String value) {
            addCriterion("receive_detail =", value, "receiveDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailNotEqualTo(String value) {
            addCriterion("receive_detail <>", value, "receiveDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailGreaterThan(String value) {
            addCriterion("receive_detail >", value, "receiveDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailGreaterThanOrEqualTo(String value) {
            addCriterion("receive_detail >=", value, "receiveDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailLessThan(String value) {
            addCriterion("receive_detail <", value, "receiveDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailLessThanOrEqualTo(String value) {
            addCriterion("receive_detail <=", value, "receiveDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailLike(String value) {
            addCriterion("receive_detail like", value, "receiveDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailNotLike(String value) {
            addCriterion("receive_detail not like", value, "receiveDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailIn(List<String> values) {
            addCriterion("receive_detail in", values, "receiveDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailNotIn(List<String> values) {
            addCriterion("receive_detail not in", values, "receiveDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailBetween(String value1, String value2) {
            addCriterion("receive_detail between", value1, value2, "receiveDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailNotBetween(String value1, String value2) {
            addCriterion("receive_detail not between", value1, value2, "receiveDetail");
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