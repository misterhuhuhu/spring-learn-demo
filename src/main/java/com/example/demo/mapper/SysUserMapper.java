package com.example.demo.mapper;

import com.example.demo.model.SysUser;
import java.util.List;

import com.example.demo.model.SysUserDemo;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);
    
    int insert(SysUser record);
    
    int insertOrUpdate(SysUser record);
    
    int insertOrUpdateSelective(SysUser record);
    
    int insertSelective(SysUser record);
    
    SysUser selectByPrimaryKey(Long id);
    
    int updateByPrimaryKeySelective(SysUser record);
    
    int updateByPrimaryKey(SysUser record);
    
    int updateBatch(List<SysUser> list);
    
    int updateBatchSelective(List<SysUser> list);
    
    int batchInsert(@Param("list") List<SysUser> list);
    
    List<SysUser> selectall();
    
    
    List<SysUserDemo> getEntireSysUser();
}