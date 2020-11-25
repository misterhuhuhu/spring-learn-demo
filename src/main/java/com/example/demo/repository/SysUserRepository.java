package com.example.demo.repository;

import com.example.demo.model.SysUser;
import org.springframework.data.repository.CrudRepository;

public interface SysUserRepository extends CrudRepository<SysUser,Long> {

}
