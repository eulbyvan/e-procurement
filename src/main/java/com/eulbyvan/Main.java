package com.eulbyvan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 09/12/2022
 */

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

//    @Bean
//    CommandLineRunner run(UserService userService) {
//        return args -> {
//            userService.saveRole(new Role(null, "ROLE_USER"));
//            userService.saveRole(new Role(null, "ROLE_MANAGER"));
//            userService.saveRole(new Role(null, "ROLE_ADMIN"));
//            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
//
//            userService.saveUser(new User(null, "stu", "stu", "pid", new ArrayList<>()));
//            userService.saveUser(new User(null, "test01", "test01", "test01", new ArrayList<>()));
//            userService.saveUser(new User(null, "test02", "test02", "test02", new ArrayList<>()));
//            userService.saveUser(new User(null, "test03", "test03", "test03", new ArrayList<>()));
//
//            userService.assignRole("stu", "ROLE_SUPER_ADMIN");
//            userService.assignRole("test01", "ROLE_USER");
//            userService.assignRole("test02", "ROLE_MANAGER");
//            userService.assignRole("test03", "ROLE_ADMIN");
//        };
//    }
}