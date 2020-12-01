package com.cx.service.czw;
import com.cx.pojo.Admin;
import com.cx.pojo.User;

/**
 * 丛志文
 */
public interface LoginService {
    //登录
    User userLogin(String phone , String pwd);
    Admin adminLogin(String phone , String pwd);

}
