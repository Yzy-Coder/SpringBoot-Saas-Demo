package com.yzy.saasdemo.dynamicDataSource;
/**
 * @author yuzhanyue
 * @date 2021/11/22
 */

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author yuzhanyue
 * @program Saas-demo
 * @description 动态数据源路由配置类
 * @date 2021-11-22 17:23
 */

public class DynamicRoutingDataSource extends AbstractRoutingDataSource {


    @Override
    protected Object determineCurrentLookupKey() {
        String dataSourceName = DynamicDataSourceContentHolder.getDataSourceRouterKey();
        logger.info("当前数据源为{" + dataSourceName + "}");
        return DynamicDataSourceContentHolder.getDataSourceRouterKey();
    }
}
