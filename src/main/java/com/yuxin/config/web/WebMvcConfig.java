package com.yuxin.config.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;


@Configuration
public class WebMvcConfig implements  WebMvcConfigurer  {

    @Resource
    private MagicInterceptor magicInterceptor;

    @Override
    public  void addInterceptors(InterceptorRegistry  registry) {
        registry.addInterceptor(magicInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/static/**","/templates/**");
    }

    @Override
    public  void addResourceHandlers(ResourceHandlerRegistry registry) {
        //需要告知系统，这是要被当成静态文件的！
        //第一个方法设置访问路径前缀，第二个方法设置资源路径
        registry.addResourceHandler("/static/**","/templates/**").addResourceLocations("classpath:/static/","classpath:/templates/**");
    }
}
