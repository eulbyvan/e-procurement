package com.eulbyvan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.EAGER;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 09/12/2022
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sys_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true, nullable = false)
    private String username;
    private String password;
    @ManyToMany(fetch = EAGER)
    private List<Role> roles = new ArrayList<>();
}

