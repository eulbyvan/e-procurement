package com.eulbyvan.controller;

import com.eulbyvan.model.Role;
import com.eulbyvan.model.User;
import com.eulbyvan.model.req.UserRole;
import com.eulbyvan.service.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 09/12/2022
 */

//@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class UserController {
    private IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = userService.getUsers();

        return ResponseEntity.ok().body(users);
    }

    @PostMapping("/users")
    public ResponseEntity<User> saveUser(@RequestBody User req) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/users").toUriString());
        return ResponseEntity.created(uri).body(userService.saveUser(req));
    }

    @PostMapping("/roles")
    public ResponseEntity<Role> saveRole(@RequestBody Role req) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/roles").toUriString());
        return ResponseEntity.created(uri).body(userService.saveRole(req));
    }

    @PostMapping("/user/roles")
    public ResponseEntity<?> assignRole(@RequestBody UserRole req) {
        userService.assignRole(req.getUsername(), req.getRoleName());
        return ResponseEntity.ok().build();
    }
}
