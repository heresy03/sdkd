package com.cx.controller.czw;

import com.cx.pojo.Admin;
import com.cx.pojo.User;
import com.cx.service.czw.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * 丛志文
 */
@Controller
@RequestMapping("login")
@SessionAttributes(value = {"user","admin"},types = {User.class,Admin.class})
public class LoginController {

    @Autowired
    LoginService loginService;


    User user = new User();
    Admin admin = new Admin();
    //表单提交过来的路径
    @RequestMapping("userLogin")
    public String userLogin(String phone,String pwd, Model model){
        //调用service方法
        user = loginService.userLogin(phone,pwd);
        //若有user则添加到model里并且跳转到成功页面
        if(user != null){
            model.addAttribute("user",user);
            return "test";
        }
        return "fail";
    }

    @RequestMapping("adminLogin")
    public String adminLogin(String phone ,String pwd , Model model){
        admin = loginService.adminLogin(phone,pwd);
        if(admin != null){
            model.addAttribute("admin",admin);
        }
        return "fail";
    }

}
