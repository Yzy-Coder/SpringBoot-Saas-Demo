package com.yzy.saasdemo.interceptor;
/**
 * @author yuzhanyue
 * @date 2021/11/22
 */

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.yzy.saasdemo.dynamicDataSource.DynamicDataSourceContentHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yuzhanyue
 * @program Saas-demo
 * @description 动态数据源拦截器
 * @date 2021-11-22 17:58
 */
@Slf4j
public class DataBaseInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        log.info("拦截器拦截成功");
        String Tenant = request.getHeader("TENANT");

        boolean getTenant = StringUtils.isNotEmpty(Tenant);

        if (getTenant) {
            DynamicDataSourceContentHolder.setDataSourceRouterKey(Tenant);
        }

        return getTenant;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
