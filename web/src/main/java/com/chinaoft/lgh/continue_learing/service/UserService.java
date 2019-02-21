package com.chinaoft.lgh.continue_learing.service;

import com.chinaoft.lgh.continue_learing.model.User;

import java.util.List;

public interface UserService {

    User findByUsername(String username);
}
