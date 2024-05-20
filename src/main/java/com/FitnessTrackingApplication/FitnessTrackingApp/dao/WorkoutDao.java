package com.FitnessTrackingApplication.FitnessTrackingApp.dao;

import com.FitnessTrackingApplication.FitnessTrackingApp.dto.WorkoutDto;
import com.FitnessTrackingApplication.FitnessTrackingApp.entity.WorkoutEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.repository.WorkoutRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class WorkoutDao {

    @Autowired
    WorkoutRepo workoutRepo;

    public WorkoutEntity saveworkout(WorkoutEntity workoutEntity) {

        return workoutRepo.save(workoutEntity);

    }

    public WorkoutEntity findById(int id) {
        Optional<WorkoutEntity> opWorkout = workoutRepo.findById(id);
        return opWorkout.orElse(null);
    }

    public WorkoutEntity updateWorkout(WorkoutEntity workout,int id) {
        WorkoutEntity existingWorkout = findById(id);
        if(existingWorkout!=null) {
            workout.setId(id);
            return workoutRepo.save(workout);
        }return null;
    } // exception for workout not saved

    public WorkoutEntity deleteWorkout(int id) {
        WorkoutEntity workout = findById(id);
        if(workout!=null) {
            workoutRepo.delete(workout);
            return workout;
        }return null;
    }


}
