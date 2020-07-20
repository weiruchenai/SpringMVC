package com.zjut.controller;

import com.zjut.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping(path = "/annotation")
@SessionAttributes(value = "name") //添加注解后会将name小高放入Session域中，以实现控制前之间的参数共享
public class AnnotationController {
    @RequestMapping(path = "/annotationTest/{anno}")
    public String annotationTest(@PathVariable(value = "anno") String annotation){
        System.out.println(annotation + "注解测试成功...");
        return "success";
    }

    @RequestMapping(path = "/save_SessionAttributes")
    public String save_SessionAttribute(Model model){
        //底层会存储到request域对象中
        model.addAttribute("name", "小高");
        return "success";
    }
    @RequestMapping(path = "/get_SessionAttributes")
    public String get_SessionAttribute(ModelMap modelmap){
        //从Session域中取值
        System.out.println(modelmap.get("name"));
        return "success";
    }
    @RequestMapping(path = "/delete_SessionAttributes")
    public String delete_SessionAttribute(SessionStatus status){
        System.out.println("清除Session域...");
        status.setComplete();//调用方法删除Session域，结束参数共享
        return "success";
    }
}
