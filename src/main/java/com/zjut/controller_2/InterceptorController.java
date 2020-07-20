package com.zjut.controller_2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/interceptor")
public class InterceptorController {

    @RequestMapping(path = "/testInterceptor")
    public String testInterceptor(){
        System.out.println("拦截器控制器执行了...");
        return "success";
    }
}
