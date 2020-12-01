package com.cx.service.impl.czw;

import com.cx.mapper.AdminMapper;
import com.cx.mapper.UserMapper;
import com.cx.pojo.Admin;
import com.cx.pojo.AdminExample;
import com.cx.pojo.User;
import com.cx.pojo.UserExample;
import com.cx.service.czw.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * 丛志文
 */

@Component
public class LoginImpl implements LoginService {
    @Autowired
    UserMapper userMapper;
    AdminMapper adminMapper;

    @Override
    public User userLogin(String phone, String pwd) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserPhoneEqualTo(phone).andUserPasswordEqualTo(pwd);
        List<User> userList =userMapper.selectByExample(userExample);
        if(null != userList && userList.size() > 0){
            return userList.get(0);
        }
        return null;
    }

    @Override
    public Admin adminLogin(String phone, String pwd) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAdminPhoneEqualTo(phone).andAdminPasswordEqualTo(pwd);
        List<Admin> adminList = adminMapper.selectByExample(adminExample);
        if(null != adminList && adminList.size() > 0){
            return adminList.get(0);
        }
        return null;
    }


}
