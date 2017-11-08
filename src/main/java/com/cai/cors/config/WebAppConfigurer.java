package com.cai.cors.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 方式一
 * Created by reason on 17/11/8.
 */
@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/api/**")
                .allowedOrigins("*")         //可变参数，*表示所有,填协议+地址+端口
                .allowedMethods("GET","POST") //
                .allowedHeaders("*")
                .allowCredentials(false).maxAge(3600);
    }
}
