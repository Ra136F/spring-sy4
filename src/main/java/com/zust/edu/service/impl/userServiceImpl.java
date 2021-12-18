package com.zust.edu.service.impl;

import com.zust.edu.dao.userDao;
import com.zust.edu.entity.user;
import com.zust.edu.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userservice")
public class userServiceImpl implements userService {
    @Autowired
    private com.zust.edu.dao.userDao userDao;
    @Override
    public user finduser(String username, String psd) {
        user user = userDao.selectUserByUsernameAndPsw(username, psd);
        return user;
    }
}
