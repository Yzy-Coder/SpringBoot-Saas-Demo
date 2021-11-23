package com.yzy.saasdemo.dynamicDataSource;
/**
 * @author yuzhanyue
 * @date 2021/11/22
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;

/**
 * @author yuzhanyue
 * @program Saas-demo
 * @description 动态数据源初始化
 * @date 2021-11-22 17:27
 */

@Slf4j
@Configuration
public class DynamicDataSourceInit {

    @Bean(name = "masterDataSource")
    @ConfigurationProperties(prefix = "master.datasource.druid")
    public DataSource master() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "slaveDataSource")
    @ConfigurationProperties(prefix = "slave.datasource.druid")
    public DataSource slave() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    public DynamicRoutingDataSource dynamicRoutingDataSource() {

        DynamicRoutingDataSource dynamicRoutingDataSource = new DynamicRoutingDataSource();

        log.info("设置默认数据源为" + master());
        dynamicRoutingDataSource.setDefaultTargetDataSource(master());

        HashMap<Object, Object> targetDataSources = new HashMap<>(10);

        targetDataSources.put("master", master());
        targetDataSources.put("slave", slave());

        log.info("设置动态数据源");
        dynamicRoutingDataSource.setTargetDataSources(targetDataSources);

        //必须调用这个方法才会使上一步的设置生效
        dynamicRoutingDataSource.afterPropertiesSet();

        log.info("设置动态数据源完成");
        //更新ContentHolder
        DynamicDataSourceContentHolder.dataSourceSet.addAll(targetDataSources.keySet());
        return dynamicRoutingDataSource;
    }
}
