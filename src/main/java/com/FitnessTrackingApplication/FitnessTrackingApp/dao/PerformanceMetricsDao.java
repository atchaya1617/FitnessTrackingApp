package com.FitnessTrackingApplication.FitnessTrackingApp.dao;

import com.FitnessTrackingApplication.FitnessTrackingApp.entity.PerformanceMetricsEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.repository.PerformanceMetricsRepo;
import com.FitnessTrackingApplication.FitnessTrackingApp.utill.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public interface PerformanceMetricsDao {
//
//    @Autowired
//    PerformanceMetricsRepo performanceMetricsRepo;

       public PerformanceMetricsEntity findById ( int id);
    public ResponseStructure<PerformanceMetricsEntity> savePerformanceMetrics(PerformanceMetricsEntity performanceMetricsEntity);
    public ResponseStructure<PerformanceMetricsEntity> findPerformanceMetrics(int id);
    public ResponseStructure<PerformanceMetricsEntity> updatePerformanceMetrics(PerformanceMetricsEntity performanceMetricsEntity, int id );
    public ResponseStructure<PerformanceMetricsEntity> deletePerformanceMetrics(int id);

    //       {
//            Optional<PerformanceMetricsEntity> optionalPerformanceMetricsEntity = performanceMetricsRepo.findById(id);
//            return optionalPerformanceMetricsEntity.orElse(null);
//        }

    }

