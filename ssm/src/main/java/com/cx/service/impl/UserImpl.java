package com.cx.service.impl;

import com.cx.mapper.UserMapper;
import com.cx.pojo.User;
import com.cx.pojo.UserExample;
import com.cx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * 丛志文
 */

@Component
public class UserImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User selectLogin(String phone, String pwd) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserPhoneEqualTo(phone).andUserPasswordEqualTo(pwd);
        List<User> userList =userMapper.selectByExample(userExample);
        if(null != userList && userList.size() > 0){
            return userList.get(0);
        }
        return null;
    }

    @Override
    public void register(String phone, String pwd, String code) {

    }
}
