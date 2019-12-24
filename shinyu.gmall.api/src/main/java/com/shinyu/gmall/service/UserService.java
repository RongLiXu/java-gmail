package com.shinyu.gmall.service;

import com.shinyu.gmall.bean.Shinyu_Roles;
import com.shinyu.gmall.bean.Shinyu_Users;

import java.util.List;

public interface UserService {

    List<Shinyu_Users> getAllUser();


    List<Shinyu_Roles> getUserRoleById(String uid);
}
