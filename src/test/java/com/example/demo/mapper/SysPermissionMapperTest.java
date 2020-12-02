package com.example.demo.mapper;

import com.example.demo.model.SysPermission;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SysPermissionMapperTest {
    
    @Resource
    SysPermissionMapper sysPermissionMapper;
    @Test
    void selectById() {
        final List<SysPermission> sysPermissions = sysPermissionMapper.selectById(null);
    }
}