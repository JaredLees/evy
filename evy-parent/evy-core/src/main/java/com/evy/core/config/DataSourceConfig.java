package com.evy.core.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.evy.core.datasource.SwitchedRoutingDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jonny
 * @Description:
 * @date 2018/8/17上午10:31
 */
@Slf4j
@Configuration
public class DataSourceConfig {

    /**
     * @Primary 配置该数据源为主数据源, 默认加载的bean
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.master")
    public DataSource masterDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.slave")
    public DataSource slaveDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 动态数据源: 通过AOP在不同数据源之间动态切换
     *
     * @DependsOn({ "masterDataSource", "slaveDataSource"})
     * 解决循环依赖问题，见 https://blog.csdn.net/kkgbn/article/details/79054809
     * @Primary
     * @return
     */
    @Primary
    @Bean("dataSource")
    @DependsOn({ "masterDataSource", "slaveDataSource"})
    public SwitchedRoutingDataSource dataSource() {
        Map<Object, Object> targetDataSources = new HashMap<>(2);
        targetDataSources.put(com.evy.core.datasource.DataSource.MASTER, masterDataSource());
        targetDataSources.put(com.evy.core.datasource.DataSource.SLAVE, slaveDataSource());

        SwitchedRoutingDataSource dataSource = new SwitchedRoutingDataSource();
        dataSource.setDefaultTargetDataSource(masterDataSource());
        dataSource.setTargetDataSources(targetDataSources);
        return dataSource;
    }
}
