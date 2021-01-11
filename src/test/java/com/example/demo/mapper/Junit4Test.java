package com.example.demo.mapper;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.StringTokenizer;

import static java.lang.System.out;
@RunWith(SpringRunner.class)
class Junit4Test {
    
   
    @Test
    void selectById() {
    
        String s="All\nck-customer-h5\nck-customer-institution" +
                "\nck-customer-manage\nck-market-h5\nck-market-manage\nresource";
    
        String [] _module={"All","ck-customer-h5","ck-customer-institution","ck-customer-manage","ck-market-h5","ck-market-manage","resource"};
        final String[] split = s.split("\n");
        out.println("s.length()="+s.length());
        out.println("split.length()="+split.length);
        out.println("_module ="+_module.toString());
        
    }
    
    @Test
    void testStringToken(){
        String str= "runoob,google,taobao,facebook zhihu";
        StringTokenizer st=new StringTokenizer(str,",; ");
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
    
}
