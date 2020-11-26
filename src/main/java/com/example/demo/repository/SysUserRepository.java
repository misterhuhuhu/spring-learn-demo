package com.example.demo.repository;

import com.example.demo.model.SysUser;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SysUserRepository extends PagingAndSortingRepository<SysUser,Long> {

}
