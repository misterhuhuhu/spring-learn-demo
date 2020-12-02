package com.example.demo.mapper;

import com.example.demo.model.SysRole;

import java.util.List;

import com.example.demo.model.SysRoleVO;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMapper {
    
    List<SysRoleVO> selectById(@Param("id")Long id);
    
}