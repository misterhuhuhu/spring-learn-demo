package com.example.demo.mapper;
import com.example.demo.model.SysUserRoleVO;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.example.demo.model.SysUserRole;

public interface SysUserRoleMapper {

    
    
    List<SysUserRoleVO> selectByUserId(@Param("userId")Long userId);
    
	
}