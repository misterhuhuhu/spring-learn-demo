package com.example.demo.model;

import java.time.LocalDateTime;

/**
    * 系统角色信息 
    */
public class SysRole {
    /**
    * 主键
    */
    private Long id;

    /**
    * 名称
    */
    private String name;

    /**
    * 状态 0-禁用，1-启用
    */
    private Integer status;

    /**
    * 创建人
    */
    private Long creator;

    /**
    * 创建时间
    */
    private LocalDateTime createTime;

    /**
    * 修改人（id）
    */
    private Long modifier;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Long getModifier() {
        return modifier;
    }

    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", status=").append(status);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}