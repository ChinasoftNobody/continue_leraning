package com.chinaoft.lgh.continue_learing.service;

import com.chinaoft.lgh.continue_learing.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> getRolesOfUser(String username);
}
