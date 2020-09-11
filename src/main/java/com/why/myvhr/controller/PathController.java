package com.why.myvhr.controller;

import com.why.myvhr.util.ResultBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PathController {

    @PostMapping("login")
    @ResponseBody
    public ResultBean login(String username , String password){

        // 通过SecurityUtils 获取一个Subject
        Subject subject = SecurityUtils.getSubject();

        //  Token ==> 令牌
        UsernamePasswordToken token = new UsernamePasswordToken(username , password);
        subject.login(token);
        return ResultBean.success("登录成功");
    }

    @GetMapping("logout")
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();//退出用户
        return "/login.html";
    }

    @GetMapping("home")
    public String home(){
        return "/home.html";
    }
}
