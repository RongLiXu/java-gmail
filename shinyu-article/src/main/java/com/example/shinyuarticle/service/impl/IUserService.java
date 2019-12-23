package com.example.shinyuarticle.service.impl;

import com.example.shinyuarticle.bean.UmsMember;

import java.util.List;

public interface IUserService {
    List<UmsMember> getAllUser();

    UmsMember getUserById(String id);
}
