package com.example.Kinopoisk.controller;

import com.example.Kinopoisk.dto.UserDto;
import com.example.Kinopoisk.service.UserCRUDService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/user")
public class UserController {

    private final UserCRUDService userService;

    public UserController(UserCRUDService userService) {
        this.userService = userService;
    }
    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable Integer id){
        return userService.getById(id);
    }

    @GetMapping("/")
    public Collection<UserDto> getAllUsers(){
        return userService.getAll();
    }

    @PostMapping
    public void createUser(@RequestBody UserDto userDto){
        userService.create(userDto);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Integer id, @RequestBody UserDto userDto){
    userService.update(getUserById(id), userDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        userService.delete(id);
    }
}
