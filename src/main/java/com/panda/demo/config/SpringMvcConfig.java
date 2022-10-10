package com.panda.demo.config;

import com.zootechs.utils.interceptor.IpCounterInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 这个地方有一个问题没有搞明白：
 *    IpCounterInterceptor必须要在业务项目里添加interceptor才能真正调用到计数功能，
 *    如果只是在依赖包中添加interceptor是不能真正调用计数的(在依赖包中添加interceptor没有生效)，有点奇怪。
 *    猜测原因是类引入时的命名空间问题。
 */
@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    @Bean
    public IpCounterInterceptor ipCounterInterceptor() {
        return new IpCounterInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(ipCounterInterceptor()).addPathPatterns("/**");
    }

}
