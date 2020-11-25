package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.propertyeditors.UUIDEditor;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        UUIDEditor uuidEditor=new UUIDEditor();
        System.out.println(UUID.randomUUID());
        System.out.println("UUIDEditor-="+uuidEditor.getAsText());
    }

    
    
}
