package com.example.demo.controller;

import com.example.demo.mapper.SysUserMapper;
import com.example.demo.model.SysUser;
import com.example.demo.repository.SysUserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther 胡昊宁
 * @date 2020/11/18
 */
@RestController
public class HelloController {
    
    @Resource
    private SysUserMapper sysUserMapper;
    
    @Resource
    private SysUserRepository sysUserRepository;
    @GetMapping("/mapper")
    public Object mapper(){
        List<SysUser> sysUsers = sysUserMapper.selectAll();
        // sysUsers.forEach(System.out::println);
        return sysUsers;
    }
    
    @GetMapping("/id")
    public Object id(){
        List<SysUser> sysUsers = sysUserMapper.selectByMobileLike("1");
        // sysUsers.forEach(System.out::println);
        return sysUsers;
    }
    
    @GetMapping("/hello")
    public Object hello(){
        return 1;
    }
    
    @GetMapping("/jpa")
    public Object jpa(){
        final Iterable<SysUser> all = sysUserRepository.findAll();
        all.forEach(System.out::println);
        return all;
    }
    
    
}
