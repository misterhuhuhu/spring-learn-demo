package com.example.demo.model;

import java.time.LocalDateTime;

/**
    * 角色权限关联表
    */
public class SysRolePermissionVO {
    /**
    * 主键id
    */
    private Long id;

    /**
    * 角色id
    */
    private Long roleId;

    /**
    * 权限id
    */
    private Long permissionId;

    private String system;

    private Boolean halfChecked;

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
    private SysPermission sysPermission;
    /**
    * 更新时间
    */
    private LocalDateTime updateTime;
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SysRolePermissionVO{");
        sb.append("id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", permissionId=").append(permissionId);
        sb.append(", system='").append(system).append('\'');
        sb.append(", halfChecked=").append(halfChecked);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", sysPermission=").append(sysPermission);
        sb.append(", updateTime=").append(updateTime);
        sb.append('}');
        return sb.toString();
    }
    
    public SysPermission getSysPermission() {
        return sysPermission;
    }
    
    public SysRolePermissionVO setSysPermission(final SysPermission sysPermission) {
        this.sysPermission = sysPermission;
        return this;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public Boolean getHalfChecked() {
        return halfChecked;
    }

    public void setHalfChecked(Boolean halfChecked) {
        this.halfChecked = halfChecked;
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
    
}