package com.cai.cors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 原理：
 * H5特性：返回头：Access-Control-Allow-Origin
 * 方法：1.WebMvcConfigurerAdapter/addCorsMappings
 * 2.@CrossOrigin注解
 * 3.corsConfiguration
 * 4.fitter
 *       response.setHeader("Access-Control-Allow-Origin", "*");
 response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
 response.setHeader("Access-Control-Max-Age", "3600");
 response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
 * Created by reason on 17/11/8.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
