package com.example.demo.repository;

import com.example.demo.model.SysPermission;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface SysPermissionRepository extends PagingAndSortingRepository<SysPermission,Long> {

}
