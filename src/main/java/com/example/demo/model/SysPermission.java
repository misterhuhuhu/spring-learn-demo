package com.example.demo.model;

import java.time.LocalDateTime;

/**
    * 权限表
    */
public class SysPermission {
    /**
    * ID
    */
    private Long id;

    /**
    * 父级权限
    */
    private Long parentId;

    /**
    * 应用系统key
    */
    private String system;

    /**
    * 权限名称
    */
    private String name;

    /**
    * 1.目录 、2.菜单、3.功能
    */
    private Integer type;

    /**
    * 排序
    */
    private Integer sort;

    /**
    * 深度
    */
    private Integer deep;

    /**
    * 菜单uri
    */
    private String menuUrl;

    /**
    * 菜单图标
    */
    private String icon;

    /**
    * http请求方式
    */
    private String httpMethod;

    /**
    * 资源名称
    */
    private String resourceName;

    /**
    * 状态（0-禁用 1-启用）
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
    * 修改人
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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getDeep() {
        return deep;
    }

    public void setDeep(Integer deep) {
        this.deep = deep;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
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
        sb.append(", parentId=").append(parentId);
        sb.append(", system=").append(system);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", sort=").append(sort);
        sb.append(", deep=").append(deep);
        sb.append(", menuUrl=").append(menuUrl);
        sb.append(", icon=").append(icon);
        sb.append(", httpMethod=").append(httpMethod);
        sb.append(", resourceName=").append(resourceName);
        sb.append(", status=").append(status);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}