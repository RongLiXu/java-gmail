package com.example.shinyuarticle.mapper;

import com.example.shinyuarticle.bean.UmsMember;

import java.util.List;

public interface UserMapper {

    List<UmsMember> getAllUser();

    UmsMember getUserById(String id);
}
