package com.example.gmail.user.controller;

import com.example.gmail.user.bean.Shinyu_Roles;
import com.example.gmail.user.bean.Shinyu_Users;
import com.example.gmail.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("getUserRoleById")
    @ResponseBody
    public List<Shinyu_Roles> getUserRoleById(String uid)
    {
        List<Shinyu_Roles> umsUserRoles = userService.getUserRoleById(uid);
        return  umsUserRoles;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<Shinyu_Users> getAllUser()
    {
        List<Shinyu_Users> umsUsers = userService.getAllUser();
        return  umsUsers;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index()
    {
         return  "Hello User";
    }
}
