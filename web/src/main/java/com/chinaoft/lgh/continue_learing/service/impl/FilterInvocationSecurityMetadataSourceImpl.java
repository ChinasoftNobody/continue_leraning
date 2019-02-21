package com.chinaoft.lgh.continue_learing.service.impl;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * 接收用户请求的地址，返回访问该地址需要的所有权限
 */
@Component
public class FilterInvocationSecurityMetadataSourceImpl implements FilterInvocationSecurityMetadataSource {


    public static final String ROLE_ADMIN = "ROLE_ADMIN";
    public static final String ROLE_LOGIN = "ROLE_LOGIN";

    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        System.out.println("用户请求的地址是：" + requestUrl);
        //如果登录页面就不需要权限
        if ("/login".equals(requestUrl) || requestUrl.startsWith("/static")) {
            return SecurityConfig.createList(ROLE_LOGIN);
        }
        //这里需要返回该地址需要的角色列表，我们默认给出ADMIN角色
        //如果需要控制url对应的角色，可以增加资源访问控制
        return SecurityConfig.createList(ROLE_ADMIN);
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return SecurityConfig.createList(ROLE_ADMIN, ROLE_LOGIN);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
