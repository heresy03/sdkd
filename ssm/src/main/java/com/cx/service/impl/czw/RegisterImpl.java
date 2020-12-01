package com.cx.service.impl.czw;

import com.cx.mapper.UserMapper;
import com.cx.pojo.User;
import com.cx.service.czw.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegisterImpl implements RegisterService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int register(String phone, String pwd) {
        User user = new User();
        user.setUserPhone(phone);
        user.setUserPassword(pwd);
        int AffectRows = userMapper.insertSelective(user);
        return AffectRows;
    }

    @Override
    public int registerByCode(String phone, String pwd, String code) {
        return 0;
    }
}
