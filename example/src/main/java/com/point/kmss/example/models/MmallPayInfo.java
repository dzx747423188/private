package com.point.kmss.example.models;

import java.io.Serializable;
import java.util.Date;

public class MmallPayInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_pay_info.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_pay_info.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_pay_info.order_no
     *
     * @mbg.generated
     */
    private Long orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_pay_info.pay_platform
     *
     * @mbg.generated
     */
    private Integer payPlatform;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_pay_info.platform_number
     *
     * @mbg.generated
     */
    private String platformNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_pay_info.platform_status
     *
     * @mbg.generated
     */
    private String platformStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_pay_info.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_pay_info.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mmall_pay_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_pay_info.id
     *
     * @return the value of mmall_pay_info.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_pay_info.id
     *
     * @param id the value for mmall_pay_info.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_pay_info.user_id
     *
     * @return the value of mmall_pay_info.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_pay_info.user_id
     *
     * @param userId the value for mmall_pay_info.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_pay_info.order_no
     *
     * @return the value of mmall_pay_info.order_no
     *
     * @mbg.generated
     */
    public Long getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_pay_info.order_no
     *
     * @param orderNo the value for mmall_pay_info.order_no
     *
     * @mbg.generated
     */
    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_pay_info.pay_platform
     *
     * @return the value of mmall_pay_info.pay_platform
     *
     * @mbg.generated
     */
    public Integer getPayPlatform() {
        return payPlatform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_pay_info.pay_platform
     *
     * @param payPlatform the value for mmall_pay_info.pay_platform
     *
     * @mbg.generated
     */
    public void setPayPlatform(Integer payPlatform) {
        this.payPlatform = payPlatform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_pay_info.platform_number
     *
     * @return the value of mmall_pay_info.platform_number
     *
     * @mbg.generated
     */
    public String getPlatformNumber() {
        return platformNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_pay_info.platform_number
     *
     * @param platformNumber the value for mmall_pay_info.platform_number
     *
     * @mbg.generated
     */
    public void setPlatformNumber(String platformNumber) {
        this.platformNumber = platformNumber == null ? null : platformNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_pay_info.platform_status
     *
     * @return the value of mmall_pay_info.platform_status
     *
     * @mbg.generated
     */
    public String getPlatformStatus() {
        return platformStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_pay_info.platform_status
     *
     * @param platformStatus the value for mmall_pay_info.platform_status
     *
     * @mbg.generated
     */
    public void setPlatformStatus(String platformStatus) {
        this.platformStatus = platformStatus == null ? null : platformStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_pay_info.create_time
     *
     * @return the value of mmall_pay_info.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_pay_info.create_time
     *
     * @param createTime the value for mmall_pay_info.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_pay_info.update_time
     *
     * @return the value of mmall_pay_info.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_pay_info.update_time
     *
     * @param updateTime the value for mmall_pay_info.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_pay_info
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", payPlatform=").append(payPlatform);
        sb.append(", platformNumber=").append(platformNumber);
        sb.append(", platformStatus=").append(platformStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}