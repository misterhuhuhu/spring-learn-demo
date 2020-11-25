package com.example.demo.mapper;

import com.example.demo.model.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SysUserMapperTest {
    
    @Resource
    SysUserMapper sysUserMapper;
    @Test
    @Transactional
    @Rollback(value = true)
    void insert() {
    
        SysUser sysUser=new SysUser();
        
        sysUser.setId(UUID.randomUUID().getMostSignificantBits());
        sysUser.setName("测试1");
        System.out.println("id="+sysUser.getId());
        sysUserMapper.insert(sysUser);
    }
}