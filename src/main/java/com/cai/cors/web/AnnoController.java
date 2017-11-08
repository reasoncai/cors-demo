package com.cai.cors.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 方式二：利用注解
 * Created by reason on 17/11/8.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("")
    public String test(HttpServletRequest request){
        String echo = request.getParameter("echo");
        return echo;
    }
}
