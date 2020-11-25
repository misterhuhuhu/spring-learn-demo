package com.example.demo.repository;

import com.example.demo.model.SysUser;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface SysUserRepository extends PagingAndSortingRepository<SysUser,Long> {

}
