package com.FitnessTrackingApplication.FitnessTrackingApp.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class WorkoutDto {

    private int id;
    private LocalDate workoutDate;
    private String exerciseDate;
}

