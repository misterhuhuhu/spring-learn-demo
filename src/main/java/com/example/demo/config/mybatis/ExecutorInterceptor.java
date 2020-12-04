package com.example.demo.config.mybatis;

import cn.hutool.core.bean.BeanUtil;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.springframework.stereotype.Component;

import java.sql.Statement;
import java.util.Arrays;

/**
 * @auther 胡昊宁
 * @date 2020/11/24
 */
@Intercepts({
        @Signature(type = Executor.class,
                method = "update",
                args = {MappedStatement.class, Object.class})
        
})
@Component
public class ExecutorInterceptor implements Interceptor {
    @Override
    public Object intercept(final Invocation invocation) throws Throwable {
    
        System.out.println("args length =" +invocation.getArgs().length);
        Arrays.stream(invocation.getArgs()).forEach(a ->
                {
                    if (a != null) {
                        System.out.print("args = " + a.toString());
                    }
                }
        );
        return invocation.proceed();
    }
    
    
}
