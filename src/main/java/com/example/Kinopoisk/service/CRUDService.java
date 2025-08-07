package com.example.Kinopoisk.service;

import com.example.Kinopoisk.dto.UserDto;

import java.util.Collection;

public interface CRUDService <T>{
    T getById(Integer id);
    Collection<T> getAll();
    void create(T item);
    void update(UserDto userById, UserDto item);
    void delete(Integer id);
}
