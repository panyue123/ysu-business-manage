package com.ysu.pojo;

import java.util.Date;

public class PayInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ysu_payinfo.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ysu_payinfo.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ysu_payinfo.order_no
     *
     * @mbggenerated
     */
    private Long orderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ysu_payinfo.pay_platform
     *
     * @mbggenerated
     */
    private Integer payPlatform;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ysu_payinfo.platform_number
     *
     * @mbggenerated
     */
    private String platformNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ysu_payinfo.platform_status
     *
     * @mbggenerated
     */
    private String platformStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ysu_payinfo.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ysu_payinfo.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ysu_payinfo.id
     *
     * @return the value of ysu_payinfo.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ysu_payinfo.id
     *
     * @param id the value for ysu_payinfo.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ysu_payinfo.user_id
     *
     * @return the value of ysu_payinfo.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ysu_payinfo.user_id
     *
     * @param userId the value for ysu_payinfo.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ysu_payinfo.order_no
     *
     * @return the value of ysu_payinfo.order_no
     *
     * @mbggenerated
     */
    public Long getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ysu_payinfo.order_no
     *
     * @param orderNo the value for ysu_payinfo.order_no
     *
     * @mbggenerated
     */
    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ysu_payinfo.pay_platform
     *
     * @return the value of ysu_payinfo.pay_platform
     *
     * @mbggenerated
     */
    public Integer getPayPlatform() {
        return payPlatform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ysu_payinfo.pay_platform
     *
     * @param payPlatform the value for ysu_payinfo.pay_platform
     *
     * @mbggenerated
     */
    public void setPayPlatform(Integer payPlatform) {
        this.payPlatform = payPlatform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ysu_payinfo.platform_number
     *
     * @return the value of ysu_payinfo.platform_number
     *
     * @mbggenerated
     */
    public String getPlatformNumber() {
        return platformNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ysu_payinfo.platform_number
     *
     * @param platformNumber the value for ysu_payinfo.platform_number
     *
     * @mbggenerated
     */
    public void setPlatformNumber(String platformNumber) {
        this.platformNumber = platformNumber == null ? null : platformNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ysu_payinfo.platform_status
     *
     * @return the value of ysu_payinfo.platform_status
     *
     * @mbggenerated
     */
    public String getPlatformStatus() {
        return platformStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ysu_payinfo.platform_status
     *
     * @param platformStatus the value for ysu_payinfo.platform_status
     *
     * @mbggenerated
     */
    public void setPlatformStatus(String platformStatus) {
        this.platformStatus = platformStatus == null ? null : platformStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ysu_payinfo.create_time
     *
     * @return the value of ysu_payinfo.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ysu_payinfo.create_time
     *
     * @param createTime the value for ysu_payinfo.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ysu_payinfo.update_time
     *
     * @return the value of ysu_payinfo.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ysu_payinfo.update_time
     *
     * @param updateTime the value for ysu_payinfo.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}