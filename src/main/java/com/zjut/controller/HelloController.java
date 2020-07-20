package com.zjut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/test")
public class HelloController {
    //代表请求映射，这里/hello代表映射这个方法，/不要忘记
    @RequestMapping(path = "/hello")
    public String helloController(){
        System.out.println("hello controller!");
        //这里的返回值，填写的是将要跳转的网页的名字，由SpringMvc框架默认规则
        return "success";
    }
}
