package com.cx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SendAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SendAddressExample() {
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

        public Criteria andSendIdIsNull() {
            addCriterion("send_id is null");
            return (Criteria) this;
        }

        public Criteria andSendIdIsNotNull() {
            addCriterion("send_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendIdEqualTo(Integer value) {
            addCriterion("send_id =", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdNotEqualTo(Integer value) {
            addCriterion("send_id <>", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdGreaterThan(Integer value) {
            addCriterion("send_id >", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_id >=", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdLessThan(Integer value) {
            addCriterion("send_id <", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdLessThanOrEqualTo(Integer value) {
            addCriterion("send_id <=", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdIn(List<Integer> values) {
            addCriterion("send_id in", values, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdNotIn(List<Integer> values) {
            addCriterion("send_id not in", values, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdBetween(Integer value1, Integer value2) {
            addCriterion("send_id between", value1, value2, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdNotBetween(Integer value1, Integer value2) {
            addCriterion("send_id not between", value1, value2, "sendId");
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

        public Criteria andPageNumEqualTo(Integer value) {
            addCriterion("page_num =", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumNotEqualTo(Integer value) {
            addCriterion("page_num <>", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumGreaterThan(Integer value) {
            addCriterion("page_num >", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_num >=", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumLessThan(Integer value) {
            addCriterion("page_num <", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumLessThanOrEqualTo(Integer value) {
            addCriterion("page_num <=", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumIn(List<Integer> values) {
            addCriterion("page_num in", values, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumNotIn(List<Integer> values) {
            addCriterion("page_num not in", values, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumBetween(Integer value1, Integer value2) {
            addCriterion("page_num between", value1, value2, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumNotBetween(Integer value1, Integer value2) {
            addCriterion("page_num not between", value1, value2, "pageNum");
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

        public Criteria andSendNameIsNull() {
            addCriterion("send_name is null");
            return (Criteria) this;
        }

        public Criteria andSendNameIsNotNull() {
            addCriterion("send_name is not null");
            return (Criteria) this;
        }

        public Criteria andSendNameEqualTo(String value) {
            addCriterion("send_name =", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameNotEqualTo(String value) {
            addCriterion("send_name <>", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameGreaterThan(String value) {
            addCriterion("send_name >", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameGreaterThanOrEqualTo(String value) {
            addCriterion("send_name >=", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameLessThan(String value) {
            addCriterion("send_name <", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameLessThanOrEqualTo(String value) {
            addCriterion("send_name <=", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameLike(String value) {
            addCriterion("send_name like", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameNotLike(String value) {
            addCriterion("send_name not like", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameIn(List<String> values) {
            addCriterion("send_name in", values, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameNotIn(List<String> values) {
            addCriterion("send_name not in", values, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameBetween(String value1, String value2) {
            addCriterion("send_name between", value1, value2, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameNotBetween(String value1, String value2) {
            addCriterion("send_name not between", value1, value2, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendPhoneIsNull() {
            addCriterion("send_phone is null");
            return (Criteria) this;
        }

        public Criteria andSendPhoneIsNotNull() {
            addCriterion("send_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSendPhoneEqualTo(String value) {
            addCriterion("send_phone =", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneNotEqualTo(String value) {
            addCriterion("send_phone <>", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneGreaterThan(String value) {
            addCriterion("send_phone >", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("send_phone >=", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneLessThan(String value) {
            addCriterion("send_phone <", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneLessThanOrEqualTo(String value) {
            addCriterion("send_phone <=", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneLike(String value) {
            addCriterion("send_phone like", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneNotLike(String value) {
            addCriterion("send_phone not like", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneIn(List<String> values) {
            addCriterion("send_phone in", values, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneNotIn(List<String> values) {
            addCriterion("send_phone not in", values, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneBetween(String value1, String value2) {
            addCriterion("send_phone between", value1, value2, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneNotBetween(String value1, String value2) {
            addCriterion("send_phone not between", value1, value2, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendProvinceIsNull() {
            addCriterion("send_province is null");
            return (Criteria) this;
        }

        public Criteria andSendProvinceIsNotNull() {
            addCriterion("send_province is not null");
            return (Criteria) this;
        }

        public Criteria andSendProvinceEqualTo(String value) {
            addCriterion("send_province =", value, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceNotEqualTo(String value) {
            addCriterion("send_province <>", value, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceGreaterThan(String value) {
            addCriterion("send_province >", value, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("send_province >=", value, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceLessThan(String value) {
            addCriterion("send_province <", value, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceLessThanOrEqualTo(String value) {
            addCriterion("send_province <=", value, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceLike(String value) {
            addCriterion("send_province like", value, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceNotLike(String value) {
            addCriterion("send_province not like", value, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceIn(List<String> values) {
            addCriterion("send_province in", values, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceNotIn(List<String> values) {
            addCriterion("send_province not in", values, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceBetween(String value1, String value2) {
            addCriterion("send_province between", value1, value2, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendProvinceNotBetween(String value1, String value2) {
            addCriterion("send_province not between", value1, value2, "sendProvince");
            return (Criteria) this;
        }

        public Criteria andSendCityIsNull() {
            addCriterion("send_city is null");
            return (Criteria) this;
        }

        public Criteria andSendCityIsNotNull() {
            addCriterion("send_city is not null");
            return (Criteria) this;
        }

        public Criteria andSendCityEqualTo(String value) {
            addCriterion("send_city =", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotEqualTo(String value) {
            addCriterion("send_city <>", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityGreaterThan(String value) {
            addCriterion("send_city >", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityGreaterThanOrEqualTo(String value) {
            addCriterion("send_city >=", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityLessThan(String value) {
            addCriterion("send_city <", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityLessThanOrEqualTo(String value) {
            addCriterion("send_city <=", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityLike(String value) {
            addCriterion("send_city like", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotLike(String value) {
            addCriterion("send_city not like", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityIn(List<String> values) {
            addCriterion("send_city in", values, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotIn(List<String> values) {
            addCriterion("send_city not in", values, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityBetween(String value1, String value2) {
            addCriterion("send_city between", value1, value2, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotBetween(String value1, String value2) {
            addCriterion("send_city not between", value1, value2, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendAreaIsNull() {
            addCriterion("send_area is null");
            return (Criteria) this;
        }

        public Criteria andSendAreaIsNotNull() {
            addCriterion("send_area is not null");
            return (Criteria) this;
        }

        public Criteria andSendAreaEqualTo(String value) {
            addCriterion("send_area =", value, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaNotEqualTo(String value) {
            addCriterion("send_area <>", value, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaGreaterThan(String value) {
            addCriterion("send_area >", value, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaGreaterThanOrEqualTo(String value) {
            addCriterion("send_area >=", value, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaLessThan(String value) {
            addCriterion("send_area <", value, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaLessThanOrEqualTo(String value) {
            addCriterion("send_area <=", value, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaLike(String value) {
            addCriterion("send_area like", value, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaNotLike(String value) {
            addCriterion("send_area not like", value, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaIn(List<String> values) {
            addCriterion("send_area in", values, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaNotIn(List<String> values) {
            addCriterion("send_area not in", values, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaBetween(String value1, String value2) {
            addCriterion("send_area between", value1, value2, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaNotBetween(String value1, String value2) {
            addCriterion("send_area not between", value1, value2, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendDetailIsNull() {
            addCriterion("send_detail is null");
            return (Criteria) this;
        }

        public Criteria andSendDetailIsNotNull() {
            addCriterion("send_detail is not null");
            return (Criteria) this;
        }

        public Criteria andSendDetailEqualTo(String value) {
            addCriterion("send_detail =", value, "sendDetail");
            return (Criteria) this;
        }

        public Criteria andSendDetailNotEqualTo(String value) {
            addCriterion("send_detail <>", value, "sendDetail");
            return (Criteria) this;
        }

        public Criteria andSendDetailGreaterThan(String value) {
            addCriterion("send_detail >", value, "sendDetail");
            return (Criteria) this;
        }

        public Criteria andSendDetailGreaterThanOrEqualTo(String value) {
            addCriterion("send_detail >=", value, "sendDetail");
            return (Criteria) this;
        }

        public Criteria andSendDetailLessThan(String value) {
            addCriterion("send_detail <", value, "sendDetail");
            return (Criteria) this;
        }

        public Criteria andSendDetailLessThanOrEqualTo(String value) {
            addCriterion("send_detail <=", value, "sendDetail");
            return (Criteria) this;
        }

        public Criteria andSendDetailLike(String value) {
            addCriterion("send_detail like", value, "sendDetail");
            return (Criteria) this;
        }

        public Criteria andSendDetailNotLike(String value) {
            addCriterion("send_detail not like", value, "sendDetail");
            return (Criteria) this;
        }

        public Criteria andSendDetailIn(List<String> values) {
            addCriterion("send_detail in", values, "sendDetail");
            return (Criteria) this;
        }

        public Criteria andSendDetailNotIn(List<String> values) {
            addCriterion("send_detail not in", values, "sendDetail");
            return (Criteria) this;
        }

        public Criteria andSendDetailBetween(String value1, String value2) {
            addCriterion("send_detail between", value1, value2, "sendDetail");
            return (Criteria) this;
        }

        public Criteria andSendDetailNotBetween(String value1, String value2) {
            addCriterion("send_detail not between", value1, value2, "sendDetail");
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