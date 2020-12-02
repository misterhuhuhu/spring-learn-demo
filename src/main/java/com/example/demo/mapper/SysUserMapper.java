package com.example.demo.mapper;

import com.example.demo.model.SysUser;

import java.util.List;

import com.example.demo.model.SysUserVO;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    
    List<SysUserVO> selectById(@Param("id") Long id);
}