package com.FitnessTrackingApplication.FitnessTrackingApp.service;

import com.FitnessTrackingApplication.FitnessTrackingApp.dao.UserDao;
import com.FitnessTrackingApplication.FitnessTrackingApp.dto.UserDto;
import com.FitnessTrackingApplication.FitnessTrackingApp.entity.UserEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.utill.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public ResponseStructure<UserDto> saveUser(UserDto user) {
        ResponseStructure<UserDto> structure = new ResponseStructure<UserDto>();
        UserEntity savedUser = userDao.saveUser(user);
        if(savedUser !=null) {
            structure.setData(savedUser);
            structure.setMessage("user saved success");
            structure.setStatus(HttpStatus.CREATED.value());
            return structure;
        }return null; // exception user not saved
    }

    public ResponseStructure<UserDto> findUser(int id){
        ResponseStructure<UserDto> structure = new ResponseStructure<UserDto>();
        UserEntity exUser = userDao.findById(id);
        if(exUser!= null) {
            structure.setData(exUser);
            structure.setMessage("user found with the given id");
            structure.setStatus(HttpStatus.FOUND.value());
            return structure;
        }return null; // exception for user not found for the given id
    }

    public ResponseStructure<UserDto> updateUser(UserEntity user, int id) {
        ResponseStructure<UserDto> structure = new ResponseStructure<UserDto>();
        UserEntity exUser = userDao.findById(id);
        if(exUser!=null) {
            structure.setData(exUser);
            structure.setMessage("user updated successfully");
            structure.setStatus(HttpStatus.OK.value());
            return structure;
            //return dao.updateUser(exUser, id);
        }return null; //exception for User not found for the given id
    }

    public ResponseStructure<UserDto> deleteUser(int id){
        ResponseStructure<UserDto> structure = new ResponseStructure<UserDto>();
        UserEntity exUser = userDao.findById(id);
        if(exUser!=null) {
            structure.setData(exUser);
            structure.setMessage("user deleted successfully");
            structure.setStatus(HttpStatus.OK.value());
            return structure;
        }return null;
    }

}
