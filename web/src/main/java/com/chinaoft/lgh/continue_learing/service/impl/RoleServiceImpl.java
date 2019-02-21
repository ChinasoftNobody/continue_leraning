package com.chinaoft.lgh.continue_learing.service.impl;

import com.chinaoft.lgh.continue_learing.model.Role;
import com.chinaoft.lgh.continue_learing.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public List<Role> getRolesOfUser(String username) {
        List<Role> roles = new ArrayList<>();
        roles.add(new Role("ROLE_LOGIN"));
        return roles;
    }
}
