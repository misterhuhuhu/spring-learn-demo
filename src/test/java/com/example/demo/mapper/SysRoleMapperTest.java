package com.example.demo.mapper;

import com.example.demo.model.SysRole;
import com.example.demo.model.SysUser;
import com.example.demo.model.SysUserDemo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback
@EnableTransactionManagement
class SysRoleMapperTest {
    @Resource
    private SysRoleMapper sysRoleMapper;
    @Resource
    private SysUserMapper sysUserMapper;
    
    @Test
    @Rollback
    void getEntireSysRole() {
        SysRole sysRole = new SysRole();
        sysRole.setId(-UUID.randomUUID().getMostSignificantBits());
        sysRole.setModifier(-UUID.randomUUID().getMostSignificantBits());
        final int insert = sysRoleMapper.insert(sysRole);
        System.out.println("insert = "+insert);
    }
    
    @Test
    void getEntirSysUser() {
        final List<SysUserDemo> entireSysUser = sysUserMapper.getEntireSysUser();
        System.out.println(entireSysUser.size());
    }
}