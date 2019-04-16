package com.chinaoft.lgh.continue_learing.service.impl;

import com.chinaoft.lgh.continue_learing.model.User;
import com.chinaoft.lgh.continue_learing.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User findByUsername(String username) {
        User user = new User("maysham", "maysham", true, true, true, true);
        return user;
    }
}
