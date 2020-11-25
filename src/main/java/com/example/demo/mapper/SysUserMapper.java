package com.example.demo.mapper;

import com.example.demo.model.SysUser;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.validation.annotation.Validated;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);
    
    int insert(SysUser record);
    
    int insertOrUpdate(SysUser record);
    
    int insertOrUpdateSelective(SysUser record);
    
    int insertSelective(SysUser record);
    
    SysUser selectByPrimaryKey(Long id);
    
    int updateByPrimaryKeySelective(SysUser record);
    
    int updateByPrimaryKey(SysUser record);
    
    int updateBatch(@Validated List<SysUser> list);
    
    int batchInsert(@Param("list") List<SysUser> list);
    
    List<SysUser> selectAll();
    
    List<SysUser> selectByMobileLike(@Param("likeMobile")String likeMobile);
    
    
	
}