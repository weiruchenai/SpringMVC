package com.zjut.domain;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

    /**
    * @Description: 预处理，在controller方法执行前执行
    * @Param: [request, response, handler]
    * @return: boolean 若为true则执行下一个拦截器，若没有下一个拦截器则直接执行控制器中的代码
    */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor的预处理方法执行了...pre");
        return true;
    }

    /**
    * @Description: 后处理，在controller方法执行后，在success.jsp执行前
    * @Param: [request, response, handler, modelAndView]
    * @return: void
    */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor的后处理方法执行了...post");
    }

    /**
    * @Description: 完成后处理，在success.jsp执行后
    * @Param: [request, response, handler, ex]
    * @return: void
    */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("MyInterceptor的完成处理方法执行了...after");
    }
}
