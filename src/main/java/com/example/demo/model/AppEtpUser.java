package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 企业客户表
 */
public class AppEtpUser {
    /**
     * 主键
     */
    private Long id;
    
    /**
     * 企业名称
     */
    private String name;
    
    /**
     * 社会统一信用代码
     */
    private String creditCode;
    
    /**
     * 企业类型：合资=1、独资=2、国有=3、私营=4、全民所有制=5、集体所有制=6、股份制=7、有限责任=8
     */
    private Integer etpType;
    
    /**
     * 法人
     */
    private String legalPerson;
    
    /**
     * 法人身份证
     */
    private String legalPersonNo;
    
    /**
     * 注册资本（人民币/分）
     */
    private Long registeredCapital;
    
    /**
     * 注册时间 格式yyyy-MM-dd
     */
    private String registeredTime;
    
    /**
     * 联系人
     */
    private String contacts;
    
    /**
     * 联系人电话
     */
    private String contactsPhone;
    
    /**
     * 联系人邮箱
     */
    private String contactsEmail;
    
    /**
     * 所处行业
     */
    private String industry;
    
    /**
     * 所处行业编码
     */
    private String industryCode;
    
    /**
     * 公司规模：1-20人以下，2-20至50人，3-50至99人，4-90至200人，5-200至500人，6-500至1000人，7-1000人及以上
     */
    private Integer companySize;
    
    /**
     * 经营年限：1-1年以下，2-1年，3-2年，4-3至5年，5-5年以上
     */
    private Integer operatingYears;
    
    /**
     * 公司月均薪酬（人民币/分）
     */
    private Long averageMonthSalary;
    
    /**
     * 省
     */
    private String province;
    
    /**
     * 市
     */
    private String city;
    
    /**
     * 区
     */
    private String area;
    
    /**
     * 区域代码
     */
    private String regionCode;
    
    /**
     * 公司地址
     */
    private String address;
    
    /**
     * 经营范围
     */
    private String businessScope;
    
    /**
     * 客户经理
     */
    private Long customerManager;
    
    /**
     * 上任客户经理
     */
    private Long lastCustomerManager;
    
    /**
     * 来源
     */
    private String source;
    
    /**
     * 创建人
     */
    private String creator;
    
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    
    /**
     * 修改人(id)
     */
    private String modifier;
    
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCreditCode() {
        return creditCode;
    }
    
    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }
    
    public Integer getEtpType() {
        return etpType;
    }
    
    public void setEtpType(Integer etpType) {
        this.etpType = etpType;
    }
    
    public String getLegalPerson() {
        return legalPerson;
    }
    
    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }
    
    public String getLegalPersonNo() {
        return legalPersonNo;
    }
    
    public void setLegalPersonNo(String legalPersonNo) {
        this.legalPersonNo = legalPersonNo;
    }
    
    public Long getRegisteredCapital() {
        return registeredCapital;
    }
    
    public void setRegisteredCapital(Long registeredCapital) {
        this.registeredCapital = registeredCapital;
    }
    
    public String getRegisteredTime() {
        return registeredTime;
    }
    
    public void setRegisteredTime(String registeredTime) {
        this.registeredTime = registeredTime;
    }
    
    public String getContacts() {
        return contacts;
    }
    
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }
    
    public String getContactsPhone() {
        return contactsPhone;
    }
    
    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }
    
    public String getContactsEmail() {
        return contactsEmail;
    }
    
    public void setContactsEmail(String contactsEmail) {
        this.contactsEmail = contactsEmail;
    }
    
    public String getIndustry() {
        return industry;
    }
    
    public void setIndustry(String industry) {
        this.industry = industry;
    }
    
    public String getIndustryCode() {
        return industryCode;
    }
    
    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }
    
    public Integer getCompanySize() {
        return companySize;
    }
    
    public void setCompanySize(Integer companySize) {
        this.companySize = companySize;
    }
    
    public Integer getOperatingYears() {
        return operatingYears;
    }
    
    public void setOperatingYears(Integer operatingYears) {
        this.operatingYears = operatingYears;
    }
    
    public Long getAverageMonthSalary() {
        return averageMonthSalary;
    }
    
    public void setAverageMonthSalary(Long averageMonthSalary) {
        this.averageMonthSalary = averageMonthSalary;
    }
    
    public String getProvince() {
        return province;
    }
    
    public void setProvince(String province) {
        this.province = province;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getArea() {
        return area;
    }
    
    public void setArea(String area) {
        this.area = area;
    }
    
    public String getRegionCode() {
        return regionCode;
    }
    
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getBusinessScope() {
        return businessScope;
    }
    
    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }
    
    public Long getCustomerManager() {
        return customerManager;
    }
    
    public void setCustomerManager(Long customerManager) {
        this.customerManager = customerManager;
    }
    
    public Long getLastCustomerManager() {
        return lastCustomerManager;
    }
    
    public void setLastCustomerManager(Long lastCustomerManager) {
        this.lastCustomerManager = lastCustomerManager;
    }
    
    public String getSource() {
        return source;
    }
    
    public void setSource(String source) {
        this.source = source;
    }
    
    public String getCreator() {
        return creator;
    }
    
    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public LocalDateTime getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    
    public String getModifier() {
        return modifier;
    }
    
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }
    
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }
    
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}