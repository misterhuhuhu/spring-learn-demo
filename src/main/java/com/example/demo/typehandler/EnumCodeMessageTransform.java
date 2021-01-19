package com.example.demo.typehandler;

/**
 * @author huhaoning
 * @date 2021/1/19
 */
public interface EnumCodeMessageTransform<T extends Enum<T>> {
    
    
    T toEnum(Integer c) ;
    
    T toEnum(String m);
    
    
}
