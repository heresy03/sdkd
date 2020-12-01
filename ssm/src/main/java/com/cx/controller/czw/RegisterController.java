package com.cx.controller.czw;

import com.cx.pojo.User;
import com.cx.service.czw.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * 丛志文
 */
@Controller
@RequestMapping("register")
@SessionAttributes("user")
public class RegisterController {

    @Autowired
    RegisterService registerService;
    User user = new User();

    @RequestMapping("register")
    public String register(){
        return "register";
    }

    @RequestMapping("doRegister")
    public String doRegister(String phone ,String pwd,Model model){
        //调用注册接口，返回受影响行数
        int AffectRows = registerService.register(phone,pwd);
        user.setUserPhone(phone);
        user.setUserPassword(pwd);
        //根据受影响行数进行判断
        if(AffectRows>0){
            //受影响行数大于0，注册成功直接登录，并将user添加到model中
            model.addAttribute("user",user);
            return "success";
        }
        return "fail";
    }
}
