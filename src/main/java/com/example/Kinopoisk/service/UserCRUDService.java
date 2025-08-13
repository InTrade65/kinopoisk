package com.example.Kinopoisk.service;

import com.example.Kinopoisk.dto.UserDto;
import com.example.Kinopoisk.entity.User;
import com.example.Kinopoisk.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserCRUDService implements CRUDService<UserDto>{

    public UserCRUDService(UserRepository repository) {
        this.repository = repository;
    }

    private final UserRepository  repository;

    @Override
    public UserDto getById(Integer id) {
        System.out.println("Get by ID" + id);
        User user = repository.findById(id).orElseThrow();
        return mapToDto(user);
    }

    @Override
    public Collection<UserDto> getAll() {
        System.out.println("GetAll");
        return repository.findAll()
                .stream()
                .map(UserCRUDService::mapToDto)
                .toList();
    }

    @Override
    public void create(UserDto item) {
        System.out.println("Create");
        User user = mapToEntity(item);
        repository.save(user);
    }

    @Override
    public void update(UserDto userById, UserDto item) {
        System.out.println("Update");
        User user = mapToEntity(item);
        repository.save(user);

    }

    @Override
    public void delete(Integer id) {
        System.out.println("Delete" + id);
        repository.deleteById(id);

    }

    public static UserDto mapToDto(User user){
        UserDto userDto = new UserDto();
        userDto.setUserId(user.getUserId());
        userDto.setUserName(user.getUserName());
        userDto.setEmail(user.getEmail());
        userDto.setPasswordHash(user.getPasswordHash());
        userDto.setAdmin(user.isAdmin());
        userDto.setRegistrationDate(user.getRegistrationDate());
        return userDto;
    }

    public static User mapToEntity(UserDto userDto){
        User user = new User();
        user.setUserId(userDto.getUserId());
        user.setUserName(userDto.getUserName());
        user.setEmail(userDto.getEmail());
        user.setPasswordHash(userDto.getPasswordHash());
        user.setAdmin(userDto.isAdmin());
        user.setRegistrationDate(userDto.getRegistrationDate());
        return user;
    }
}
