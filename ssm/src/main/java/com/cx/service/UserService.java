package com.cx.service;
import com.cx.pojo.User;

/**
 * 丛志文
 */
public interface UserService {
    //登录
    User selectLogin(String phone , String pwd);
    //注册
    void register(String phone , String pwd , String code);
}
