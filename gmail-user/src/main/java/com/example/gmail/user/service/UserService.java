package com.example.gmail.user.service;

import com.example.gmail.user.bean.Shinyu_Roles;
import com.example.gmail.user.bean.Shinyu_Users;

import java.util.List;

public interface UserService {

    List<Shinyu_Users> getAllUser();


    List<Shinyu_Roles> getUserRoleById(String uid);
}
