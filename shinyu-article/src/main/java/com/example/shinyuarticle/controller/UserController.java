package com.example.shinyuarticle.controller;


import com.example.shinyuarticle.bean.UmsMember;
import com.example.shinyuarticle.service.impl.IUserService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping(value = "getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser()
    {
//        List<UmsMember> data = new Vector<>();
//        for (int i = 0; i < 5; i++) {
//            UmsMember umsMember = new UmsMember();
//            umsMember.setId(i+1);
//            umsMember.setUsername("這是用戶名"+(i+1));
//            data.add(umsMember);
//        }

        List<UmsMember> data = userService.getAllUser();

        return data;
    }

//    @RequestMapping(value = "getUserById",params =  {"id","name=zs"})zs
    @RequestMapping(value = "getUserById")
    @ResponseBody
    public UmsMember getUserById(String id)
    {
        if(id.isEmpty() || id==null)
        {
            throw new RuntimeException("參數錯誤！");
        }
        UmsMember umsMember = userService.getUserById(id);
        return umsMember;
    }
}
