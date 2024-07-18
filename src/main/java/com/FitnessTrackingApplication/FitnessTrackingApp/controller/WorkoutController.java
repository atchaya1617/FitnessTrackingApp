package com.FitnessTrackingApplication.FitnessTrackingApp.controller;

import com.FitnessTrackingApplication.FitnessTrackingApp.entity.WorkoutEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.service.WorkoutService;
import com.FitnessTrackingApplication.FitnessTrackingApp.utill.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/workout")
public class WorkoutController {
    @Autowired
    WorkoutService service;

    @PostMapping
    public ResponseStructure<WorkoutEntity> saveWorkout(@RequestBody WorkoutEntity user) {
        return service.saveWorkout(user);
    }

    @GetMapping
    public ResponseStructure<WorkoutEntity>  findWorkout(@RequestParam int id) {
        return service.findWorkout(id);
    }

    @DeleteMapping
    public ResponseStructure<WorkoutEntity> deleteUser(@RequestParam int id) {
        return service.deleteWorkout(id);

    }

    @PutMapping
    public ResponseStructure<WorkoutEntity>  updateUser(@RequestBody WorkoutEntity user, @RequestParam int id) {
        return service.updateWorkout(user, id);
    }

}
