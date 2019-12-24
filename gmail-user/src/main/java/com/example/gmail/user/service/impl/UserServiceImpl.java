package com.example.gmail.user.service.impl;

import com.example.gmail.user.mapper.Shinyu_RolesMapper;
import com.example.gmail.user.mapper.UserMapper;
import com.shinyu.gmall.bean.Shinyu_Roles;
import com.shinyu.gmall.bean.Shinyu_Users;
import com.shinyu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    Shinyu_RolesMapper shinyu_rolesMapper;
    
    @Override
    public List<Shinyu_Users> getAllUser() {
        List<Shinyu_Users> umsUsers = userMapper.selectAll(); //.getAllUser();
        return umsUsers;
    }

    @Override
    public List<Shinyu_Roles> getUserRoleById(String uid) {
        List<Shinyu_Roles> userRoleById = shinyu_rolesMapper.getUserRoleById(uid);
        return  userRoleById;
    }


}
