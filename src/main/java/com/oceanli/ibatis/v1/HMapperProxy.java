package com.oceanli.ibatis.v1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HMapperProxy implements InvocationHandler {

    private HSqlSession sqlSession;

    public HMapperProxy(HSqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String statementId = method.getDeclaringClass().getName() + "." + method.getName();
        return this.sqlSession.selectOne(statementId,args[0]);
    }
}
