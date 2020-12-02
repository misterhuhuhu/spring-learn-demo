package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.List;

/**
    * 员工角色关联表
    */
public class SysUserRoleVO {
    /**
    * 主键id
    */
    private Integer id;

    /**
    * 员工id
    */
    private Long userId;

    /**
    * 角色id
    */
    private Long roleId;

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

    private SysRoleVO sysRoleVO;
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SysUserRoleVO{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", sysRoleVO=").append(sysRoleVO);
        sb.append('}');
        return sb.toString();
    }
    
    public SysRoleVO getSysRoleVO() {
        return sysRoleVO;
    }
    
    public SysUserRoleVO setSysRoleVO(final SysRoleVO sysRoleVO) {
        this.sysRoleVO = sysRoleVO;
        return this;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
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