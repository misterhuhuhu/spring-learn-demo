package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther 胡昊宁
 * @date 2020/12/24
 */
@RestController
public class HelloController {
    @Value("${env}")
    private Integer i;
    
    @GetMapping("/hello")
    public Integer hello(){
        return i;
    }
}
