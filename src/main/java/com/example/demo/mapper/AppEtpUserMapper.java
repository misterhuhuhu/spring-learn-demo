package com.example.demo.mapper;

import com.example.demo.model.AppEtpUser;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppEtpUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AppEtpUser record);

    int insertOrUpdate(AppEtpUser record);

    int insertOrUpdateSelective(AppEtpUser record);

    int insertSelective(AppEtpUser record);

    AppEtpUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AppEtpUser record);

    int updateByPrimaryKey(AppEtpUser record);

    int updateBatch(List<AppEtpUser> list);

    int updateBatchSelective(List<AppEtpUser> list);

    int batchInsert(@Param("list") List<AppEtpUser> list);
    
    
}