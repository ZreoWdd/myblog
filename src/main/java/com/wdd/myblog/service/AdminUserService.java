package com.wdd.myblog.service;

import com.wdd.myblog.entity.AdminUser;

/**
 * @Classname AdminUserService
 * @Description None
 * @Date 2019/7/7 13:54
 * @Created by WDD
 */
public interface AdminUserService {
    AdminUser login(String userName, String password);
}
