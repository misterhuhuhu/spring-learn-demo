package com.example.demo.mapper;

import com.example.demo.model.SysRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertOrUpdate(SysRole record);

    int insertOrUpdateSelective(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    int updateBatch(List<SysRole> list);

    int updateBatchSelective(List<SysRole> list);

    int batchInsert(@Param("list") List<SysRole> list);
}