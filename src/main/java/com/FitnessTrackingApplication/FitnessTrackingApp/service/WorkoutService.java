package com.FitnessTrackingApplication.FitnessTrackingApp.service;

import com.FitnessTrackingApplication.FitnessTrackingApp.dao.WorkoutDao;
import com.FitnessTrackingApplication.FitnessTrackingApp.entity.WorkoutEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.utill.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class WorkoutService {

    @Autowired
    WorkoutDao workoutDao;


    public ResponseStructure<WorkoutEntity> saveWorkout(WorkoutEntity workout) {
        ResponseStructure<WorkoutEntity> structure = new ResponseStructure<WorkoutEntity>();
        WorkoutEntity savedWorkout = workoutDao.saveworkout(workout);
        if(savedWorkout !=null) {
            structure.setData(savedWorkout);
            structure.setMessage("workout saved success");
            structure.setStatus(HttpStatus.CREATED.value());
            return structure;

        }return null; // exception workout not saved
    }

    public ResponseStructure<WorkoutEntity> findWorkout(int id){
        ResponseStructure<WorkoutEntity> structure = new ResponseStructure<WorkoutEntity>();
        WorkoutEntity exWorkout = workoutDao.findById(id);
        if(exWorkout!= null) {
            structure.setData(exWorkout);
            structure.setMessage("workout found with the given id");
            structure.setStatus(HttpStatus.FOUND.value());
            return structure;
        }return null; // exception for workout not found for the given id
    }

    public ResponseStructure<WorkoutEntity> updateWorkout(WorkoutEntity workout, int id) {
        ResponseStructure<WorkoutEntity> structure = new ResponseStructure<WorkoutEntity>();
        WorkoutEntity exWorkout = workoutDao.findById(id);
        if(exWorkout!=null) {
            structure.setData(exWorkout);
            structure.setMessage("workout updated successfully");
            structure.setStatus(HttpStatus.OK.value());
            return structure;
            //return dao.updateWorkout(exWorkout, id);
        }return null; //exception for workout not found for the given id
    }

    public ResponseStructure<WorkoutEntity> deleteWorkout(int id){
        ResponseStructure<WorkoutEntity> structure = new ResponseStructure<WorkoutEntity>();
        WorkoutEntity exWorkout = workoutDao.findById(id);
        if(exWorkout!=null) {
            structure.setData(exWorkout);
            structure.setMessage("workout deleted successfully");
            structure.setStatus(HttpStatus.OK.value());
            return structure;
        }return null;
    }

}
