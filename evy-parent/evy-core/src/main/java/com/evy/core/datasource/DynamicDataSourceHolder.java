package com.evy.core.datasource;

/**
 * @author Jonny
 * @Description:
 *  持有当前上下文数据源
 * @date 2018/8/16下午8:05
 */
public class DynamicDataSourceHolder {

    public static final ThreadLocal<DataSource> dataSourceHolder = new ThreadLocal<>();

    public static void setDataSource(DataSource dataSource){
        dataSourceHolder.set(dataSource);
    }

    public static DataSource getDataSource(){
        return dataSourceHolder.get();
    }

    public static void clear(){
        dataSourceHolder.remove();
    }
}
