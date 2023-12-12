package com.bikalp.AuthService.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_tb_seq_gen")
    @SequenceGenerator(name = "user_tb_seq_gen",sequenceName = "user_tb_seq",allocationSize = 1)

    private Long id;

    private String fullName;

    private String email;

    private String password;

    private boolean isActive;

}
