package com.zjut.controller;

import com.zjut.domain.UserAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/param")
public class ParamController {
    @RequestMapping(path = "/paramTest")
    public String paramTest(String user, String password){
        System.out.println("user:" + user + " password:" + password);
        return "success";
    }

    @RequestMapping(path = "paramBean")
    public String paramBean(UserAccount userAccount){
        System.out.println(userAccount);
        return "success";
    }
}
