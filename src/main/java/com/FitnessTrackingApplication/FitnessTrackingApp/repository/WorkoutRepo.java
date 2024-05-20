package com.FitnessTrackingApplication.FitnessTrackingApp.repository;

import com.FitnessTrackingApplication.FitnessTrackingApp.entity.WorkoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepo extends JpaRepository<WorkoutEntity, Integer> {
}
