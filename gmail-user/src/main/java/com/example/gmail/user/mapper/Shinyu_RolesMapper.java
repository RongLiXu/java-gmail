package com.example.gmail.user.mapper;


import com.shinyu.gmall.bean.Shinyu_Roles;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface Shinyu_RolesMapper extends Mapper<Shinyu_Roles> {
    List<Shinyu_Roles> getUserRoleById(String uid);
}
