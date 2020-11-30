package com.cx.controller;

import com.cx.pojo.User;
import com.cx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * 丛志文
 */
@Controller
@RequestMapping("user")
@SessionAttributes("user")
public class UserController {

    @Autowired
    UserService userService;

    //表单提交过来的路径
    @RequestMapping("checkLogin")
    public String checkLogin(@RequestBody User user, Model model){
        //调用service方法
        user = userService.selectLogin(user.getUserPhone(), user.getUserPassword());
        //若有user则添加到model里并且跳转到成功页面
        if(user != null){
            model.addAttribute("user",user);
            return "success";
        }
        return "fail";
    }

    @RequestMapping("register")
    public String register(){
        return "register";
    }

    @RequestMapping("doRegister")
    public String doRegister(User user){
        String phone = user.getUserPhone();
        String pwd = user.getUserPassword();
        userService.register(phone,pwd,null);
        return "success";
    }
}
