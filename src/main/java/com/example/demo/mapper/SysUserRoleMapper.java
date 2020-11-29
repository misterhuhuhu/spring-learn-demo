package com.example.demo.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.example.demo.model.SysUserRole;

public interface SysUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
    
    List<SysUserRole> selectByRoleId(@Param("roleId")Long roleId);

	
}