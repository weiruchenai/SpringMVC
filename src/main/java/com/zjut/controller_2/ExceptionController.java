package com.zjut.controller_2;

import com.zjut.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/exceptionTest")
public class ExceptionController {

    @RequestMapping(path = "/myExceptionTest")
    public String myExceptionTest() throws Exception{
        try {
            //模拟异常
            int num = 10 / 0;
        } catch (Exception e) {
            //打印异常信息
            e.printStackTrace();
            //抛出自定义异常信息
            throw new MyException("页面发生了错误...");
        }
        return "error";
    }
}
