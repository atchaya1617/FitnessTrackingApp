package com.FitnessTrackingApplication.FitnessTrackingApp.service;

import com.FitnessTrackingApplication.FitnessTrackingApp.dao.PerformanceMetricsDao;
import com.FitnessTrackingApplication.FitnessTrackingApp.entity.PerformanceMetricsEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.repository.PerformanceMetricsRepo;
import com.FitnessTrackingApplication.FitnessTrackingApp.utill.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class PerformanceMetricsService implements PerformanceMetricsDao{

    @Autowired
    PerformanceMetricsDao performanceMetricsDao;

    @Autowired
    PerformanceMetricsRepo performanceMetricsRepo;

    @Override
    public ResponseStructure<PerformanceMetricsEntity> savePerformanceMetrics(PerformanceMetricsEntity performanceMetricsEntity){
        ResponseStructure<PerformanceMetricsEntity> structure = new ResponseStructure<PerformanceMetricsEntity>();
        PerformanceMetricsEntity savePerformanceMetrics = performanceMetricsRepo.save(performanceMetricsEntity);
        if(savePerformanceMetrics!=null){
            structure.setData(savePerformanceMetrics);
            structure.setMessage("PerformanceMetrics saved successfully");
            structure.setStatus(HttpStatus.OK.value());
            return structure;
        }
        return null;
    }

@Override
    public ResponseStructure<PerformanceMetricsEntity> findPerformanceMetrics(int id){
        ResponseStructure<PerformanceMetricsEntity> structure = new ResponseStructure<PerformanceMetricsEntity>();
        PerformanceMetricsEntity exPerformanceMetrics = performanceMetricsDao.findById(id);
        if(exPerformanceMetrics!=null){
            structure.setData(exPerformanceMetrics);
            structure.setMessage("PerformanceMetrics found for given id");
            structure.setStatus(HttpStatus.OK.value());
            return structure;
        }
        return null;
    }
@Override
    public ResponseStructure<PerformanceMetricsEntity> updatePerformanceMetrics(PerformanceMetricsEntity performanceMetricsEntity, int id ){
        ResponseStructure<PerformanceMetricsEntity> structure = new ResponseStructure<PerformanceMetricsEntity>();
        PerformanceMetricsEntity exPerformanceMetrics = performanceMetricsDao.findById(id);
        if(exPerformanceMetrics!=null){
            structure.setData(exPerformanceMetrics);
            structure.setMessage("PerformanceMetrics updated successfully");
            structure.setStatus(HttpStatus.OK.value());
            return structure;
        }
        return null;
    }
@Override
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

    @Override
    public PerformanceMetricsEntity findById(int id) {
        return null;
    }
}
