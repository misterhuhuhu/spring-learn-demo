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
        @Signature(type = StatementHandler.class,
                method = "query",
                args = {Statement.class, ResultHandler.class}),
        @Signature(type = StatementHandler.class, method = "update", args = {Statement.class})
        
})
@Component
public class MybatisInterceptor implements Interceptor {
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
        System.out.println("****invocation.Args--=" + invocation.getArgs());
        StatementHandler target = (StatementHandler) invocation.getTarget();
        System.out.println("****Sql = " + target.getBoundSql().getSql());
        final Object modifier = BeanUtil.getProperty(target.getParameterHandler().getParameterObject(), "modifier");
        System.out.println("****插入的对象 的 modifier = " +modifier);
        System.out.println("****MethodName  =" + invocation.getMethod().toGenericString());
        final Object proceed = invocation.proceed();
        System.out.println(" proceed = " + proceed);
        return proceed;
    }
    
    
}
