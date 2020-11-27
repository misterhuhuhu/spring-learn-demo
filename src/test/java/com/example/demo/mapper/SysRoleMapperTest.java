package com.example.demo.mapper;

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
    private SysUserMapper sysUserMapper;
    
    @Test
    void getEntireSysRole() {
        final List<SysRole> entireSysRole = sysRoleMapper.getEntireSysRole();
        entireSysRole.forEach(a -> {
            if (a.getId().equals(4562286404100440064L)) {
                System.out.println(a.getSysPermissionList());
            }
        });
    }
    
    @Test
    void getEntirSysUser() {
        final List<SysUserDemo> entireSysUser = sysUserMapper.getEntireSysUser();
        System.out.println(entireSysUser.size());
    }
}