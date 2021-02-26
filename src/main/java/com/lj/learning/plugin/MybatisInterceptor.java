package com.lj.learning.plugin;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

/**
 * @author Jie.LJ.Liu
 * @date 2021/2/26 10:44
 */

@Intercepts({
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
        @Signature(type = Executor.class, method = "close", args = {boolean.class})
})
public class MybatisInterceptor implements Interceptor {
    private Integer value;

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("target = " + invocation.getTarget() + ", method = " + invocation.getMethod().getName());
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        System.out.println(value);
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        this.value = Integer.valueOf((String) properties.get("value"));
    }
}
