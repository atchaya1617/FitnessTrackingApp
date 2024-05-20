package com.FitnessTrackingApplication.FitnessTrackingApp.repository;

import com.FitnessTrackingApplication.FitnessTrackingApp.entity.PerformanceMetricsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerformanceMetricsRepo extends JpaRepository<PerformanceMetricsEntity, Integer> {
}
