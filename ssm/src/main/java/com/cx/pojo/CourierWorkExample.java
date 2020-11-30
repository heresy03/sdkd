package com.cx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourierWorkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourierWorkExample() {
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

        public Criteria andSendAmountIsNull() {
            addCriterion("send_amount is null");
            return (Criteria) this;
        }

        public Criteria andSendAmountIsNotNull() {
            addCriterion("send_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSendAmountEqualTo(Integer value) {
            addCriterion("send_amount =", value, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountNotEqualTo(Integer value) {
            addCriterion("send_amount <>", value, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountGreaterThan(Integer value) {
            addCriterion("send_amount >", value, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_amount >=", value, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountLessThan(Integer value) {
            addCriterion("send_amount <", value, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountLessThanOrEqualTo(Integer value) {
            addCriterion("send_amount <=", value, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountIn(List<Integer> values) {
            addCriterion("send_amount in", values, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountNotIn(List<Integer> values) {
            addCriterion("send_amount not in", values, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountBetween(Integer value1, Integer value2) {
            addCriterion("send_amount between", value1, value2, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andSendAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("send_amount not between", value1, value2, "sendAmount");
            return (Criteria) this;
        }

        public Criteria andCompleteAmountIsNull() {
            addCriterion("complete_amount is null");
            return (Criteria) this;
        }

        public Criteria andCompleteAmountIsNotNull() {
            addCriterion("complete_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteAmountEqualTo(Integer value) {
            addCriterion("complete_amount =", value, "completeAmount");
            return (Criteria) this;
        }

        public Criteria andCompleteAmountNotEqualTo(Integer value) {
            addCriterion("complete_amount <>", value, "completeAmount");
            return (Criteria) this;
        }

        public Criteria andCompleteAmountGreaterThan(Integer value) {
            addCriterion("complete_amount >", value, "completeAmount");
            return (Criteria) this;
        }

        public Criteria andCompleteAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("complete_amount >=", value, "completeAmount");
            return (Criteria) this;
        }

        public Criteria andCompleteAmountLessThan(Integer value) {
            addCriterion("complete_amount <", value, "completeAmount");
            return (Criteria) this;
        }

        public Criteria andCompleteAmountLessThanOrEqualTo(Integer value) {
            addCriterion("complete_amount <=", value, "completeAmount");
            return (Criteria) this;
        }

        public Criteria andCompleteAmountIn(List<Integer> values) {
            addCriterion("complete_amount in", values, "completeAmount");
            return (Criteria) this;
        }

        public Criteria andCompleteAmountNotIn(List<Integer> values) {
            addCriterion("complete_amount not in", values, "completeAmount");
            return (Criteria) this;
        }

        public Criteria andCompleteAmountBetween(Integer value1, Integer value2) {
            addCriterion("complete_amount between", value1, value2, "completeAmount");
            return (Criteria) this;
        }

        public Criteria andCompleteAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("complete_amount not between", value1, value2, "completeAmount");
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