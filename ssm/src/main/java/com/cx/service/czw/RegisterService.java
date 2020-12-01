package com.cx.service.czw;

/**
 * 丛志文
 */
public interface RegisterService {
    //注册;电话，密码
    int register(String phone , String pwd );
    //注册;电话，密码，验证码
    int registerByCode(String phone , String pwd , String code);
}
