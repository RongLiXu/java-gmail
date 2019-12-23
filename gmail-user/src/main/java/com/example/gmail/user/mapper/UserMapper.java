package com.example.gmail.user.mapper;


import com.example.gmail.user.bean.Shinyu_Users;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<Shinyu_Users> {
    List<Shinyu_Users> getAllUser();
}
