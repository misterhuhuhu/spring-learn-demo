package com.example.demo.mapper;

import com.example.demo.model.SysPermission;
import com.example.demo.model.SysRole;
import com.example.demo.model.SysUser;
import com.example.demo.model.SysUserDemo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SysRoleMapperTest {
    @Resource
    private SysRoleMapper sysRoleMapper;
    @Resource
    private SysPermissionMapper sysPermissionMapper;
    
    @Test
    void getEntireSysRole() {
        final List<SysRole> entireSysRole = sysRoleMapper.getEntireSysRole();
        entireSysRole.forEach(a -> System.out.println("-----------SysPermissionList =" + a.getSysPermissionList().size()));
    }
    
    @Test
    void getEntirePermission() {
        final List<SysPermission> sysPermissions = sysPermissionMapper.selectAll();
        System.out.println(sysPermissions.size());
        
    }
    
}