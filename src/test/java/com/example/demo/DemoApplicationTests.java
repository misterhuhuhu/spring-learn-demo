package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("getLeastSignificantBits = "+UUID.randomUUID().getLeastSignificantBits());
        System.out.println("getMostSignificantBits "+UUID.randomUUID().getMostSignificantBits());
    }

    
    
}
