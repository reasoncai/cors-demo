package com.cai.cors.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 方式三corsconfig
 * Created by reason on 17/11/8.
 *
 */
@RestController
@RequestMapping("/corsconfig")
public class CorsConfigController {

    @RequestMapping("")
    public String test(HttpServletRequest request){
        String echo = request.getParameter("echo");
        return echo;
    }
}
