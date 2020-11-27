package com.example.demo.model;

import java.time.LocalDateTime;

/**
 * @auther 胡昊宁
 * @date 2020/11/26
 */
public class AppEtpUserDemo {
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
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AppEtpUserDemo{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", creditCode='").append(creditCode).append('\'');
        sb.append(", creator='").append(creator).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier='").append(modifier).append('\'');
        sb.append(", updateTime=").append(updateTime);
        sb.append('}');
        return sb.toString();
    }
    
    public Long getId() {
        return id;
    }
    
    public AppEtpUserDemo setId(final Long id) {
        this.id = id;
        return this;
    }
    
    public String getName() {
        return name;
    }
    
    public AppEtpUserDemo setName(final String name) {
        this.name = name;
        return this;
    }
    
    public String getCreditCode() {
        return creditCode;
    }
    
    public AppEtpUserDemo setCreditCode(final String creditCode) {
        this.creditCode = creditCode;
        return this;
    }
    
    public String getCreator() {
        return creator;
    }
    
    public AppEtpUserDemo setCreator(final String creator) {
        this.creator = creator;
        return this;
    }
    
    public LocalDateTime getCreateTime() {
        return createTime;
    }
    
    public AppEtpUserDemo setCreateTime(final LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }
    
    public String getModifier() {
        return modifier;
    }
    
    public AppEtpUserDemo setModifier(final String modifier) {
        this.modifier = modifier;
        return this;
    }
    
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }
    
    public AppEtpUserDemo setUpdateTime(final LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }
}
