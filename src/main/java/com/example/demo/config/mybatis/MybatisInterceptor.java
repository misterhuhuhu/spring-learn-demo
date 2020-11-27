package com.example.demo.config.mybatis;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;

import java.sql.Statement;

/**
 * @auther 胡昊宁
 * @date 2020/11/24
 */
@Intercepts({
        @Signature(type = StatementHandler.class,
                method = "query",
                args = {Statement.class,ResultHandler.class}),
        @Signature(type = StatementHandler.class,
                method = "getBoundSql",args = {})
})
public class MybatisInterceptor implements Interceptor {
    @Override
    public Object intercept(final Invocation invocation) throws Throwable {
        System.out.println("****invocation.Args--="+invocation.getArgs());
        StatementHandler target = (StatementHandler) invocation.getTarget();
        System.out.println("****Sql="+target.getBoundSql().getSql());
        System.out.println("****MethodName___="+invocation.getMethod().toGenericString());
        
        return invocation.proceed();
    }
    

}
