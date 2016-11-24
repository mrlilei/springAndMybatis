package com.bean.gsnfc;

import java.util.ArrayList;
import java.util.List;

public class GChargeTranExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GChargeTranExample() {
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

        public Criteria andTraceidIsNull() {
            addCriterion("TRACEID is null");
            return (Criteria) this;
        }

        public Criteria andTraceidIsNotNull() {
            addCriterion("TRACEID is not null");
            return (Criteria) this;
        }

        public Criteria andTraceidEqualTo(String value) {
            addCriterion("TRACEID =", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidNotEqualTo(String value) {
            addCriterion("TRACEID <>", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidGreaterThan(String value) {
            addCriterion("TRACEID >", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidGreaterThanOrEqualTo(String value) {
            addCriterion("TRACEID >=", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidLessThan(String value) {
            addCriterion("TRACEID <", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidLessThanOrEqualTo(String value) {
            addCriterion("TRACEID <=", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidLike(String value) {
            addCriterion("TRACEID like", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidNotLike(String value) {
            addCriterion("TRACEID not like", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidIn(List<String> values) {
            addCriterion("TRACEID in", values, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidNotIn(List<String> values) {
            addCriterion("TRACEID not in", values, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidBetween(String value1, String value2) {
            addCriterion("TRACEID between", value1, value2, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidNotBetween(String value1, String value2) {
            addCriterion("TRACEID not between", value1, value2, "traceid");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andSettleflagIsNull() {
            addCriterion("SETTLEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andSettleflagIsNotNull() {
            addCriterion("SETTLEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSettleflagEqualTo(Integer value) {
            addCriterion("SETTLEFLAG =", value, "settleflag");
            return (Criteria) this;
        }

        public Criteria andSettleflagNotEqualTo(Integer value) {
            addCriterion("SETTLEFLAG <>", value, "settleflag");
            return (Criteria) this;
        }

        public Criteria andSettleflagGreaterThan(Integer value) {
            addCriterion("SETTLEFLAG >", value, "settleflag");
            return (Criteria) this;
        }

        public Criteria andSettleflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("SETTLEFLAG >=", value, "settleflag");
            return (Criteria) this;
        }

        public Criteria andSettleflagLessThan(Integer value) {
            addCriterion("SETTLEFLAG <", value, "settleflag");
            return (Criteria) this;
        }

        public Criteria andSettleflagLessThanOrEqualTo(Integer value) {
            addCriterion("SETTLEFLAG <=", value, "settleflag");
            return (Criteria) this;
        }

        public Criteria andSettleflagIn(List<Integer> values) {
            addCriterion("SETTLEFLAG in", values, "settleflag");
            return (Criteria) this;
        }

        public Criteria andSettleflagNotIn(List<Integer> values) {
            addCriterion("SETTLEFLAG not in", values, "settleflag");
            return (Criteria) this;
        }

        public Criteria andSettleflagBetween(Integer value1, Integer value2) {
            addCriterion("SETTLEFLAG between", value1, value2, "settleflag");
            return (Criteria) this;
        }

        public Criteria andSettleflagNotBetween(Integer value1, Integer value2) {
            addCriterion("SETTLEFLAG not between", value1, value2, "settleflag");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Integer value) {
            addCriterion("BALANCE =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Integer value) {
            addCriterion("BALANCE <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Integer value) {
            addCriterion("BALANCE >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("BALANCE >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Integer value) {
            addCriterion("BALANCE <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("BALANCE <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Integer> values) {
            addCriterion("BALANCE in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Integer> values) {
            addCriterion("BALANCE not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Integer value1, Integer value2) {
            addCriterion("BALANCE between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("BALANCE not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andOpdtIsNull() {
            addCriterion("OPDT is null");
            return (Criteria) this;
        }

        public Criteria andOpdtIsNotNull() {
            addCriterion("OPDT is not null");
            return (Criteria) this;
        }

        public Criteria andOpdtEqualTo(String value) {
            addCriterion("OPDT =", value, "opdt");
            return (Criteria) this;
        }

        public Criteria andOpdtNotEqualTo(String value) {
            addCriterion("OPDT <>", value, "opdt");
            return (Criteria) this;
        }

        public Criteria andOpdtGreaterThan(String value) {
            addCriterion("OPDT >", value, "opdt");
            return (Criteria) this;
        }

        public Criteria andOpdtGreaterThanOrEqualTo(String value) {
            addCriterion("OPDT >=", value, "opdt");
            return (Criteria) this;
        }

        public Criteria andOpdtLessThan(String value) {
            addCriterion("OPDT <", value, "opdt");
            return (Criteria) this;
        }

        public Criteria andOpdtLessThanOrEqualTo(String value) {
            addCriterion("OPDT <=", value, "opdt");
            return (Criteria) this;
        }

        public Criteria andOpdtLike(String value) {
            addCriterion("OPDT like", value, "opdt");
            return (Criteria) this;
        }

        public Criteria andOpdtNotLike(String value) {
            addCriterion("OPDT not like", value, "opdt");
            return (Criteria) this;
        }

        public Criteria andOpdtIn(List<String> values) {
            addCriterion("OPDT in", values, "opdt");
            return (Criteria) this;
        }

        public Criteria andOpdtNotIn(List<String> values) {
            addCriterion("OPDT not in", values, "opdt");
            return (Criteria) this;
        }

        public Criteria andOpdtBetween(String value1, String value2) {
            addCriterion("OPDT between", value1, value2, "opdt");
            return (Criteria) this;
        }

        public Criteria andOpdtNotBetween(String value1, String value2) {
            addCriterion("OPDT not between", value1, value2, "opdt");
            return (Criteria) this;
        }

        public Criteria andBuscodeIsNull() {
            addCriterion("BUSCODE is null");
            return (Criteria) this;
        }

        public Criteria andBuscodeIsNotNull() {
            addCriterion("BUSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBuscodeEqualTo(String value) {
            addCriterion("BUSCODE =", value, "buscode");
            return (Criteria) this;
        }

        public Criteria andBuscodeNotEqualTo(String value) {
            addCriterion("BUSCODE <>", value, "buscode");
            return (Criteria) this;
        }

        public Criteria andBuscodeGreaterThan(String value) {
            addCriterion("BUSCODE >", value, "buscode");
            return (Criteria) this;
        }

        public Criteria andBuscodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSCODE >=", value, "buscode");
            return (Criteria) this;
        }

        public Criteria andBuscodeLessThan(String value) {
            addCriterion("BUSCODE <", value, "buscode");
            return (Criteria) this;
        }

        public Criteria andBuscodeLessThanOrEqualTo(String value) {
            addCriterion("BUSCODE <=", value, "buscode");
            return (Criteria) this;
        }

        public Criteria andBuscodeLike(String value) {
            addCriterion("BUSCODE like", value, "buscode");
            return (Criteria) this;
        }

        public Criteria andBuscodeNotLike(String value) {
            addCriterion("BUSCODE not like", value, "buscode");
            return (Criteria) this;
        }

        public Criteria andBuscodeIn(List<String> values) {
            addCriterion("BUSCODE in", values, "buscode");
            return (Criteria) this;
        }

        public Criteria andBuscodeNotIn(List<String> values) {
            addCriterion("BUSCODE not in", values, "buscode");
            return (Criteria) this;
        }

        public Criteria andBuscodeBetween(String value1, String value2) {
            addCriterion("BUSCODE between", value1, value2, "buscode");
            return (Criteria) this;
        }

        public Criteria andBuscodeNotBetween(String value1, String value2) {
            addCriterion("BUSCODE not between", value1, value2, "buscode");
            return (Criteria) this;
        }

        public Criteria andCardasnIsNull() {
            addCriterion("CARDASN is null");
            return (Criteria) this;
        }

        public Criteria andCardasnIsNotNull() {
            addCriterion("CARDASN is not null");
            return (Criteria) this;
        }

        public Criteria andCardasnEqualTo(String value) {
            addCriterion("CARDASN =", value, "cardasn");
            return (Criteria) this;
        }

        public Criteria andCardasnNotEqualTo(String value) {
            addCriterion("CARDASN <>", value, "cardasn");
            return (Criteria) this;
        }

        public Criteria andCardasnGreaterThan(String value) {
            addCriterion("CARDASN >", value, "cardasn");
            return (Criteria) this;
        }

        public Criteria andCardasnGreaterThanOrEqualTo(String value) {
            addCriterion("CARDASN >=", value, "cardasn");
            return (Criteria) this;
        }

        public Criteria andCardasnLessThan(String value) {
            addCriterion("CARDASN <", value, "cardasn");
            return (Criteria) this;
        }

        public Criteria andCardasnLessThanOrEqualTo(String value) {
            addCriterion("CARDASN <=", value, "cardasn");
            return (Criteria) this;
        }

        public Criteria andCardasnLike(String value) {
            addCriterion("CARDASN like", value, "cardasn");
            return (Criteria) this;
        }

        public Criteria andCardasnNotLike(String value) {
            addCriterion("CARDASN not like", value, "cardasn");
            return (Criteria) this;
        }

        public Criteria andCardasnIn(List<String> values) {
            addCriterion("CARDASN in", values, "cardasn");
            return (Criteria) this;
        }

        public Criteria andCardasnNotIn(List<String> values) {
            addCriterion("CARDASN not in", values, "cardasn");
            return (Criteria) this;
        }

        public Criteria andCardasnBetween(String value1, String value2) {
            addCriterion("CARDASN between", value1, value2, "cardasn");
            return (Criteria) this;
        }

        public Criteria andCardasnNotBetween(String value1, String value2) {
            addCriterion("CARDASN not between", value1, value2, "cardasn");
            return (Criteria) this;
        }

        public Criteria andMeridIsNull() {
            addCriterion("MERID is null");
            return (Criteria) this;
        }

        public Criteria andMeridIsNotNull() {
            addCriterion("MERID is not null");
            return (Criteria) this;
        }

        public Criteria andMeridEqualTo(String value) {
            addCriterion("MERID =", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridNotEqualTo(String value) {
            addCriterion("MERID <>", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridGreaterThan(String value) {
            addCriterion("MERID >", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridGreaterThanOrEqualTo(String value) {
            addCriterion("MERID >=", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridLessThan(String value) {
            addCriterion("MERID <", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridLessThanOrEqualTo(String value) {
            addCriterion("MERID <=", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridLike(String value) {
            addCriterion("MERID like", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridNotLike(String value) {
            addCriterion("MERID not like", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridIn(List<String> values) {
            addCriterion("MERID in", values, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridNotIn(List<String> values) {
            addCriterion("MERID not in", values, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridBetween(String value1, String value2) {
            addCriterion("MERID between", value1, value2, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridNotBetween(String value1, String value2) {
            addCriterion("MERID not between", value1, value2, "merid");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("CITYCODE is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("CITYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("CITYCODE =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("CITYCODE <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("CITYCODE >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITYCODE >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("CITYCODE <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("CITYCODE <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLike(String value) {
            addCriterion("CITYCODE like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotLike(String value) {
            addCriterion("CITYCODE not like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("CITYCODE in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("CITYCODE not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("CITYCODE between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("CITYCODE not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNull() {
            addCriterion("PLANID is null");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNotNull() {
            addCriterion("PLANID is not null");
            return (Criteria) this;
        }

        public Criteria andPlanidEqualTo(String value) {
            addCriterion("PLANID =", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotEqualTo(String value) {
            addCriterion("PLANID <>", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThan(String value) {
            addCriterion("PLANID >", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThanOrEqualTo(String value) {
            addCriterion("PLANID >=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThan(String value) {
            addCriterion("PLANID <", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThanOrEqualTo(String value) {
            addCriterion("PLANID <=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLike(String value) {
            addCriterion("PLANID like", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotLike(String value) {
            addCriterion("PLANID not like", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidIn(List<String> values) {
            addCriterion("PLANID in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotIn(List<String> values) {
            addCriterion("PLANID not in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidBetween(String value1, String value2) {
            addCriterion("PLANID between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotBetween(String value1, String value2) {
            addCriterion("PLANID not between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andElectrsaveopcountIsNull() {
            addCriterion("ELECTRSAVEOPCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andElectrsaveopcountIsNotNull() {
            addCriterion("ELECTRSAVEOPCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andElectrsaveopcountEqualTo(String value) {
            addCriterion("ELECTRSAVEOPCOUNT =", value, "electrsaveopcount");
            return (Criteria) this;
        }

        public Criteria andElectrsaveopcountNotEqualTo(String value) {
            addCriterion("ELECTRSAVEOPCOUNT <>", value, "electrsaveopcount");
            return (Criteria) this;
        }

        public Criteria andElectrsaveopcountGreaterThan(String value) {
            addCriterion("ELECTRSAVEOPCOUNT >", value, "electrsaveopcount");
            return (Criteria) this;
        }

        public Criteria andElectrsaveopcountGreaterThanOrEqualTo(String value) {
            addCriterion("ELECTRSAVEOPCOUNT >=", value, "electrsaveopcount");
            return (Criteria) this;
        }

        public Criteria andElectrsaveopcountLessThan(String value) {
            addCriterion("ELECTRSAVEOPCOUNT <", value, "electrsaveopcount");
            return (Criteria) this;
        }

        public Criteria andElectrsaveopcountLessThanOrEqualTo(String value) {
            addCriterion("ELECTRSAVEOPCOUNT <=", value, "electrsaveopcount");
            return (Criteria) this;
        }

        public Criteria andElectrsaveopcountLike(String value) {
            addCriterion("ELECTRSAVEOPCOUNT like", value, "electrsaveopcount");
            return (Criteria) this;
        }

        public Criteria andElectrsaveopcountNotLike(String value) {
            addCriterion("ELECTRSAVEOPCOUNT not like", value, "electrsaveopcount");
            return (Criteria) this;
        }

        public Criteria andElectrsaveopcountIn(List<String> values) {
            addCriterion("ELECTRSAVEOPCOUNT in", values, "electrsaveopcount");
            return (Criteria) this;
        }

        public Criteria andElectrsaveopcountNotIn(List<String> values) {
            addCriterion("ELECTRSAVEOPCOUNT not in", values, "electrsaveopcount");
            return (Criteria) this;
        }

        public Criteria andElectrsaveopcountBetween(String value1, String value2) {
            addCriterion("ELECTRSAVEOPCOUNT between", value1, value2, "electrsaveopcount");
            return (Criteria) this;
        }

        public Criteria andElectrsaveopcountNotBetween(String value1, String value2) {
            addCriterion("ELECTRSAVEOPCOUNT not between", value1, value2, "electrsaveopcount");
            return (Criteria) this;
        }

        public Criteria andRpidIsNull() {
            addCriterion("RPID is null");
            return (Criteria) this;
        }

        public Criteria andRpidIsNotNull() {
            addCriterion("RPID is not null");
            return (Criteria) this;
        }

        public Criteria andRpidEqualTo(String value) {
            addCriterion("RPID =", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidNotEqualTo(String value) {
            addCriterion("RPID <>", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidGreaterThan(String value) {
            addCriterion("RPID >", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidGreaterThanOrEqualTo(String value) {
            addCriterion("RPID >=", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidLessThan(String value) {
            addCriterion("RPID <", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidLessThanOrEqualTo(String value) {
            addCriterion("RPID <=", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidLike(String value) {
            addCriterion("RPID like", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidNotLike(String value) {
            addCriterion("RPID not like", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidIn(List<String> values) {
            addCriterion("RPID in", values, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidNotIn(List<String> values) {
            addCriterion("RPID not in", values, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidBetween(String value1, String value2) {
            addCriterion("RPID between", value1, value2, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidNotBetween(String value1, String value2) {
            addCriterion("RPID not between", value1, value2, "rpid");
            return (Criteria) this;
        }

        public Criteria andRetmsgIsNull() {
            addCriterion("RETMSG is null");
            return (Criteria) this;
        }

        public Criteria andRetmsgIsNotNull() {
            addCriterion("RETMSG is not null");
            return (Criteria) this;
        }

        public Criteria andRetmsgEqualTo(String value) {
            addCriterion("RETMSG =", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgNotEqualTo(String value) {
            addCriterion("RETMSG <>", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgGreaterThan(String value) {
            addCriterion("RETMSG >", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgGreaterThanOrEqualTo(String value) {
            addCriterion("RETMSG >=", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgLessThan(String value) {
            addCriterion("RETMSG <", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgLessThanOrEqualTo(String value) {
            addCriterion("RETMSG <=", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgLike(String value) {
            addCriterion("RETMSG like", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgNotLike(String value) {
            addCriterion("RETMSG not like", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgIn(List<String> values) {
            addCriterion("RETMSG in", values, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgNotIn(List<String> values) {
            addCriterion("RETMSG not in", values, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgBetween(String value1, String value2) {
            addCriterion("RETMSG between", value1, value2, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgNotBetween(String value1, String value2) {
            addCriterion("RETMSG not between", value1, value2, "retmsg");
            return (Criteria) this;
        }

        public Criteria andCardfeeIsNull() {
            addCriterion("CARDFEE is null");
            return (Criteria) this;
        }

        public Criteria andCardfeeIsNotNull() {
            addCriterion("CARDFEE is not null");
            return (Criteria) this;
        }

        public Criteria andCardfeeEqualTo(Integer value) {
            addCriterion("CARDFEE =", value, "cardfee");
            return (Criteria) this;
        }

        public Criteria andCardfeeNotEqualTo(Integer value) {
            addCriterion("CARDFEE <>", value, "cardfee");
            return (Criteria) this;
        }

        public Criteria andCardfeeGreaterThan(Integer value) {
            addCriterion("CARDFEE >", value, "cardfee");
            return (Criteria) this;
        }

        public Criteria andCardfeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CARDFEE >=", value, "cardfee");
            return (Criteria) this;
        }

        public Criteria andCardfeeLessThan(Integer value) {
            addCriterion("CARDFEE <", value, "cardfee");
            return (Criteria) this;
        }

        public Criteria andCardfeeLessThanOrEqualTo(Integer value) {
            addCriterion("CARDFEE <=", value, "cardfee");
            return (Criteria) this;
        }

        public Criteria andCardfeeIn(List<Integer> values) {
            addCriterion("CARDFEE in", values, "cardfee");
            return (Criteria) this;
        }

        public Criteria andCardfeeNotIn(List<Integer> values) {
            addCriterion("CARDFEE not in", values, "cardfee");
            return (Criteria) this;
        }

        public Criteria andCardfeeBetween(Integer value1, Integer value2) {
            addCriterion("CARDFEE between", value1, value2, "cardfee");
            return (Criteria) this;
        }

        public Criteria andCardfeeNotBetween(Integer value1, Integer value2) {
            addCriterion("CARDFEE not between", value1, value2, "cardfee");
            return (Criteria) this;
        }

        public Criteria andRechargewayIsNull() {
            addCriterion("RECHARGEWAY is null");
            return (Criteria) this;
        }

        public Criteria andRechargewayIsNotNull() {
            addCriterion("RECHARGEWAY is not null");
            return (Criteria) this;
        }

        public Criteria andRechargewayEqualTo(Integer value) {
            addCriterion("RECHARGEWAY =", value, "rechargeway");
            return (Criteria) this;
        }

        public Criteria andRechargewayNotEqualTo(Integer value) {
            addCriterion("RECHARGEWAY <>", value, "rechargeway");
            return (Criteria) this;
        }

        public Criteria andRechargewayGreaterThan(Integer value) {
            addCriterion("RECHARGEWAY >", value, "rechargeway");
            return (Criteria) this;
        }

        public Criteria andRechargewayGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECHARGEWAY >=", value, "rechargeway");
            return (Criteria) this;
        }

        public Criteria andRechargewayLessThan(Integer value) {
            addCriterion("RECHARGEWAY <", value, "rechargeway");
            return (Criteria) this;
        }

        public Criteria andRechargewayLessThanOrEqualTo(Integer value) {
            addCriterion("RECHARGEWAY <=", value, "rechargeway");
            return (Criteria) this;
        }

        public Criteria andRechargewayIn(List<Integer> values) {
            addCriterion("RECHARGEWAY in", values, "rechargeway");
            return (Criteria) this;
        }

        public Criteria andRechargewayNotIn(List<Integer> values) {
            addCriterion("RECHARGEWAY not in", values, "rechargeway");
            return (Criteria) this;
        }

        public Criteria andRechargewayBetween(Integer value1, Integer value2) {
            addCriterion("RECHARGEWAY between", value1, value2, "rechargeway");
            return (Criteria) this;
        }

        public Criteria andRechargewayNotBetween(Integer value1, Integer value2) {
            addCriterion("RECHARGEWAY not between", value1, value2, "rechargeway");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("GOODSID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("GOODSID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(String value) {
            addCriterion("GOODSID =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(String value) {
            addCriterion("GOODSID <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(String value) {
            addCriterion("GOODSID >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(String value) {
            addCriterion("GOODSID >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(String value) {
            addCriterion("GOODSID <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(String value) {
            addCriterion("GOODSID <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLike(String value) {
            addCriterion("GOODSID like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotLike(String value) {
            addCriterion("GOODSID not like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<String> values) {
            addCriterion("GOODSID in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<String> values) {
            addCriterion("GOODSID not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(String value1, String value2) {
            addCriterion("GOODSID between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(String value1, String value2) {
            addCriterion("GOODSID not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("ORDERID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("ORDERID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("ORDERID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("ORDERID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("ORDERID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("ORDERID like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("ORDERID not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("ORDERID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("ORDERID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("ORDERID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("ORDERID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNull() {
            addCriterion("ORDERDATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("ORDERDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(String value) {
            addCriterion("ORDERDATE =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(String value) {
            addCriterion("ORDERDATE <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(String value) {
            addCriterion("ORDERDATE >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERDATE >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(String value) {
            addCriterion("ORDERDATE <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(String value) {
            addCriterion("ORDERDATE <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLike(String value) {
            addCriterion("ORDERDATE like", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotLike(String value) {
            addCriterion("ORDERDATE not like", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<String> values) {
            addCriterion("ORDERDATE in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<String> values) {
            addCriterion("ORDERDATE not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(String value1, String value2) {
            addCriterion("ORDERDATE between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(String value1, String value2) {
            addCriterion("ORDERDATE not between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andTradenoIsNull() {
            addCriterion("TRADENO is null");
            return (Criteria) this;
        }

        public Criteria andTradenoIsNotNull() {
            addCriterion("TRADENO is not null");
            return (Criteria) this;
        }

        public Criteria andTradenoEqualTo(String value) {
            addCriterion("TRADENO =", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoNotEqualTo(String value) {
            addCriterion("TRADENO <>", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoGreaterThan(String value) {
            addCriterion("TRADENO >", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoGreaterThanOrEqualTo(String value) {
            addCriterion("TRADENO >=", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoLessThan(String value) {
            addCriterion("TRADENO <", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoLessThanOrEqualTo(String value) {
            addCriterion("TRADENO <=", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoLike(String value) {
            addCriterion("TRADENO like", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoNotLike(String value) {
            addCriterion("TRADENO not like", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoIn(List<String> values) {
            addCriterion("TRADENO in", values, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoNotIn(List<String> values) {
            addCriterion("TRADENO not in", values, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoBetween(String value1, String value2) {
            addCriterion("TRADENO between", value1, value2, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoNotBetween(String value1, String value2) {
            addCriterion("TRADENO not between", value1, value2, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTacIsNull() {
            addCriterion("TAC is null");
            return (Criteria) this;
        }

        public Criteria andTacIsNotNull() {
            addCriterion("TAC is not null");
            return (Criteria) this;
        }

        public Criteria andTacEqualTo(String value) {
            addCriterion("TAC =", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacNotEqualTo(String value) {
            addCriterion("TAC <>", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacGreaterThan(String value) {
            addCriterion("TAC >", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacGreaterThanOrEqualTo(String value) {
            addCriterion("TAC >=", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacLessThan(String value) {
            addCriterion("TAC <", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacLessThanOrEqualTo(String value) {
            addCriterion("TAC <=", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacLike(String value) {
            addCriterion("TAC like", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacNotLike(String value) {
            addCriterion("TAC not like", value, "tac");
            return (Criteria) this;
        }

        public Criteria andTacIn(List<String> values) {
            addCriterion("TAC in", values, "tac");
            return (Criteria) this;
        }

        public Criteria andTacNotIn(List<String> values) {
            addCriterion("TAC not in", values, "tac");
            return (Criteria) this;
        }

        public Criteria andTacBetween(String value1, String value2) {
            addCriterion("TAC between", value1, value2, "tac");
            return (Criteria) this;
        }

        public Criteria andTacNotBetween(String value1, String value2) {
            addCriterion("TAC not between", value1, value2, "tac");
            return (Criteria) this;
        }

        public Criteria andBanktraceIsNull() {
            addCriterion("BANKTRACE is null");
            return (Criteria) this;
        }

        public Criteria andBanktraceIsNotNull() {
            addCriterion("BANKTRACE is not null");
            return (Criteria) this;
        }

        public Criteria andBanktraceEqualTo(String value) {
            addCriterion("BANKTRACE =", value, "banktrace");
            return (Criteria) this;
        }

        public Criteria andBanktraceNotEqualTo(String value) {
            addCriterion("BANKTRACE <>", value, "banktrace");
            return (Criteria) this;
        }

        public Criteria andBanktraceGreaterThan(String value) {
            addCriterion("BANKTRACE >", value, "banktrace");
            return (Criteria) this;
        }

        public Criteria andBanktraceGreaterThanOrEqualTo(String value) {
            addCriterion("BANKTRACE >=", value, "banktrace");
            return (Criteria) this;
        }

        public Criteria andBanktraceLessThan(String value) {
            addCriterion("BANKTRACE <", value, "banktrace");
            return (Criteria) this;
        }

        public Criteria andBanktraceLessThanOrEqualTo(String value) {
            addCriterion("BANKTRACE <=", value, "banktrace");
            return (Criteria) this;
        }

        public Criteria andBanktraceLike(String value) {
            addCriterion("BANKTRACE like", value, "banktrace");
            return (Criteria) this;
        }

        public Criteria andBanktraceNotLike(String value) {
            addCriterion("BANKTRACE not like", value, "banktrace");
            return (Criteria) this;
        }

        public Criteria andBanktraceIn(List<String> values) {
            addCriterion("BANKTRACE in", values, "banktrace");
            return (Criteria) this;
        }

        public Criteria andBanktraceNotIn(List<String> values) {
            addCriterion("BANKTRACE not in", values, "banktrace");
            return (Criteria) this;
        }

        public Criteria andBanktraceBetween(String value1, String value2) {
            addCriterion("BANKTRACE between", value1, value2, "banktrace");
            return (Criteria) this;
        }

        public Criteria andBanktraceNotBetween(String value1, String value2) {
            addCriterion("BANKTRACE not between", value1, value2, "banktrace");
            return (Criteria) this;
        }

        public Criteria andStldateIsNull() {
            addCriterion("STLDATE is null");
            return (Criteria) this;
        }

        public Criteria andStldateIsNotNull() {
            addCriterion("STLDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStldateEqualTo(String value) {
            addCriterion("STLDATE =", value, "stldate");
            return (Criteria) this;
        }

        public Criteria andStldateNotEqualTo(String value) {
            addCriterion("STLDATE <>", value, "stldate");
            return (Criteria) this;
        }

        public Criteria andStldateGreaterThan(String value) {
            addCriterion("STLDATE >", value, "stldate");
            return (Criteria) this;
        }

        public Criteria andStldateGreaterThanOrEqualTo(String value) {
            addCriterion("STLDATE >=", value, "stldate");
            return (Criteria) this;
        }

        public Criteria andStldateLessThan(String value) {
            addCriterion("STLDATE <", value, "stldate");
            return (Criteria) this;
        }

        public Criteria andStldateLessThanOrEqualTo(String value) {
            addCriterion("STLDATE <=", value, "stldate");
            return (Criteria) this;
        }

        public Criteria andStldateLike(String value) {
            addCriterion("STLDATE like", value, "stldate");
            return (Criteria) this;
        }

        public Criteria andStldateNotLike(String value) {
            addCriterion("STLDATE not like", value, "stldate");
            return (Criteria) this;
        }

        public Criteria andStldateIn(List<String> values) {
            addCriterion("STLDATE in", values, "stldate");
            return (Criteria) this;
        }

        public Criteria andStldateNotIn(List<String> values) {
            addCriterion("STLDATE not in", values, "stldate");
            return (Criteria) this;
        }

        public Criteria andStldateBetween(String value1, String value2) {
            addCriterion("STLDATE between", value1, value2, "stldate");
            return (Criteria) this;
        }

        public Criteria andStldateNotBetween(String value1, String value2) {
            addCriterion("STLDATE not between", value1, value2, "stldate");
            return (Criteria) this;
        }

        public Criteria andTranscodeIsNull() {
            addCriterion("TRANSCODE is null");
            return (Criteria) this;
        }

        public Criteria andTranscodeIsNotNull() {
            addCriterion("TRANSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTranscodeEqualTo(String value) {
            addCriterion("TRANSCODE =", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeNotEqualTo(String value) {
            addCriterion("TRANSCODE <>", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeGreaterThan(String value) {
            addCriterion("TRANSCODE >", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSCODE >=", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeLessThan(String value) {
            addCriterion("TRANSCODE <", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeLessThanOrEqualTo(String value) {
            addCriterion("TRANSCODE <=", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeLike(String value) {
            addCriterion("TRANSCODE like", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeNotLike(String value) {
            addCriterion("TRANSCODE not like", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeIn(List<String> values) {
            addCriterion("TRANSCODE in", values, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeNotIn(List<String> values) {
            addCriterion("TRANSCODE not in", values, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeBetween(String value1, String value2) {
            addCriterion("TRANSCODE between", value1, value2, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeNotBetween(String value1, String value2) {
            addCriterion("TRANSCODE not between", value1, value2, "transcode");
            return (Criteria) this;
        }

        public Criteria andMercheckIsNull() {
            addCriterion("MERCHECK is null");
            return (Criteria) this;
        }

        public Criteria andMercheckIsNotNull() {
            addCriterion("MERCHECK is not null");
            return (Criteria) this;
        }

        public Criteria andMercheckEqualTo(Short value) {
            addCriterion("MERCHECK =", value, "mercheck");
            return (Criteria) this;
        }

        public Criteria andMercheckNotEqualTo(Short value) {
            addCriterion("MERCHECK <>", value, "mercheck");
            return (Criteria) this;
        }

        public Criteria andMercheckGreaterThan(Short value) {
            addCriterion("MERCHECK >", value, "mercheck");
            return (Criteria) this;
        }

        public Criteria andMercheckGreaterThanOrEqualTo(Short value) {
            addCriterion("MERCHECK >=", value, "mercheck");
            return (Criteria) this;
        }

        public Criteria andMercheckLessThan(Short value) {
            addCriterion("MERCHECK <", value, "mercheck");
            return (Criteria) this;
        }

        public Criteria andMercheckLessThanOrEqualTo(Short value) {
            addCriterion("MERCHECK <=", value, "mercheck");
            return (Criteria) this;
        }

        public Criteria andMercheckIn(List<Short> values) {
            addCriterion("MERCHECK in", values, "mercheck");
            return (Criteria) this;
        }

        public Criteria andMercheckNotIn(List<Short> values) {
            addCriterion("MERCHECK not in", values, "mercheck");
            return (Criteria) this;
        }

        public Criteria andMercheckBetween(Short value1, Short value2) {
            addCriterion("MERCHECK between", value1, value2, "mercheck");
            return (Criteria) this;
        }

        public Criteria andMercheckNotBetween(Short value1, Short value2) {
            addCriterion("MERCHECK not between", value1, value2, "mercheck");
            return (Criteria) this;
        }

        public Criteria andBankcheckIsNull() {
            addCriterion("BANKCHECK is null");
            return (Criteria) this;
        }

        public Criteria andBankcheckIsNotNull() {
            addCriterion("BANKCHECK is not null");
            return (Criteria) this;
        }

        public Criteria andBankcheckEqualTo(Short value) {
            addCriterion("BANKCHECK =", value, "bankcheck");
            return (Criteria) this;
        }

        public Criteria andBankcheckNotEqualTo(Short value) {
            addCriterion("BANKCHECK <>", value, "bankcheck");
            return (Criteria) this;
        }

        public Criteria andBankcheckGreaterThan(Short value) {
            addCriterion("BANKCHECK >", value, "bankcheck");
            return (Criteria) this;
        }

        public Criteria andBankcheckGreaterThanOrEqualTo(Short value) {
            addCriterion("BANKCHECK >=", value, "bankcheck");
            return (Criteria) this;
        }

        public Criteria andBankcheckLessThan(Short value) {
            addCriterion("BANKCHECK <", value, "bankcheck");
            return (Criteria) this;
        }

        public Criteria andBankcheckLessThanOrEqualTo(Short value) {
            addCriterion("BANKCHECK <=", value, "bankcheck");
            return (Criteria) this;
        }

        public Criteria andBankcheckIn(List<Short> values) {
            addCriterion("BANKCHECK in", values, "bankcheck");
            return (Criteria) this;
        }

        public Criteria andBankcheckNotIn(List<Short> values) {
            addCriterion("BANKCHECK not in", values, "bankcheck");
            return (Criteria) this;
        }

        public Criteria andBankcheckBetween(Short value1, Short value2) {
            addCriterion("BANKCHECK between", value1, value2, "bankcheck");
            return (Criteria) this;
        }

        public Criteria andBankcheckNotBetween(Short value1, Short value2) {
            addCriterion("BANKCHECK not between", value1, value2, "bankcheck");
            return (Criteria) this;
        }

        public Criteria andModtimeIsNull() {
            addCriterion("MODTIME is null");
            return (Criteria) this;
        }

        public Criteria andModtimeIsNotNull() {
            addCriterion("MODTIME is not null");
            return (Criteria) this;
        }

        public Criteria andModtimeEqualTo(String value) {
            addCriterion("MODTIME =", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotEqualTo(String value) {
            addCriterion("MODTIME <>", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeGreaterThan(String value) {
            addCriterion("MODTIME >", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeGreaterThanOrEqualTo(String value) {
            addCriterion("MODTIME >=", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeLessThan(String value) {
            addCriterion("MODTIME <", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeLessThanOrEqualTo(String value) {
            addCriterion("MODTIME <=", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeLike(String value) {
            addCriterion("MODTIME like", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotLike(String value) {
            addCriterion("MODTIME not like", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeIn(List<String> values) {
            addCriterion("MODTIME in", values, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotIn(List<String> values) {
            addCriterion("MODTIME not in", values, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeBetween(String value1, String value2) {
            addCriterion("MODTIME between", value1, value2, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotBetween(String value1, String value2) {
            addCriterion("MODTIME not between", value1, value2, "modtime");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNull() {
            addCriterion("CARDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNotNull() {
            addCriterion("CARDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCardtypeEqualTo(Integer value) {
            addCriterion("CARDTYPE =", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotEqualTo(Integer value) {
            addCriterion("CARDTYPE <>", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThan(Integer value) {
            addCriterion("CARDTYPE >", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CARDTYPE >=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThan(Integer value) {
            addCriterion("CARDTYPE <", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThanOrEqualTo(Integer value) {
            addCriterion("CARDTYPE <=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeIn(List<Integer> values) {
            addCriterion("CARDTYPE in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotIn(List<Integer> values) {
            addCriterion("CARDTYPE not in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeBetween(Integer value1, Integer value2) {
            addCriterion("CARDTYPE between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CARDTYPE not between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andBankmeridIsNull() {
            addCriterion("BANKMERID is null");
            return (Criteria) this;
        }

        public Criteria andBankmeridIsNotNull() {
            addCriterion("BANKMERID is not null");
            return (Criteria) this;
        }

        public Criteria andBankmeridEqualTo(String value) {
            addCriterion("BANKMERID =", value, "bankmerid");
            return (Criteria) this;
        }

        public Criteria andBankmeridNotEqualTo(String value) {
            addCriterion("BANKMERID <>", value, "bankmerid");
            return (Criteria) this;
        }

        public Criteria andBankmeridGreaterThan(String value) {
            addCriterion("BANKMERID >", value, "bankmerid");
            return (Criteria) this;
        }

        public Criteria andBankmeridGreaterThanOrEqualTo(String value) {
            addCriterion("BANKMERID >=", value, "bankmerid");
            return (Criteria) this;
        }

        public Criteria andBankmeridLessThan(String value) {
            addCriterion("BANKMERID <", value, "bankmerid");
            return (Criteria) this;
        }

        public Criteria andBankmeridLessThanOrEqualTo(String value) {
            addCriterion("BANKMERID <=", value, "bankmerid");
            return (Criteria) this;
        }

        public Criteria andBankmeridLike(String value) {
            addCriterion("BANKMERID like", value, "bankmerid");
            return (Criteria) this;
        }

        public Criteria andBankmeridNotLike(String value) {
            addCriterion("BANKMERID not like", value, "bankmerid");
            return (Criteria) this;
        }

        public Criteria andBankmeridIn(List<String> values) {
            addCriterion("BANKMERID in", values, "bankmerid");
            return (Criteria) this;
        }

        public Criteria andBankmeridNotIn(List<String> values) {
            addCriterion("BANKMERID not in", values, "bankmerid");
            return (Criteria) this;
        }

        public Criteria andBankmeridBetween(String value1, String value2) {
            addCriterion("BANKMERID between", value1, value2, "bankmerid");
            return (Criteria) this;
        }

        public Criteria andBankmeridNotBetween(String value1, String value2) {
            addCriterion("BANKMERID not between", value1, value2, "bankmerid");
            return (Criteria) this;
        }

        public Criteria andMbtradenumIsNull() {
            addCriterion("MBTRADENUM is null");
            return (Criteria) this;
        }

        public Criteria andMbtradenumIsNotNull() {
            addCriterion("MBTRADENUM is not null");
            return (Criteria) this;
        }

        public Criteria andMbtradenumEqualTo(String value) {
            addCriterion("MBTRADENUM =", value, "mbtradenum");
            return (Criteria) this;
        }

        public Criteria andMbtradenumNotEqualTo(String value) {
            addCriterion("MBTRADENUM <>", value, "mbtradenum");
            return (Criteria) this;
        }

        public Criteria andMbtradenumGreaterThan(String value) {
            addCriterion("MBTRADENUM >", value, "mbtradenum");
            return (Criteria) this;
        }

        public Criteria andMbtradenumGreaterThanOrEqualTo(String value) {
            addCriterion("MBTRADENUM >=", value, "mbtradenum");
            return (Criteria) this;
        }

        public Criteria andMbtradenumLessThan(String value) {
            addCriterion("MBTRADENUM <", value, "mbtradenum");
            return (Criteria) this;
        }

        public Criteria andMbtradenumLessThanOrEqualTo(String value) {
            addCriterion("MBTRADENUM <=", value, "mbtradenum");
            return (Criteria) this;
        }

        public Criteria andMbtradenumLike(String value) {
            addCriterion("MBTRADENUM like", value, "mbtradenum");
            return (Criteria) this;
        }

        public Criteria andMbtradenumNotLike(String value) {
            addCriterion("MBTRADENUM not like", value, "mbtradenum");
            return (Criteria) this;
        }

        public Criteria andMbtradenumIn(List<String> values) {
            addCriterion("MBTRADENUM in", values, "mbtradenum");
            return (Criteria) this;
        }

        public Criteria andMbtradenumNotIn(List<String> values) {
            addCriterion("MBTRADENUM not in", values, "mbtradenum");
            return (Criteria) this;
        }

        public Criteria andMbtradenumBetween(String value1, String value2) {
            addCriterion("MBTRADENUM between", value1, value2, "mbtradenum");
            return (Criteria) this;
        }

        public Criteria andMbtradenumNotBetween(String value1, String value2) {
            addCriterion("MBTRADENUM not between", value1, value2, "mbtradenum");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNull() {
            addCriterion("INTIME is null");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNotNull() {
            addCriterion("INTIME is not null");
            return (Criteria) this;
        }

        public Criteria andIntimeEqualTo(String value) {
            addCriterion("INTIME =", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotEqualTo(String value) {
            addCriterion("INTIME <>", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThan(String value) {
            addCriterion("INTIME >", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThanOrEqualTo(String value) {
            addCriterion("INTIME >=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThan(String value) {
            addCriterion("INTIME <", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThanOrEqualTo(String value) {
            addCriterion("INTIME <=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLike(String value) {
            addCriterion("INTIME like", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotLike(String value) {
            addCriterion("INTIME not like", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeIn(List<String> values) {
            addCriterion("INTIME in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotIn(List<String> values) {
            addCriterion("INTIME not in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeBetween(String value1, String value2) {
            addCriterion("INTIME between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotBetween(String value1, String value2) {
            addCriterion("INTIME not between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andMac1IsNull() {
            addCriterion("MAC1 is null");
            return (Criteria) this;
        }

        public Criteria andMac1IsNotNull() {
            addCriterion("MAC1 is not null");
            return (Criteria) this;
        }

        public Criteria andMac1EqualTo(String value) {
            addCriterion("MAC1 =", value, "mac1");
            return (Criteria) this;
        }

        public Criteria andMac1NotEqualTo(String value) {
            addCriterion("MAC1 <>", value, "mac1");
            return (Criteria) this;
        }

        public Criteria andMac1GreaterThan(String value) {
            addCriterion("MAC1 >", value, "mac1");
            return (Criteria) this;
        }

        public Criteria andMac1GreaterThanOrEqualTo(String value) {
            addCriterion("MAC1 >=", value, "mac1");
            return (Criteria) this;
        }

        public Criteria andMac1LessThan(String value) {
            addCriterion("MAC1 <", value, "mac1");
            return (Criteria) this;
        }

        public Criteria andMac1LessThanOrEqualTo(String value) {
            addCriterion("MAC1 <=", value, "mac1");
            return (Criteria) this;
        }

        public Criteria andMac1Like(String value) {
            addCriterion("MAC1 like", value, "mac1");
            return (Criteria) this;
        }

        public Criteria andMac1NotLike(String value) {
            addCriterion("MAC1 not like", value, "mac1");
            return (Criteria) this;
        }

        public Criteria andMac1In(List<String> values) {
            addCriterion("MAC1 in", values, "mac1");
            return (Criteria) this;
        }

        public Criteria andMac1NotIn(List<String> values) {
            addCriterion("MAC1 not in", values, "mac1");
            return (Criteria) this;
        }

        public Criteria andMac1Between(String value1, String value2) {
            addCriterion("MAC1 between", value1, value2, "mac1");
            return (Criteria) this;
        }

        public Criteria andMac1NotBetween(String value1, String value2) {
            addCriterion("MAC1 not between", value1, value2, "mac1");
            return (Criteria) this;
        }

        public Criteria andRandomIsNull() {
            addCriterion("RANDOM is null");
            return (Criteria) this;
        }

        public Criteria andRandomIsNotNull() {
            addCriterion("RANDOM is not null");
            return (Criteria) this;
        }

        public Criteria andRandomEqualTo(String value) {
            addCriterion("RANDOM =", value, "random");
            return (Criteria) this;
        }

        public Criteria andRandomNotEqualTo(String value) {
            addCriterion("RANDOM <>", value, "random");
            return (Criteria) this;
        }

        public Criteria andRandomGreaterThan(String value) {
            addCriterion("RANDOM >", value, "random");
            return (Criteria) this;
        }

        public Criteria andRandomGreaterThanOrEqualTo(String value) {
            addCriterion("RANDOM >=", value, "random");
            return (Criteria) this;
        }

        public Criteria andRandomLessThan(String value) {
            addCriterion("RANDOM <", value, "random");
            return (Criteria) this;
        }

        public Criteria andRandomLessThanOrEqualTo(String value) {
            addCriterion("RANDOM <=", value, "random");
            return (Criteria) this;
        }

        public Criteria andRandomLike(String value) {
            addCriterion("RANDOM like", value, "random");
            return (Criteria) this;
        }

        public Criteria andRandomNotLike(String value) {
            addCriterion("RANDOM not like", value, "random");
            return (Criteria) this;
        }

        public Criteria andRandomIn(List<String> values) {
            addCriterion("RANDOM in", values, "random");
            return (Criteria) this;
        }

        public Criteria andRandomNotIn(List<String> values) {
            addCriterion("RANDOM not in", values, "random");
            return (Criteria) this;
        }

        public Criteria andRandomBetween(String value1, String value2) {
            addCriterion("RANDOM between", value1, value2, "random");
            return (Criteria) this;
        }

        public Criteria andRandomNotBetween(String value1, String value2) {
            addCriterion("RANDOM not between", value1, value2, "random");
            return (Criteria) this;
        }

        public Criteria andKeyverIsNull() {
            addCriterion("KEYVER is null");
            return (Criteria) this;
        }

        public Criteria andKeyverIsNotNull() {
            addCriterion("KEYVER is not null");
            return (Criteria) this;
        }

        public Criteria andKeyverEqualTo(String value) {
            addCriterion("KEYVER =", value, "keyver");
            return (Criteria) this;
        }

        public Criteria andKeyverNotEqualTo(String value) {
            addCriterion("KEYVER <>", value, "keyver");
            return (Criteria) this;
        }

        public Criteria andKeyverGreaterThan(String value) {
            addCriterion("KEYVER >", value, "keyver");
            return (Criteria) this;
        }

        public Criteria andKeyverGreaterThanOrEqualTo(String value) {
            addCriterion("KEYVER >=", value, "keyver");
            return (Criteria) this;
        }

        public Criteria andKeyverLessThan(String value) {
            addCriterion("KEYVER <", value, "keyver");
            return (Criteria) this;
        }

        public Criteria andKeyverLessThanOrEqualTo(String value) {
            addCriterion("KEYVER <=", value, "keyver");
            return (Criteria) this;
        }

        public Criteria andKeyverLike(String value) {
            addCriterion("KEYVER like", value, "keyver");
            return (Criteria) this;
        }

        public Criteria andKeyverNotLike(String value) {
            addCriterion("KEYVER not like", value, "keyver");
            return (Criteria) this;
        }

        public Criteria andKeyverIn(List<String> values) {
            addCriterion("KEYVER in", values, "keyver");
            return (Criteria) this;
        }

        public Criteria andKeyverNotIn(List<String> values) {
            addCriterion("KEYVER not in", values, "keyver");
            return (Criteria) this;
        }

        public Criteria andKeyverBetween(String value1, String value2) {
            addCriterion("KEYVER between", value1, value2, "keyver");
            return (Criteria) this;
        }

        public Criteria andKeyverNotBetween(String value1, String value2) {
            addCriterion("KEYVER not between", value1, value2, "keyver");
            return (Criteria) this;
        }

        public Criteria andComputtagIsNull() {
            addCriterion("COMPUTTAG is null");
            return (Criteria) this;
        }

        public Criteria andComputtagIsNotNull() {
            addCriterion("COMPUTTAG is not null");
            return (Criteria) this;
        }

        public Criteria andComputtagEqualTo(String value) {
            addCriterion("COMPUTTAG =", value, "computtag");
            return (Criteria) this;
        }

        public Criteria andComputtagNotEqualTo(String value) {
            addCriterion("COMPUTTAG <>", value, "computtag");
            return (Criteria) this;
        }

        public Criteria andComputtagGreaterThan(String value) {
            addCriterion("COMPUTTAG >", value, "computtag");
            return (Criteria) this;
        }

        public Criteria andComputtagGreaterThanOrEqualTo(String value) {
            addCriterion("COMPUTTAG >=", value, "computtag");
            return (Criteria) this;
        }

        public Criteria andComputtagLessThan(String value) {
            addCriterion("COMPUTTAG <", value, "computtag");
            return (Criteria) this;
        }

        public Criteria andComputtagLessThanOrEqualTo(String value) {
            addCriterion("COMPUTTAG <=", value, "computtag");
            return (Criteria) this;
        }

        public Criteria andComputtagLike(String value) {
            addCriterion("COMPUTTAG like", value, "computtag");
            return (Criteria) this;
        }

        public Criteria andComputtagNotLike(String value) {
            addCriterion("COMPUTTAG not like", value, "computtag");
            return (Criteria) this;
        }

        public Criteria andComputtagIn(List<String> values) {
            addCriterion("COMPUTTAG in", values, "computtag");
            return (Criteria) this;
        }

        public Criteria andComputtagNotIn(List<String> values) {
            addCriterion("COMPUTTAG not in", values, "computtag");
            return (Criteria) this;
        }

        public Criteria andComputtagBetween(String value1, String value2) {
            addCriterion("COMPUTTAG between", value1, value2, "computtag");
            return (Criteria) this;
        }

        public Criteria andComputtagNotBetween(String value1, String value2) {
            addCriterion("COMPUTTAG not between", value1, value2, "computtag");
            return (Criteria) this;
        }

        public Criteria andRandom2IsNull() {
            addCriterion("RANDOM2 is null");
            return (Criteria) this;
        }

        public Criteria andRandom2IsNotNull() {
            addCriterion("RANDOM2 is not null");
            return (Criteria) this;
        }

        public Criteria andRandom2EqualTo(String value) {
            addCriterion("RANDOM2 =", value, "random2");
            return (Criteria) this;
        }

        public Criteria andRandom2NotEqualTo(String value) {
            addCriterion("RANDOM2 <>", value, "random2");
            return (Criteria) this;
        }

        public Criteria andRandom2GreaterThan(String value) {
            addCriterion("RANDOM2 >", value, "random2");
            return (Criteria) this;
        }

        public Criteria andRandom2GreaterThanOrEqualTo(String value) {
            addCriterion("RANDOM2 >=", value, "random2");
            return (Criteria) this;
        }

        public Criteria andRandom2LessThan(String value) {
            addCriterion("RANDOM2 <", value, "random2");
            return (Criteria) this;
        }

        public Criteria andRandom2LessThanOrEqualTo(String value) {
            addCriterion("RANDOM2 <=", value, "random2");
            return (Criteria) this;
        }

        public Criteria andRandom2Like(String value) {
            addCriterion("RANDOM2 like", value, "random2");
            return (Criteria) this;
        }

        public Criteria andRandom2NotLike(String value) {
            addCriterion("RANDOM2 not like", value, "random2");
            return (Criteria) this;
        }

        public Criteria andRandom2In(List<String> values) {
            addCriterion("RANDOM2 in", values, "random2");
            return (Criteria) this;
        }

        public Criteria andRandom2NotIn(List<String> values) {
            addCriterion("RANDOM2 not in", values, "random2");
            return (Criteria) this;
        }

        public Criteria andRandom2Between(String value1, String value2) {
            addCriterion("RANDOM2 between", value1, value2, "random2");
            return (Criteria) this;
        }

        public Criteria andRandom2NotBetween(String value1, String value2) {
            addCriterion("RANDOM2 not between", value1, value2, "random2");
            return (Criteria) this;
        }

        public Criteria andMac2IsNull() {
            addCriterion("MAC2 is null");
            return (Criteria) this;
        }

        public Criteria andMac2IsNotNull() {
            addCriterion("MAC2 is not null");
            return (Criteria) this;
        }

        public Criteria andMac2EqualTo(String value) {
            addCriterion("MAC2 =", value, "mac2");
            return (Criteria) this;
        }

        public Criteria andMac2NotEqualTo(String value) {
            addCriterion("MAC2 <>", value, "mac2");
            return (Criteria) this;
        }

        public Criteria andMac2GreaterThan(String value) {
            addCriterion("MAC2 >", value, "mac2");
            return (Criteria) this;
        }

        public Criteria andMac2GreaterThanOrEqualTo(String value) {
            addCriterion("MAC2 >=", value, "mac2");
            return (Criteria) this;
        }

        public Criteria andMac2LessThan(String value) {
            addCriterion("MAC2 <", value, "mac2");
            return (Criteria) this;
        }

        public Criteria andMac2LessThanOrEqualTo(String value) {
            addCriterion("MAC2 <=", value, "mac2");
            return (Criteria) this;
        }

        public Criteria andMac2Like(String value) {
            addCriterion("MAC2 like", value, "mac2");
            return (Criteria) this;
        }

        public Criteria andMac2NotLike(String value) {
            addCriterion("MAC2 not like", value, "mac2");
            return (Criteria) this;
        }

        public Criteria andMac2In(List<String> values) {
            addCriterion("MAC2 in", values, "mac2");
            return (Criteria) this;
        }

        public Criteria andMac2NotIn(List<String> values) {
            addCriterion("MAC2 not in", values, "mac2");
            return (Criteria) this;
        }

        public Criteria andMac2Between(String value1, String value2) {
            addCriterion("MAC2 between", value1, value2, "mac2");
            return (Criteria) this;
        }

        public Criteria andMac2NotBetween(String value1, String value2) {
            addCriterion("MAC2 not between", value1, value2, "mac2");
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