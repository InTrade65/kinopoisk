package com.example.Kinopoisk.dto;

import java.sql.Timestamp;

public class UserDto {
    private Integer userId;
    private String email;
    private String passwordHash;
    private Timestamp registrationDate;
    private boolean isAdmin;
    private String userName;

    public UserDto() {

    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getEmail() {
        return email;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public Timestamp getRegistrationDate() {
        return registrationDate;
    }

    public boolean isAdmin() {
        return isAdmin;
    }




}
