package com.example.demo.mapper;

import com.example.demo.model.SysUserRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUserRole record);

    int insertOrUpdate(SysUserRole record);

    int insertOrUpdateSelective(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);

    int updateBatch(List<SysUserRole> list);

    int updateBatchSelective(List<SysUserRole> list);

    int batchInsert(@Param("list") List<SysUserRole> list);
}