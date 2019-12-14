package com.example.gmail.user.service.impl;

import com.example.gmail.user.bean.Shinyu_Users;
import com.example.gmail.user.mapper.UserMapper;
import com.example.gmail.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<Shinyu_Users> getAllUser() {
        List<Shinyu_Users> umsUsers = userMapper.getAllUser();
        return umsUsers;
    }
}
