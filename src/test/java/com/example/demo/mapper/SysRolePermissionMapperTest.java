package com.example.demo.mapper;

import com.example.demo.model.SysRolePermissionVO;
import com.example.demo.model.SysRoleVO;
import com.example.demo.model.SysUserEnumVO;
import com.example.demo.model.SysUserRoleVO;
import com.example.demo.model.SysUserVO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SysRolePermissionMapperTest {
    
    @Resource
    SysRolePermissionMapper sysRolePermissionMapper;
    
    @Test
    void selectByPermissionId() {
        final List<SysRolePermissionVO> sysRolePermissionVOS = sysRolePermissionMapper.selectByPermissionId(null);
        System.out.println("SysRolePermissionVO size =  " + sysRolePermissionVOS.size());
    }
    
    @Resource
    SysRoleMapper sysRoleMapper;
    
    @Test
    void selectByRoleId() {
        final List<SysRoleVO> sysRoleVOS = sysRoleMapper.selectById(null);
        System.out.println("sysRoleVOS size = " + sysRoleVOS.size());
    }
    
    @Resource
    SysUserRoleMapper sysUserRoleMapper;
    
    @Test
    void selectByUserId() {
        final List<SysUserRoleVO> sysUserRoleVOS = sysUserRoleMapper.selectByUserId(null);
        
        sysUserRoleVOS.forEach(a -> System.out.println(a.getSysRoleVO()));
    }
    
    @Resource
    SysUserMapper sysUserMapper;
    
    @Test
    void selectUserById() {
        final List<SysUserVO> sysUserVOS = sysUserMapper.selectById(null);
        sysUserVOS.forEach(a ->
        
        {
            if (a.getSysUserRoleVOList().size() > 1) {
                System.out.println("sysUser = " + a);
                System.out.println("size = " + a.getSysUserRoleVOList());
            }
        });
    }
    
    @Test
    void testTypeHandler(){
        List<SysUserEnumVO> sysUserVOS = sysUserMapper.selectByAccount("admin");
        System.out.println(sysUserVOS);
    }
}