package com.zust.edu.dao;


import com.zust.edu.entity.user;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component("userDao")
public interface userDao {
    @Select("select * from tuser")
    List<user> selectUsers();

    @Select("select * from tuser where login_name=#{username} and password=#{psd}")
    user selectUserByUsernameAndPsw(@Param("username") String Username, @Param("psd") String password);
}
