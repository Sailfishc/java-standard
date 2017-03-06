package com.sailfish.service;

import com.sailfish.entity.User;

/**
 * @author sailfish
 * @create 2017-03-06-下午8:23
 */
public interface UserService {
    /**
     * 添加用户
     * @param user
     * @return
     */
    User addUser(User user);
}
