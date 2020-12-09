package com.example.demo.config;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.UUIDGenerator;

import java.io.Serializable;
import java.util.UUID;

/**
 * @auther 胡昊宁
 * @date 2020/12/4
 */
public class MyUUIDGenerator  extends UUIDGenerator {
    @Override
    public Serializable generate(final SharedSessionContractImplementor session, final Object object) throws HibernateException {
        
        
        
        return -UUID.randomUUID().getLeastSignificantBits();
    }
}
