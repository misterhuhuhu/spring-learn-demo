package com.example.demo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * 系统用户表
 */
@Entity
public final class SysUser {
    public SysUser() {
    }
    
    public SysUser(final Long id, final String account, final String password, final String name, final String mobile, final Integer gender, final Long deptId, final String job, final String jobRank, final Integer status, final Long creator, final LocalDateTime createTime, final Long modifier, final LocalDateTime updateTime, final Byte viewAuthority) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.name = name;
        this.mobile = mobile;
        this.gender = gender;
        this.deptId = deptId;
        this.job = job;
        this.jobRank = jobRank;
        this.status = status;
        this.creator = creator;
        this.createTime = createTime;
        this.modifier = modifier;
        this.updateTime = updateTime;
        this.viewAuthority = viewAuthority;
    }
    
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator  = "myIdStrategy")
    @GenericGenerator(name = "myIdStrategy", strategy = "uuid")
    private Long id;
    
    /**
     * 员工账号
     */
    private String account;
    
    /**
     * 密码
     */
    private String password;
    
    /**
     * 员工姓名
     */
    private String name;
    
    /**
     * 手机号码
     */
    private String mobile;
    
    /**
     * 性别
     */
    private Integer gender;
    
    /**
     * 所属部门
     */
    private Long deptId;
    
    /**
     * 岗位
     */
    private String job;
    
    /**
     * 职级
     */
    private String jobRank;
    
    /**
     * 状态（-1-删除，0-禁用，1-启用）
     */
    private Integer status;
    
    /**
     * 创建人（id）
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
    
    /**
     * 查看权限,1=都可以查看,2=仅自己,3=仅本部门
     */
    private Byte viewAuthority;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getAccount() {
        return account;
    }
    
    public void setAccount(String account) {
        this.account = account;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getMobile() {
        return mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    public Integer getGender() {
        return gender;
    }
    
    public void setGender(Integer gender) {
        this.gender = gender;
    }
    
    public Long getDeptId() {
        return deptId;
    }
    
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }
    
    public String getJob() {
        return job;
    }
    
    public void setJob(String job) {
        this.job = job;
    }
    
    public String getJobRank() {
        return jobRank;
    }
    
    public void setJobRank(String jobRank) {
        this.jobRank = jobRank;
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
    
    public Byte getViewAuthority() {
        return viewAuthority;
    }
    
    public void setViewAuthority(Byte viewAuthority) {
        this.viewAuthority = viewAuthority;
    }
}