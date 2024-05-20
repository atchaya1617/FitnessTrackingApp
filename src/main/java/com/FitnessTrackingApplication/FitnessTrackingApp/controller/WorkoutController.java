package com.FitnessTrackingApplication.FitnessTrackingApp.controller;

import com.FitnessTrackingApplication.FitnessTrackingApp.dto.WorkoutDto;
import com.FitnessTrackingApplication.FitnessTrackingApp.service.WorkoutService;
import com.FitnessTrackingApplication.FitnessTrackingApp.utill.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class WorkoutController {
    @Autowired
    WorkoutService service;

    @PostMapping
    public ResponseStructure<WorkoutDto> saveWorkout(@RequestBody WorkoutDto user) {
        return service.saveWorkout(user);
    }

    @GetMapping
    public ResponseStructure<WorkoutDto>  findWorkout(@RequestParam int id) {
        return service.findWorkout(id);
    }

    @DeleteMapping
    public ResponseStructure<WorkoutDto> deleteUser(@RequestParam int id) {
        return service.deleteWorkout(id);

    }

    @PutMapping
    public ResponseStructure<WorkoutDto>  updateUser(@RequestBody WorkoutDto user, @RequestParam int id) {
        return service.updateWorkout(user, id);
    }

}
