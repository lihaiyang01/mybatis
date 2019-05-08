package com.oceanli.ibatis.v1;

public class HSqlSession {
    //配置类
    private HConfiguration configuration;
    //执行器
    private HExecutor executor;

    public HSqlSession(HConfiguration configuration, HExecutor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }

    public <T> T selectOne(String statementId, Object parameter) {
        //Sql语句
        String sql = HConfiguration.sqlMappings.getString(statementId);
        return executor.query(sql ,parameter);
    }

    public <T> T getMapper(Class<T> clazz) {

        return configuration.getMapper(clazz, this);
    }
}
