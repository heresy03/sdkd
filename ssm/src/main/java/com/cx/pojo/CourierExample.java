package com.cx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourierExample() {
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

        public Criteria andCourierNumIsNull() {
            addCriterion("courier_num is null");
            return (Criteria) this;
        }

        public Criteria andCourierNumIsNotNull() {
            addCriterion("courier_num is not null");
            return (Criteria) this;
        }

        public Criteria andCourierNumEqualTo(Integer value) {
            addCriterion("courier_num =", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumNotEqualTo(Integer value) {
            addCriterion("courier_num <>", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumGreaterThan(Integer value) {
            addCriterion("courier_num >", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("courier_num >=", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumLessThan(Integer value) {
            addCriterion("courier_num <", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumLessThanOrEqualTo(Integer value) {
            addCriterion("courier_num <=", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumIn(List<Integer> values) {
            addCriterion("courier_num in", values, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumNotIn(List<Integer> values) {
            addCriterion("courier_num not in", values, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumBetween(Integer value1, Integer value2) {
            addCriterion("courier_num between", value1, value2, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumNotBetween(Integer value1, Integer value2) {
            addCriterion("courier_num not between", value1, value2, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneIsNull() {
            addCriterion("courier_phone is null");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneIsNotNull() {
            addCriterion("courier_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneEqualTo(String value) {
            addCriterion("courier_phone =", value, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneNotEqualTo(String value) {
            addCriterion("courier_phone <>", value, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneGreaterThan(String value) {
            addCriterion("courier_phone >", value, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("courier_phone >=", value, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneLessThan(String value) {
            addCriterion("courier_phone <", value, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneLessThanOrEqualTo(String value) {
            addCriterion("courier_phone <=", value, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneLike(String value) {
            addCriterion("courier_phone like", value, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneNotLike(String value) {
            addCriterion("courier_phone not like", value, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneIn(List<String> values) {
            addCriterion("courier_phone in", values, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneNotIn(List<String> values) {
            addCriterion("courier_phone not in", values, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneBetween(String value1, String value2) {
            addCriterion("courier_phone between", value1, value2, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneNotBetween(String value1, String value2) {
            addCriterion("courier_phone not between", value1, value2, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPasswordIsNull() {
            addCriterion("courier_password is null");
            return (Criteria) this;
        }

        public Criteria andCourierPasswordIsNotNull() {
            addCriterion("courier_password is not null");
            return (Criteria) this;
        }

        public Criteria andCourierPasswordEqualTo(String value) {
            addCriterion("courier_password =", value, "courierPassword");
            return (Criteria) this;
        }

        public Criteria andCourierPasswordNotEqualTo(String value) {
            addCriterion("courier_password <>", value, "courierPassword");
            return (Criteria) this;
        }

        public Criteria andCourierPasswordGreaterThan(String value) {
            addCriterion("courier_password >", value, "courierPassword");
            return (Criteria) this;
        }

        public Criteria andCourierPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("courier_password >=", value, "courierPassword");
            return (Criteria) this;
        }

        public Criteria andCourierPasswordLessThan(String value) {
            addCriterion("courier_password <", value, "courierPassword");
            return (Criteria) this;
        }

        public Criteria andCourierPasswordLessThanOrEqualTo(String value) {
            addCriterion("courier_password <=", value, "courierPassword");
            return (Criteria) this;
        }

        public Criteria andCourierPasswordLike(String value) {
            addCriterion("courier_password like", value, "courierPassword");
            return (Criteria) this;
        }

        public Criteria andCourierPasswordNotLike(String value) {
            addCriterion("courier_password not like", value, "courierPassword");
            return (Criteria) this;
        }

        public Criteria andCourierPasswordIn(List<String> values) {
            addCriterion("courier_password in", values, "courierPassword");
            return (Criteria) this;
        }

        public Criteria andCourierPasswordNotIn(List<String> values) {
            addCriterion("courier_password not in", values, "courierPassword");
            return (Criteria) this;
        }

        public Criteria andCourierPasswordBetween(String value1, String value2) {
            addCriterion("courier_password between", value1, value2, "courierPassword");
            return (Criteria) this;
        }

        public Criteria andCourierPasswordNotBetween(String value1, String value2) {
            addCriterion("courier_password not between", value1, value2, "courierPassword");
            return (Criteria) this;
        }

        public Criteria andCourierNameIsNull() {
            addCriterion("courier_name is null");
            return (Criteria) this;
        }

        public Criteria andCourierNameIsNotNull() {
            addCriterion("courier_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourierNameEqualTo(String value) {
            addCriterion("courier_name =", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameNotEqualTo(String value) {
            addCriterion("courier_name <>", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameGreaterThan(String value) {
            addCriterion("courier_name >", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameGreaterThanOrEqualTo(String value) {
            addCriterion("courier_name >=", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameLessThan(String value) {
            addCriterion("courier_name <", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameLessThanOrEqualTo(String value) {
            addCriterion("courier_name <=", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameLike(String value) {
            addCriterion("courier_name like", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameNotLike(String value) {
            addCriterion("courier_name not like", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameIn(List<String> values) {
            addCriterion("courier_name in", values, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameNotIn(List<String> values) {
            addCriterion("courier_name not in", values, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameBetween(String value1, String value2) {
            addCriterion("courier_name between", value1, value2, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameNotBetween(String value1, String value2) {
            addCriterion("courier_name not between", value1, value2, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierProvinceIsNull() {
            addCriterion("courier_province is null");
            return (Criteria) this;
        }

        public Criteria andCourierProvinceIsNotNull() {
            addCriterion("courier_province is not null");
            return (Criteria) this;
        }

        public Criteria andCourierProvinceEqualTo(String value) {
            addCriterion("courier_province =", value, "courierProvince");
            return (Criteria) this;
        }

        public Criteria andCourierProvinceNotEqualTo(String value) {
            addCriterion("courier_province <>", value, "courierProvince");
            return (Criteria) this;
        }

        public Criteria andCourierProvinceGreaterThan(String value) {
            addCriterion("courier_province >", value, "courierProvince");
            return (Criteria) this;
        }

        public Criteria andCourierProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("courier_province >=", value, "courierProvince");
            return (Criteria) this;
        }

        public Criteria andCourierProvinceLessThan(String value) {
            addCriterion("courier_province <", value, "courierProvince");
            return (Criteria) this;
        }

        public Criteria andCourierProvinceLessThanOrEqualTo(String value) {
            addCriterion("courier_province <=", value, "courierProvince");
            return (Criteria) this;
        }

        public Criteria andCourierProvinceLike(String value) {
            addCriterion("courier_province like", value, "courierProvince");
            return (Criteria) this;
        }

        public Criteria andCourierProvinceNotLike(String value) {
            addCriterion("courier_province not like", value, "courierProvince");
            return (Criteria) this;
        }

        public Criteria andCourierProvinceIn(List<String> values) {
            addCriterion("courier_province in", values, "courierProvince");
            return (Criteria) this;
        }

        public Criteria andCourierProvinceNotIn(List<String> values) {
            addCriterion("courier_province not in", values, "courierProvince");
            return (Criteria) this;
        }

        public Criteria andCourierProvinceBetween(String value1, String value2) {
            addCriterion("courier_province between", value1, value2, "courierProvince");
            return (Criteria) this;
        }

        public Criteria andCourierProvinceNotBetween(String value1, String value2) {
            addCriterion("courier_province not between", value1, value2, "courierProvince");
            return (Criteria) this;
        }

        public Criteria andCourierCityIsNull() {
            addCriterion("courier_city is null");
            return (Criteria) this;
        }

        public Criteria andCourierCityIsNotNull() {
            addCriterion("courier_city is not null");
            return (Criteria) this;
        }

        public Criteria andCourierCityEqualTo(String value) {
            addCriterion("courier_city =", value, "courierCity");
            return (Criteria) this;
        }

        public Criteria andCourierCityNotEqualTo(String value) {
            addCriterion("courier_city <>", value, "courierCity");
            return (Criteria) this;
        }

        public Criteria andCourierCityGreaterThan(String value) {
            addCriterion("courier_city >", value, "courierCity");
            return (Criteria) this;
        }

        public Criteria andCourierCityGreaterThanOrEqualTo(String value) {
            addCriterion("courier_city >=", value, "courierCity");
            return (Criteria) this;
        }

        public Criteria andCourierCityLessThan(String value) {
            addCriterion("courier_city <", value, "courierCity");
            return (Criteria) this;
        }

        public Criteria andCourierCityLessThanOrEqualTo(String value) {
            addCriterion("courier_city <=", value, "courierCity");
            return (Criteria) this;
        }

        public Criteria andCourierCityLike(String value) {
            addCriterion("courier_city like", value, "courierCity");
            return (Criteria) this;
        }

        public Criteria andCourierCityNotLike(String value) {
            addCriterion("courier_city not like", value, "courierCity");
            return (Criteria) this;
        }

        public Criteria andCourierCityIn(List<String> values) {
            addCriterion("courier_city in", values, "courierCity");
            return (Criteria) this;
        }

        public Criteria andCourierCityNotIn(List<String> values) {
            addCriterion("courier_city not in", values, "courierCity");
            return (Criteria) this;
        }

        public Criteria andCourierCityBetween(String value1, String value2) {
            addCriterion("courier_city between", value1, value2, "courierCity");
            return (Criteria) this;
        }

        public Criteria andCourierCityNotBetween(String value1, String value2) {
            addCriterion("courier_city not between", value1, value2, "courierCity");
            return (Criteria) this;
        }

        public Criteria andCourierAreaIsNull() {
            addCriterion("courier_area is null");
            return (Criteria) this;
        }

        public Criteria andCourierAreaIsNotNull() {
            addCriterion("courier_area is not null");
            return (Criteria) this;
        }

        public Criteria andCourierAreaEqualTo(String value) {
            addCriterion("courier_area =", value, "courierArea");
            return (Criteria) this;
        }

        public Criteria andCourierAreaNotEqualTo(String value) {
            addCriterion("courier_area <>", value, "courierArea");
            return (Criteria) this;
        }

        public Criteria andCourierAreaGreaterThan(String value) {
            addCriterion("courier_area >", value, "courierArea");
            return (Criteria) this;
        }

        public Criteria andCourierAreaGreaterThanOrEqualTo(String value) {
            addCriterion("courier_area >=", value, "courierArea");
            return (Criteria) this;
        }

        public Criteria andCourierAreaLessThan(String value) {
            addCriterion("courier_area <", value, "courierArea");
            return (Criteria) this;
        }

        public Criteria andCourierAreaLessThanOrEqualTo(String value) {
            addCriterion("courier_area <=", value, "courierArea");
            return (Criteria) this;
        }

        public Criteria andCourierAreaLike(String value) {
            addCriterion("courier_area like", value, "courierArea");
            return (Criteria) this;
        }

        public Criteria andCourierAreaNotLike(String value) {
            addCriterion("courier_area not like", value, "courierArea");
            return (Criteria) this;
        }

        public Criteria andCourierAreaIn(List<String> values) {
            addCriterion("courier_area in", values, "courierArea");
            return (Criteria) this;
        }

        public Criteria andCourierAreaNotIn(List<String> values) {
            addCriterion("courier_area not in", values, "courierArea");
            return (Criteria) this;
        }

        public Criteria andCourierAreaBetween(String value1, String value2) {
            addCriterion("courier_area between", value1, value2, "courierArea");
            return (Criteria) this;
        }

        public Criteria andCourierAreaNotBetween(String value1, String value2) {
            addCriterion("courier_area not between", value1, value2, "courierArea");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(Integer value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(Integer value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(Integer value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(Integer value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<Integer> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<Integer> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(Integer value1, Integer value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andRightsIsNull() {
            addCriterion("rights is null");
            return (Criteria) this;
        }

        public Criteria andRightsIsNotNull() {
            addCriterion("rights is not null");
            return (Criteria) this;
        }

        public Criteria andRightsEqualTo(Integer value) {
            addCriterion("rights =", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsNotEqualTo(Integer value) {
            addCriterion("rights <>", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsGreaterThan(Integer value) {
            addCriterion("rights >", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsGreaterThanOrEqualTo(Integer value) {
            addCriterion("rights >=", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsLessThan(Integer value) {
            addCriterion("rights <", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsLessThanOrEqualTo(Integer value) {
            addCriterion("rights <=", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsIn(List<Integer> values) {
            addCriterion("rights in", values, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsNotIn(List<Integer> values) {
            addCriterion("rights not in", values, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsBetween(Integer value1, Integer value2) {
            addCriterion("rights between", value1, value2, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsNotBetween(Integer value1, Integer value2) {
            addCriterion("rights not between", value1, value2, "rights");
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