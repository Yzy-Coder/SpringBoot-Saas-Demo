package com.yzy.saasdemo.dynamicDataSource;
/**
 * @author yuzhanyue
 * @date 2021/11/22
 */

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yuzhanyue
 * @program Saas-demo
 * @description 当前数据源上下文类
 * @date 2021-11-22 17:12
 */
@Slf4j
public class DynamicDataSourceContentHolder {

    public static Set<Object> dataSourceSet = new HashSet<>();

    private static final ThreadLocal<String> HOLDER = new ThreadLocal<>();

    public static void setDataSourceRouterKey(String dataSourceRouterKey) {

        log.info("设置当前数据源为" + dataSourceRouterKey);
        HOLDER.set(dataSourceRouterKey);
    }

    public static void removeDataSourceRouterKey() {

        HOLDER.remove();
        log.info("当前数据源已移除");
    }

    public static String getDataSourceRouterKey() {

        log.info("正在获取当前数据源" + HOLDER.get());
        return HOLDER.get();
    }

    public static Boolean isExistDataSource(String dataSource) {
        return dataSourceSet.contains(dataSource);
    }

}

