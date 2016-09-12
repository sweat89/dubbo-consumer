package com.mt.dubbo.demo.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * System Message Event
 *
 * @Description: System Message Event
 * @ClassName: SystemMsgEvent
 * @author: caike@xiaoniu66.com
 * @version: xnol-message-1.0.0
 * @since: 1.0.0
 */
public class Dto1 {

    /**
     * 系统消息时间编码
     */
    private String eventCode;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 站内信类型
     */
    private Integer mailType;

    /**
     * 站内信接收人ID
     */
    private String receiverId;

    /**
     * 信息来源
     */
    private String eventSource;

    /**
     * 验证码
     */
    private String validateCode;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 产品名
     */
    private String productName;

    /**
     * 操作时间
     */
    // @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date operateTime;

    /**
     * 购买金额
     */
    private BigDecimal purchaseAmount;

    /**
     * 转出金额
     */
    private BigDecimal transferoutAmount;

    /**
     * 充值金额
     */
    private BigDecimal rechargeAmount;

    /**
     * 提现金额
     */
    private BigDecimal withdrawAmount;

    /**
     * 转让金额
     */
    private BigDecimal transferAmount;

    /**
     * 还款金额
     */
    private BigDecimal repaymentAmount;

    /**
     * 还款期数
     */
    private String repaymentPeriod;

    /**
     * 借款金额
     */
    private BigDecimal loanAmount;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 银行卡尾号
     */
    private String bankCardTailNO;

    /**
     * 业务类型
     */
    private String businessType;

    /**
     * 登录密码
     */
    private String loginPassword;

    /**
     * 红包金额
     */
    private BigDecimal bonusAmount;

    /**
     * 奖励金额
     */
    private BigDecimal rewardAmount;

    /**
     * 奖励数目
     */
    private Integer rewardCount;

    /**
     * 短链接
     */
    private String shortLink;

    /**
     * 过期时间
     */
    private Date expireDate;

    /**
     * 过期天数
     */
    private Integer expireDays;

    /**
     * 优惠券金额
     */
    private BigDecimal couponAmount;

    /**
     * 优惠券兑换码
     */
    private String couponCode;

    /**
     * 手续费
     */
    private BigDecimal factorage;

    /**
     * 邮件模版名称
     */
    private String emailTemplateName;

    /**
     *  购买期数
     */
    private String purchasePeriod;

    /**
     * 身份证
     */
    private String identityCard;

    /**
     * 名字
     */
    private String name;

    /**
     * 还款方式
     */
    private String repaymentMode;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 标题
     */
    private String title;

    /**
     * 备用
     */
    private String remark1;
    private String remark2;
    private String remark3;

    public Dto1() {

    }

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMailType() {
        return mailType;
    }

    public void setMailType(Integer mailType) {
        this.mailType = mailType;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getEventSource() {
        return eventSource;
    }

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public BigDecimal getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(BigDecimal purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public BigDecimal getTransferoutAmount() {
        return transferoutAmount;
    }

    public void setTransferoutAmount(BigDecimal transferoutAmount) {
        this.transferoutAmount = transferoutAmount;
    }

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public BigDecimal getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(BigDecimal withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public BigDecimal getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(BigDecimal transferAmount) {
        this.transferAmount = transferAmount;
    }

    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public String getRepaymentPeriod() {
        return repaymentPeriod;
    }

    public void setRepaymentPeriod(String repaymentPeriod) {
        this.repaymentPeriod = repaymentPeriod;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCardTailNO() {
        return bankCardTailNO;
    }

    public void setBankCardTailNO(String bankCardTailNO) {
        this.bankCardTailNO = bankCardTailNO;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public BigDecimal getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(BigDecimal bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public BigDecimal getRewardAmount() {
        return rewardAmount;
    }

    public void setRewardAmount(BigDecimal rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

    public Integer getRewardCount() {
        return rewardCount;
    }

    public void setRewardCount(Integer rewardCount) {
        this.rewardCount = rewardCount;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Integer getExpireDays() {
        return expireDays;
    }

    public void setExpireDays(Integer expireDays) {
        this.expireDays = expireDays;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public BigDecimal getFactorage() {
        return factorage;
    }

    public void setFactorage(BigDecimal factorage) {
        this.factorage = factorage;
    }

    public String getPurchasePeriod() {
        return purchasePeriod;
    }

    public void setPurchasePeriod(String purchasePeriod) {
        this.purchasePeriod = purchasePeriod;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailTemplateName() {
        return emailTemplateName;
    }

    public void setEmailTemplateName(String emailTemplateName) {
        this.emailTemplateName = emailTemplateName;
    }

    public String getRepaymentMode() {
        return repaymentMode;
    }

    public void setRepaymentMode(String repaymentMode) {
        this.repaymentMode = repaymentMode;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3;
    }

}
