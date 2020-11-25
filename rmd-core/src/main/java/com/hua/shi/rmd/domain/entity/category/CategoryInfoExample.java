package com.hua.shi.rmd.domain.entity.category;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CategoryInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_category
     *
     * @mbg.generated Wed Nov 25 23:24:28 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_category
     *
     * @mbg.generated Wed Nov 25 23:24:28 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_category
     *
     * @mbg.generated Wed Nov 25 23:24:28 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Nov 25 23:24:28 CST 2020
     */
    public CategoryInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Nov 25 23:24:28 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Nov 25 23:24:28 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Nov 25 23:24:28 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Nov 25 23:24:28 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Nov 25 23:24:28 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Nov 25 23:24:28 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Nov 25 23:24:28 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Nov 25 23:24:28 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Nov 25 23:24:28 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Nov 25 23:24:28 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_category
     *
     * @mbg.generated Wed Nov 25 23:24:28 CST 2020
     */
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

        public Criteria andSysCodeIsNull() {
            addCriterion("sys_code is null");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNotNull() {
            addCriterion("sys_code is not null");
            return (Criteria) this;
        }

        public Criteria andSysCodeEqualTo(String value) {
            addCriterion("sys_code =", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotEqualTo(String value) {
            addCriterion("sys_code <>", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThan(String value) {
            addCriterion("sys_code >", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_code >=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThan(String value) {
            addCriterion("sys_code <", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThanOrEqualTo(String value) {
            addCriterion("sys_code <=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLike(String value) {
            addCriterion("sys_code like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotLike(String value) {
            addCriterion("sys_code not like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeIn(List<String> values) {
            addCriterion("sys_code in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotIn(List<String> values) {
            addCriterion("sys_code not in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeBetween(String value1, String value2) {
            addCriterion("sys_code between", value1, value2, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotBetween(String value1, String value2) {
            addCriterion("sys_code not between", value1, value2, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysNameIsNull() {
            addCriterion("sys_name is null");
            return (Criteria) this;
        }

        public Criteria andSysNameIsNotNull() {
            addCriterion("sys_name is not null");
            return (Criteria) this;
        }

        public Criteria andSysNameEqualTo(String value) {
            addCriterion("sys_name =", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotEqualTo(String value) {
            addCriterion("sys_name <>", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameGreaterThan(String value) {
            addCriterion("sys_name >", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_name >=", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLessThan(String value) {
            addCriterion("sys_name <", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLessThanOrEqualTo(String value) {
            addCriterion("sys_name <=", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLike(String value) {
            addCriterion("sys_name like", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotLike(String value) {
            addCriterion("sys_name not like", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameIn(List<String> values) {
            addCriterion("sys_name in", values, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotIn(List<String> values) {
            addCriterion("sys_name not in", values, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameBetween(String value1, String value2) {
            addCriterion("sys_name between", value1, value2, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotBetween(String value1, String value2) {
            addCriterion("sys_name not between", value1, value2, "sysName");
            return (Criteria) this;
        }

        public Criteria andBigCodeIsNull() {
            addCriterion("big_code is null");
            return (Criteria) this;
        }

        public Criteria andBigCodeIsNotNull() {
            addCriterion("big_code is not null");
            return (Criteria) this;
        }

        public Criteria andBigCodeEqualTo(String value) {
            addCriterion("big_code =", value, "bigCode");
            return (Criteria) this;
        }

        public Criteria andBigCodeNotEqualTo(String value) {
            addCriterion("big_code <>", value, "bigCode");
            return (Criteria) this;
        }

        public Criteria andBigCodeGreaterThan(String value) {
            addCriterion("big_code >", value, "bigCode");
            return (Criteria) this;
        }

        public Criteria andBigCodeGreaterThanOrEqualTo(String value) {
            addCriterion("big_code >=", value, "bigCode");
            return (Criteria) this;
        }

        public Criteria andBigCodeLessThan(String value) {
            addCriterion("big_code <", value, "bigCode");
            return (Criteria) this;
        }

        public Criteria andBigCodeLessThanOrEqualTo(String value) {
            addCriterion("big_code <=", value, "bigCode");
            return (Criteria) this;
        }

        public Criteria andBigCodeLike(String value) {
            addCriterion("big_code like", value, "bigCode");
            return (Criteria) this;
        }

        public Criteria andBigCodeNotLike(String value) {
            addCriterion("big_code not like", value, "bigCode");
            return (Criteria) this;
        }

        public Criteria andBigCodeIn(List<String> values) {
            addCriterion("big_code in", values, "bigCode");
            return (Criteria) this;
        }

        public Criteria andBigCodeNotIn(List<String> values) {
            addCriterion("big_code not in", values, "bigCode");
            return (Criteria) this;
        }

        public Criteria andBigCodeBetween(String value1, String value2) {
            addCriterion("big_code between", value1, value2, "bigCode");
            return (Criteria) this;
        }

        public Criteria andBigCodeNotBetween(String value1, String value2) {
            addCriterion("big_code not between", value1, value2, "bigCode");
            return (Criteria) this;
        }

        public Criteria andBigNameIsNull() {
            addCriterion("big_name is null");
            return (Criteria) this;
        }

        public Criteria andBigNameIsNotNull() {
            addCriterion("big_name is not null");
            return (Criteria) this;
        }

        public Criteria andBigNameEqualTo(String value) {
            addCriterion("big_name =", value, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameNotEqualTo(String value) {
            addCriterion("big_name <>", value, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameGreaterThan(String value) {
            addCriterion("big_name >", value, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameGreaterThanOrEqualTo(String value) {
            addCriterion("big_name >=", value, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameLessThan(String value) {
            addCriterion("big_name <", value, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameLessThanOrEqualTo(String value) {
            addCriterion("big_name <=", value, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameLike(String value) {
            addCriterion("big_name like", value, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameNotLike(String value) {
            addCriterion("big_name not like", value, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameIn(List<String> values) {
            addCriterion("big_name in", values, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameNotIn(List<String> values) {
            addCriterion("big_name not in", values, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameBetween(String value1, String value2) {
            addCriterion("big_name between", value1, value2, "bigName");
            return (Criteria) this;
        }

        public Criteria andBigNameNotBetween(String value1, String value2) {
            addCriterion("big_name not between", value1, value2, "bigName");
            return (Criteria) this;
        }

        public Criteria andSmallCodeIsNull() {
            addCriterion("small_code is null");
            return (Criteria) this;
        }

        public Criteria andSmallCodeIsNotNull() {
            addCriterion("small_code is not null");
            return (Criteria) this;
        }

        public Criteria andSmallCodeEqualTo(String value) {
            addCriterion("small_code =", value, "smallCode");
            return (Criteria) this;
        }

        public Criteria andSmallCodeNotEqualTo(String value) {
            addCriterion("small_code <>", value, "smallCode");
            return (Criteria) this;
        }

        public Criteria andSmallCodeGreaterThan(String value) {
            addCriterion("small_code >", value, "smallCode");
            return (Criteria) this;
        }

        public Criteria andSmallCodeGreaterThanOrEqualTo(String value) {
            addCriterion("small_code >=", value, "smallCode");
            return (Criteria) this;
        }

        public Criteria andSmallCodeLessThan(String value) {
            addCriterion("small_code <", value, "smallCode");
            return (Criteria) this;
        }

        public Criteria andSmallCodeLessThanOrEqualTo(String value) {
            addCriterion("small_code <=", value, "smallCode");
            return (Criteria) this;
        }

        public Criteria andSmallCodeLike(String value) {
            addCriterion("small_code like", value, "smallCode");
            return (Criteria) this;
        }

        public Criteria andSmallCodeNotLike(String value) {
            addCriterion("small_code not like", value, "smallCode");
            return (Criteria) this;
        }

        public Criteria andSmallCodeIn(List<String> values) {
            addCriterion("small_code in", values, "smallCode");
            return (Criteria) this;
        }

        public Criteria andSmallCodeNotIn(List<String> values) {
            addCriterion("small_code not in", values, "smallCode");
            return (Criteria) this;
        }

        public Criteria andSmallCodeBetween(String value1, String value2) {
            addCriterion("small_code between", value1, value2, "smallCode");
            return (Criteria) this;
        }

        public Criteria andSmallCodeNotBetween(String value1, String value2) {
            addCriterion("small_code not between", value1, value2, "smallCode");
            return (Criteria) this;
        }

        public Criteria andSmallNameIsNull() {
            addCriterion("small_name is null");
            return (Criteria) this;
        }

        public Criteria andSmallNameIsNotNull() {
            addCriterion("small_name is not null");
            return (Criteria) this;
        }

        public Criteria andSmallNameEqualTo(String value) {
            addCriterion("small_name =", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameNotEqualTo(String value) {
            addCriterion("small_name <>", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameGreaterThan(String value) {
            addCriterion("small_name >", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameGreaterThanOrEqualTo(String value) {
            addCriterion("small_name >=", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameLessThan(String value) {
            addCriterion("small_name <", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameLessThanOrEqualTo(String value) {
            addCriterion("small_name <=", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameLike(String value) {
            addCriterion("small_name like", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameNotLike(String value) {
            addCriterion("small_name not like", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameIn(List<String> values) {
            addCriterion("small_name in", values, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameNotIn(List<String> values) {
            addCriterion("small_name not in", values, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameBetween(String value1, String value2) {
            addCriterion("small_name between", value1, value2, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameNotBetween(String value1, String value2) {
            addCriterion("small_name not between", value1, value2, "smallName");
            return (Criteria) this;
        }

        public Criteria andBidCodeIsNull() {
            addCriterion("bid_code is null");
            return (Criteria) this;
        }

        public Criteria andBidCodeIsNotNull() {
            addCriterion("bid_code is not null");
            return (Criteria) this;
        }

        public Criteria andBidCodeEqualTo(String value) {
            addCriterion("bid_code =", value, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeNotEqualTo(String value) {
            addCriterion("bid_code <>", value, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeGreaterThan(String value) {
            addCriterion("bid_code >", value, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bid_code >=", value, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeLessThan(String value) {
            addCriterion("bid_code <", value, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeLessThanOrEqualTo(String value) {
            addCriterion("bid_code <=", value, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeLike(String value) {
            addCriterion("bid_code like", value, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeNotLike(String value) {
            addCriterion("bid_code not like", value, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeIn(List<String> values) {
            addCriterion("bid_code in", values, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeNotIn(List<String> values) {
            addCriterion("bid_code not in", values, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeBetween(String value1, String value2) {
            addCriterion("bid_code between", value1, value2, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeNotBetween(String value1, String value2) {
            addCriterion("bid_code not between", value1, value2, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidNameIsNull() {
            addCriterion("bid_name is null");
            return (Criteria) this;
        }

        public Criteria andBidNameIsNotNull() {
            addCriterion("bid_name is not null");
            return (Criteria) this;
        }

        public Criteria andBidNameEqualTo(String value) {
            addCriterion("bid_name =", value, "bidName");
            return (Criteria) this;
        }

        public Criteria andBidNameNotEqualTo(String value) {
            addCriterion("bid_name <>", value, "bidName");
            return (Criteria) this;
        }

        public Criteria andBidNameGreaterThan(String value) {
            addCriterion("bid_name >", value, "bidName");
            return (Criteria) this;
        }

        public Criteria andBidNameGreaterThanOrEqualTo(String value) {
            addCriterion("bid_name >=", value, "bidName");
            return (Criteria) this;
        }

        public Criteria andBidNameLessThan(String value) {
            addCriterion("bid_name <", value, "bidName");
            return (Criteria) this;
        }

        public Criteria andBidNameLessThanOrEqualTo(String value) {
            addCriterion("bid_name <=", value, "bidName");
            return (Criteria) this;
        }

        public Criteria andBidNameLike(String value) {
            addCriterion("bid_name like", value, "bidName");
            return (Criteria) this;
        }

        public Criteria andBidNameNotLike(String value) {
            addCriterion("bid_name not like", value, "bidName");
            return (Criteria) this;
        }

        public Criteria andBidNameIn(List<String> values) {
            addCriterion("bid_name in", values, "bidName");
            return (Criteria) this;
        }

        public Criteria andBidNameNotIn(List<String> values) {
            addCriterion("bid_name not in", values, "bidName");
            return (Criteria) this;
        }

        public Criteria andBidNameBetween(String value1, String value2) {
            addCriterion("bid_name between", value1, value2, "bidName");
            return (Criteria) this;
        }

        public Criteria andBidNameNotBetween(String value1, String value2) {
            addCriterion("bid_name not between", value1, value2, "bidName");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Integer value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Integer value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Integer value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Integer value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Integer value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Integer> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Integer> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Integer value1, Integer value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Integer value1, Integer value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_category
     *
     * @mbg.generated do_not_delete_during_merge Wed Nov 25 23:24:28 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_category
     *
     * @mbg.generated Wed Nov 25 23:24:28 CST 2020
     */
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