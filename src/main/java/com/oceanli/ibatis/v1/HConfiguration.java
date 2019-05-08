package com.oceanli.ibatis.v1;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;

public class HConfiguration {

    public final static ResourceBundle sqlMappings;

    static {
        sqlMappings = ResourceBundle.getBundle("mapper");
    }

    /**
     * 返回接口的代理类对象
     * @param clazz
     * @param hSqlSession
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class<T> clazz, HSqlSession hSqlSession) {

        return (T)Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{clazz}, new HMapperProxy(hSqlSession));
    }
}
