package com.hua.shi.rmd.domain.entity.finance;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FinanceInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_finance_info.id
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_finance_info.finance_code
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    private String financeCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_finance_info.finance_name
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    private String financeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_finance_info.bid_code
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    private String bidCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_finance_info.bid_name
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    private String bidName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_finance_info.start_purchase_money
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    private BigDecimal startPurchaseMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_finance_info.expect_yield_max
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    private BigDecimal expectYieldMax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_finance_info.real_yield
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    private BigDecimal realYield;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_finance_info.value_date
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    private Date valueDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_finance_info.expire_date
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    private Date expireDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_finance_info.period
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    private String period;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_finance_info
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_finance_info.id
     *
     * @return the value of t_finance_info.id
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_finance_info.id
     *
     * @param id the value for t_finance_info.id
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_finance_info.finance_code
     *
     * @return the value of t_finance_info.finance_code
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public String getFinanceCode() {
        return financeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_finance_info.finance_code
     *
     * @param financeCode the value for t_finance_info.finance_code
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public void setFinanceCode(String financeCode) {
        this.financeCode = financeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_finance_info.finance_name
     *
     * @return the value of t_finance_info.finance_name
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public String getFinanceName() {
        return financeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_finance_info.finance_name
     *
     * @param financeName the value for t_finance_info.finance_name
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public void setFinanceName(String financeName) {
        this.financeName = financeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_finance_info.bid_code
     *
     * @return the value of t_finance_info.bid_code
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public String getBidCode() {
        return bidCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_finance_info.bid_code
     *
     * @param bidCode the value for t_finance_info.bid_code
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public void setBidCode(String bidCode) {
        this.bidCode = bidCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_finance_info.bid_name
     *
     * @return the value of t_finance_info.bid_name
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public String getBidName() {
        return bidName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_finance_info.bid_name
     *
     * @param bidName the value for t_finance_info.bid_name
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public void setBidName(String bidName) {
        this.bidName = bidName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_finance_info.start_purchase_money
     *
     * @return the value of t_finance_info.start_purchase_money
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public BigDecimal getStartPurchaseMoney() {
        return startPurchaseMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_finance_info.start_purchase_money
     *
     * @param startPurchaseMoney the value for t_finance_info.start_purchase_money
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public void setStartPurchaseMoney(BigDecimal startPurchaseMoney) {
        this.startPurchaseMoney = startPurchaseMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_finance_info.expect_yield_max
     *
     * @return the value of t_finance_info.expect_yield_max
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public BigDecimal getExpectYieldMax() {
        return expectYieldMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_finance_info.expect_yield_max
     *
     * @param expectYieldMax the value for t_finance_info.expect_yield_max
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public void setExpectYieldMax(BigDecimal expectYieldMax) {
        this.expectYieldMax = expectYieldMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_finance_info.real_yield
     *
     * @return the value of t_finance_info.real_yield
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public BigDecimal getRealYield() {
        return realYield;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_finance_info.real_yield
     *
     * @param realYield the value for t_finance_info.real_yield
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public void setRealYield(BigDecimal realYield) {
        this.realYield = realYield;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_finance_info.value_date
     *
     * @return the value of t_finance_info.value_date
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public Date getValueDate() {
        return valueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_finance_info.value_date
     *
     * @param valueDate the value for t_finance_info.value_date
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_finance_info.expire_date
     *
     * @return the value of t_finance_info.expire_date
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_finance_info.expire_date
     *
     * @param expireDate the value for t_finance_info.expire_date
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_finance_info.period
     *
     * @return the value of t_finance_info.period
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public String getPeriod() {
        return period;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_finance_info.period
     *
     * @param period the value for t_finance_info.period
     *
     * @mbg.generated Sat Nov 28 10:12:52 CST 2020
     */
    public void setPeriod(String period) {
        this.period = period;
    }
}