package com.chinaoft.lgh.continue_learing.service.impl;

import com.chinaoft.lgh.continue_learing.model.User;
import com.chinaoft.lgh.continue_learing.service.RoleService;
import com.chinaoft.lgh.continue_learing.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private UserService userService;
    @Resource
    private RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userService.findByUsername(s);
        if (user == null) {
            throw new UsernameNotFoundException("没有该用户");
        }
        return new UserDetailsImpl(user.getUsername(), user.getPassword(), user.isAccountNonExpired(), user.isAccountNonLocked()
                , user.isCredentialsNonExpired(), user.isEnabled(), roleService.getRolesOfUser(user.getUsername()));
    }
}
