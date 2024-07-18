package com.FitnessTrackingApplication.FitnessTrackingApp.controller;


import com.FitnessTrackingApplication.FitnessTrackingApp.entity.UserEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.service.UserService;
import com.FitnessTrackingApplication.FitnessTrackingApp.utill.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService service;

    @PostMapping
    public ResponseStructure<UserEntity> saveUser(@RequestBody UserEntity userEntity) {
        return service.saveUser(userEntity);
    }

    @GetMapping
    public ResponseStructure<UserEntity>  findUser(@RequestParam int id) {
        return service.findUser(id);
    }

    @DeleteMapping
    public ResponseStructure<UserEntity> deleteUser(@RequestParam int id) {
        return service.deleteUser(id);

    }

    @PutMapping
    public ResponseStructure<UserEntity>  updateUser(@RequestBody UserEntity user, @RequestParam int id) {
        return service.updateUser(user, id);
    }

}
