package com.example.Kinopoisk.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@AllArgsConstructor
@Getter
@Setter

public class UsersDto {
    private Integer userId;
    private String userName;
    private String email;
    private String passwordHash;
    private Timestamp registrationDate;
    private boolean isAdmin;
}
