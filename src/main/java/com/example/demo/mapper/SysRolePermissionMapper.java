package com.example.demo.mapper;

import com.example.demo.model.SysRolePermission;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolePermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRolePermission record);

    int insertOrUpdate(SysRolePermission record);

    int insertOrUpdateSelective(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    SysRolePermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);

    int updateBatch(List<SysRolePermission> list);

    int updateBatchSelective(List<SysRolePermission> list);

    int batchInsert(@Param("list") List<SysRolePermission> list);
}