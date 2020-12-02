package com.example.demo.mapper;
import com.example.demo.model.SysRolePermissionVO;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.example.demo.model.SysRolePermission;

public interface SysRolePermissionMapper {
    
    List<SysRolePermissionVO> selectByPermissionId(@Param("permissionId") Long permissionId);
}