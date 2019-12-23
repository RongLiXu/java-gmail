package com.example.shinyuarticle.service;

import com.example.shinyuarticle.bean.UmsMember;
import com.example.shinyuarticle.mapper.UserMapper;
import com.example.shinyuarticle.service.impl.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.getAllUser();
        return umsMembers;
    }

    @Override
    public UmsMember getUserById(String id) {
        UmsMember umsMember = userMapper.getUserById(id);
        return umsMember;
    }
}
