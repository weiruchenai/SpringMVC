package com.zjut.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MyExceptionHandler implements HandlerExceptionResolver {

    /**
    * @Description: 处理异常业务逻辑
    * @Param: [httpServletRequest, httpServletResponse, o, e]
    * @return: org.springframework.web.servlet.ModelAndView
    */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        //获取异常对象
        MyException myException;
        if(e instanceof MyException){
            myException = (MyException) e;
        }else {
            e = new MyException("页面出错了...");
        }
        //床架ModelAndView对象并从中添加内容
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("errorMessage", e.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
