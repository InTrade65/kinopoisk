package com.example.Kinopoisk.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Setter

public class UserDto {
    private Integer userId;
    private String userName;
    private String email;
    private String passwordHash;
    private Timestamp registrationDate;
    private boolean isAdmin;
}
