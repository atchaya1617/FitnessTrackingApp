package com.FitnessTrackingApplication.FitnessTrackingApp.dao;

import com.FitnessTrackingApplication.FitnessTrackingApp.entity.PerformanceMetricsEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.repository.PerformanceMetricsRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class PerformanceMetricsDao {

    @Autowired
    PerformanceMetricsRepo performanceMetricsRepo;

    public PerformanceMetricsEntity savePerformanceMetrics(PerformanceMetricsEntity performanceMetricsEntity) {

        return performanceMetricsRepo.save(performanceMetricsEntity);

    }

    public PerformanceMetricsEntity findById(int id) {
        Optional<PerformanceMetricsEntity> optionalPerformanceMetricsEntity = performanceMetricsRepo.findById(id);
        return optionalPerformanceMetricsEntity.orElse(null);
    }

    public PerformanceMetricsEntity updatePerformanceMetrics(PerformanceMetricsEntity performanceMetricsEntity,int id) {
        PerformanceMetricsEntity existingPerformanceMetrics = findById(id);
        if(existingPerformanceMetrics!=null) {
            performanceMetricsEntity.setId(id);
            return performanceMetricsRepo.save(performanceMetricsEntity);
        }return null;
    } // exception for performanceMetrics not saved

    public PerformanceMetricsEntity deletePerformanceMetrics(int id) {
        PerformanceMetricsEntity performanceMetricsEntity = findById(id);
        if(performanceMetricsEntity!=null) {
            performanceMetricsRepo.delete(performanceMetricsEntity);
            return performanceMetricsEntity;
        }return null;
    }



}

