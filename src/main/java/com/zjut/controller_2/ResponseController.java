package com.zjut.controller_2;

import com.zjut.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping(path = "/response")
public class ResponseController {

    @RequestMapping(path = "/testString")
    public String testString(ModelMap modelMap){
        System.out.println("成功执行testString...");
        //模拟从数据库中读取一个User
        User user = new User("小高", "25");
        modelMap.addAttribute("user", user);
        return "success";
    }

    @RequestMapping(path = "/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1、请求转发，发送一个请求
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);

        //2、重定向,发送两个请求，无法访问/WEB-INF/pages/内的文件
        //response.sendRedirect(request.getContextPath() + "/index.jsp");

        //3、直接响应数据
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("你好");
        return;
    }

    @RequestMapping(path = "/testJson")
    public @ResponseBody User testJson(@RequestBody User user){
        System.out.println(user);
        user.setName("阿高");
        user.setAge("1001");
        return user;
    }
}
