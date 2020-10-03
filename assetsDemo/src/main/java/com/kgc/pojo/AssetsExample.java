package com.kgc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetsExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAssetidIsNull() {
            addCriterion("assetId is null");
            return (Criteria) this;
        }

        public Criteria andAssetidIsNotNull() {
            addCriterion("assetId is not null");
            return (Criteria) this;
        }

        public Criteria andAssetidEqualTo(String value) {
            addCriterion("assetId =", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidNotEqualTo(String value) {
            addCriterion("assetId <>", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidGreaterThan(String value) {
            addCriterion("assetId >", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidGreaterThanOrEqualTo(String value) {
            addCriterion("assetId >=", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidLessThan(String value) {
            addCriterion("assetId <", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidLessThanOrEqualTo(String value) {
            addCriterion("assetId <=", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidLike(String value) {
            addCriterion("assetId like", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidNotLike(String value) {
            addCriterion("assetId not like", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidIn(List<String> values) {
            addCriterion("assetId in", values, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidNotIn(List<String> values) {
            addCriterion("assetId not in", values, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidBetween(String value1, String value2) {
            addCriterion("assetId between", value1, value2, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidNotBetween(String value1, String value2) {
            addCriterion("assetId not between", value1, value2, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetnameIsNull() {
            addCriterion("assetName is null");
            return (Criteria) this;
        }

        public Criteria andAssetnameIsNotNull() {
            addCriterion("assetName is not null");
            return (Criteria) this;
        }

        public Criteria andAssetnameEqualTo(String value) {
            addCriterion("assetName =", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotEqualTo(String value) {
            addCriterion("assetName <>", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameGreaterThan(String value) {
            addCriterion("assetName >", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameGreaterThanOrEqualTo(String value) {
            addCriterion("assetName >=", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameLessThan(String value) {
            addCriterion("assetName <", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameLessThanOrEqualTo(String value) {
            addCriterion("assetName <=", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameLike(String value) {
            addCriterion("assetName like", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotLike(String value) {
            addCriterion("assetName not like", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameIn(List<String> values) {
            addCriterion("assetName in", values, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotIn(List<String> values) {
            addCriterion("assetName not in", values, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameBetween(String value1, String value2) {
            addCriterion("assetName between", value1, value2, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotBetween(String value1, String value2) {
            addCriterion("assetName not between", value1, value2, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssettypeIsNull() {
            addCriterion("assetType is null");
            return (Criteria) this;
        }

        public Criteria andAssettypeIsNotNull() {
            addCriterion("assetType is not null");
            return (Criteria) this;
        }

        public Criteria andAssettypeEqualTo(String value) {
            addCriterion("assetType =", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotEqualTo(String value) {
            addCriterion("assetType <>", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeGreaterThan(String value) {
            addCriterion("assetType >", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeGreaterThanOrEqualTo(String value) {
            addCriterion("assetType >=", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeLessThan(String value) {
            addCriterion("assetType <", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeLessThanOrEqualTo(String value) {
            addCriterion("assetType <=", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeLike(String value) {
            addCriterion("assetType like", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotLike(String value) {
            addCriterion("assetType not like", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeIn(List<String> values) {
            addCriterion("assetType in", values, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotIn(List<String> values) {
            addCriterion("assetType not in", values, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeBetween(String value1, String value2) {
            addCriterion("assetType between", value1, value2, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotBetween(String value1, String value2) {
            addCriterion("assetType not between", value1, value2, "assettype");
            return (Criteria) this;
        }

        public Criteria andIntodateIsNull() {
            addCriterion("intoDate is null");
            return (Criteria) this;
        }

        public Criteria andIntodateIsNotNull() {
            addCriterion("intoDate is not null");
            return (Criteria) this;
        }

        public Criteria andIntodateEqualTo(Date value) {
            addCriterion("intoDate =", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateNotEqualTo(Date value) {
            addCriterion("intoDate <>", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateGreaterThan(Date value) {
            addCriterion("intoDate >", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateGreaterThanOrEqualTo(Date value) {
            addCriterion("intoDate >=", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateLessThan(Date value) {
            addCriterion("intoDate <", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateLessThanOrEqualTo(Date value) {
            addCriterion("intoDate <=", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateIn(List<Date> values) {
            addCriterion("intoDate in", values, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateNotIn(List<Date> values) {
            addCriterion("intoDate not in", values, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateBetween(Date value1, Date value2) {
            addCriterion("intoDate between", value1, value2, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateNotBetween(Date value1, Date value2) {
            addCriterion("intoDate not between", value1, value2, "intodate");
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