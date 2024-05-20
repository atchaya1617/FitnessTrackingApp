package com.FitnessTrackingApplication.FitnessTrackingApp.service;

import com.FitnessTrackingApplication.FitnessTrackingApp.dao.PerformanceMetricsDao;
import com.FitnessTrackingApplication.FitnessTrackingApp.entity.PerformanceMetricsEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.utill.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class PerformanceMetricsService {
    @Autowired
    PerformanceMetricsDao performanceMetricsDao;

    public ResponseStructure<PerformanceMetricsEntity> savePerformanceMetrics(PerformanceMetricsEntity performanceMetricsEntity) {
        ResponseStructure<PerformanceMetricsEntity> structure = new ResponseStructure<PerformanceMetricsEntity>();
        PerformanceMetricsEntity savePerformanceMetrics = performanceMetricsDao.savePerformanceMetrics(performanceMetricsEntity);
        if(savePerformanceMetrics !=null) {
            structure.setData(savePerformanceMetrics);
            structure.setMessage("performanceMetrics saved success");
            structure.setStatus(HttpStatus.CREATED.value());
            return structure;
        }return null; // exception performanceMetrics not saved
    }

    public ResponseStructure<PerformanceMetricsEntity> findPerformanceMetrics(int id){
        ResponseStructure<PerformanceMetricsEntity> structure = new ResponseStructure<PerformanceMetricsEntity>();
        PerformanceMetricsEntity exPerformanceMetrics = performanceMetricsDao.findById(id);
        if(exPerformanceMetrics!= null) {
            structure.setData(exPerformanceMetrics);
            structure.setMessage("performanceMetrics found with the given id");
            structure.setStatus(HttpStatus.FOUND.value());
            return structure;
        }return null; // exception for performanceMetrics not found for the given id
    }

    public ResponseStructure<PerformanceMetricsEntity> updatePerformanceMetrics(PerformanceMetricsEntity adhar, int id) {
        ResponseStructure<PerformanceMetricsEntity> structure = new ResponseStructure<PerformanceMetricsEntity>();
        PerformanceMetricsEntity exPerformanceMetrics = performanceMetricsDao.findById(id);
        if(exPerformanceMetrics!=null) {
            structure.setData(exPerformanceMetrics);
            structure.setMessage("performanceMetrics updated successfully");
            structure.setStatus(HttpStatus.OK.value());
            return structure;
            //return dao.updatePerformanceMetrics(exPerformanceMetrics, id);
        }return null; //exception for PerformanceMetrics not found for the given id
    }

    public ResponseStructure<PerformanceMetricsEntity> deletePerformanceMetrics(int id){
        ResponseStructure<PerformanceMetricsEntity> structure = new ResponseStructure<PerformanceMetricsEntity>();
        PerformanceMetricsEntity exPerformanceMetrics = performanceMetricsDao.findById(id);
        if(exPerformanceMetrics!=null) {
            structure.setData(exPerformanceMetrics);
            structure.setMessage("performanceMetrics deleted successfully");
            structure.setStatus(HttpStatus.OK.value());
            return structure;
        }return null;
    }
}
