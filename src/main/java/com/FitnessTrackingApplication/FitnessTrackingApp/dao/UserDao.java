package com.FitnessTrackingApplication.FitnessTrackingApp.dao;

import com.FitnessTrackingApplication.FitnessTrackingApp.entity.UserEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDao {

    @Autowired
    UserRepo userRepo;

    public UserEntity saveUser(UserEntity userEntity) {

        return userRepo.save(userEntity);

    }

    public UserEntity findById(int id) {
        Optional<UserEntity> opuser = userRepo.findById(id);
        return opuser.orElse(null);
    }

    public UserEntity updateUser(UserEntity user,int id) {
        UserEntity existingUser = findById(id);
        if(existingUser!=null) {
            user.setId(id);
            return userRepo.save(user);
        }return null;
    } // exception for user not saved

    public UserEntity deleteUser(int id) {
        UserEntity user = findById(id);
        if(user!=null) {
            userRepo.delete(user);
            return user;
        }return null;
    }
}
