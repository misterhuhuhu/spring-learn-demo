package com.example.demo;

import com.example.demo.typehandler.ExampleTypeHandler;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.example.demo.mapper"})
@SpringBootApplication
public class DemoApplication {
    
    public static void main(String[] args) {
        final SpringApplication springApplication = new SpringApplication(DemoApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    
        // System.out.println("enum="+ExampleTypeHandler.SysUserStatus.ENABLE.toEnum("禁"));
        // System.out.println("enum="+);
    }
    
}
