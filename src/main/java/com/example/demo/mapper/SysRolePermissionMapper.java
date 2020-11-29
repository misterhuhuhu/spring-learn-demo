package com.example.demo.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.example.demo.model.SysRolePermission;

public interface SysRolePermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    SysRolePermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);
    
    List<SysRolePermission> selectByRoleId(@Param("roleId")Long roleId);

	
}