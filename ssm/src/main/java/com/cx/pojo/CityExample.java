package com.cx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CityExample() {
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

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andProIdIsNull() {
            addCriterion("pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Integer value) {
            addCriterion("pro_id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("pro_id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("pro_id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("pro_id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Integer> values) {
            addCriterion("pro_id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Integer> values) {
            addCriterion("pro_id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_id not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andAddNumIsNull() {
            addCriterion("add_num is null");
            return (Criteria) this;
        }

        public Criteria andAddNumIsNotNull() {
            addCriterion("add_num is not null");
            return (Criteria) this;
        }

        public Criteria andAddNumEqualTo(Integer value) {
            addCriterion("add_num =", value, "addNum");
            return (Criteria) this;
        }

        public Criteria andAddNumNotEqualTo(Integer value) {
            addCriterion("add_num <>", value, "addNum");
            return (Criteria) this;
        }

        public Criteria andAddNumGreaterThan(Integer value) {
            addCriterion("add_num >", value, "addNum");
            return (Criteria) this;
        }

        public Criteria andAddNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_num >=", value, "addNum");
            return (Criteria) this;
        }

        public Criteria andAddNumLessThan(Integer value) {
            addCriterion("add_num <", value, "addNum");
            return (Criteria) this;
        }

        public Criteria andAddNumLessThanOrEqualTo(Integer value) {
            addCriterion("add_num <=", value, "addNum");
            return (Criteria) this;
        }

        public Criteria andAddNumIn(List<Integer> values) {
            addCriterion("add_num in", values, "addNum");
            return (Criteria) this;
        }

        public Criteria andAddNumNotIn(List<Integer> values) {
            addCriterion("add_num not in", values, "addNum");
            return (Criteria) this;
        }

        public Criteria andAddNumBetween(Integer value1, Integer value2) {
            addCriterion("add_num between", value1, value2, "addNum");
            return (Criteria) this;
        }

        public Criteria andAddNumNotBetween(Integer value1, Integer value2) {
            addCriterion("add_num not between", value1, value2, "addNum");
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