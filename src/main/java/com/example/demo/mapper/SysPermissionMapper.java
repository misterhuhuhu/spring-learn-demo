package com.example.demo.mapper;

import com.example.demo.model.SysPermission;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SysPermissionMapper {
    
    List<SysPermission> selectById(@Param("id") Long id);
}