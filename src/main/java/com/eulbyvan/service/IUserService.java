package com.eulbyvan.service;

import com.eulbyvan.model.Role;
import com.eulbyvan.model.User;

import java.util.List;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 09/12/2022
 */

public interface IUserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void assignRole(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
