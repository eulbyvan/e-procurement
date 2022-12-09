package com.eulbyvan.service;

import com.eulbyvan.model.Role;
import com.eulbyvan.model.User;
import com.eulbyvan.repo.IRoleRepo;
import com.eulbyvan.repo.IUserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 09/12/2022
 */

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserService implements IUserService {
    private final IUserRepo userRepo;
    private final IRoleRepo roleRepo;

    @Override
    public User saveUser(User user) {
        log.info("saving new user {} to the database ...", user.getName());
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("saving new role {} to the database ...", role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void assignRole(String username, String roleName) {
        User user = userRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleName);

        log.info("assigning new role of {} to user {} ...",
                roleName,
                username);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        log.info("fetching user {} ...", username);
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("fetching all users ...");
        return userRepo.findAll();
    }
}
