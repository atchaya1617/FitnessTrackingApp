package com.FitnessTrackingApplication.FitnessTrackingApp.controller;


import com.FitnessTrackingApplication.FitnessTrackingApp.dto.UserDto;
import com.FitnessTrackingApplication.FitnessTrackingApp.entity.UserEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.service.UserService;
import com.FitnessTrackingApplication.FitnessTrackingApp.utill.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class UserController {
    @Autowired
    UserService service;

    @PostMapping
    public ResponseStructure<UserDto> saveUserDto(@RequestBody UserDto user) {
        return service.saveUser(user);
    }

    @GetMapping
    public ResponseStructure<UserDto>  findUser(@RequestParam int id) {
        return service.findUser(id);
    }

    @DeleteMapping
    public ResponseStructure<UserDto> deleteUser(@RequestParam int id) {
        return service.deleteUser(id);

    }

    @PutMapping
    public ResponseStructure<UserDto>  updateUser(@RequestBody UserEntity user, @RequestParam int id) {
        return service.updateUser(user, id);
    }

}
