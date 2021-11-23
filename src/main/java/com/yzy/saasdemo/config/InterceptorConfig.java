package com.yzy.saasdemo.config;
/**
 * @author yuzhanyue
 * @date 2021/11/22
 */

import com.yzy.saasdemo.interceptor.DataBaseInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yuzhanyue
 * @program Saas-demo
 * @description 拦截器配置类
 * @date 2021-11-22 18:04
 */

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new DataBaseInterceptor()).addPathPatterns("/**");
    }
}
