package com.FitnessTrackingApplication.FitnessTrackingApp.controller;

import com.FitnessTrackingApplication.FitnessTrackingApp.entity.PerformanceMetricsEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.service.PerformanceMetricsService;
import com.FitnessTrackingApplication.FitnessTrackingApp.utill.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/performanceMetrics")
public class PerformanceMetricsController {

    @Autowired
    PerformanceMetricsService performanceMetricsService;


    @PostMapping
    public ResponseStructure<PerformanceMetricsEntity> savePerformanceMetrics(@RequestBody PerformanceMetricsEntity performanceMetrics) {
        return performanceMetricsService.savePerformanceMetrics(performanceMetrics);
    }

    @GetMapping
    public ResponseStructure<PerformanceMetricsEntity>  findPerformanceMetrics(@RequestParam int id) {
        return performanceMetricsService.findPerformanceMetrics(id);
    }

    @DeleteMapping
    public ResponseStructure<PerformanceMetricsEntity> deletePerformanceMetrics(@RequestParam int id) {
        return performanceMetricsService.deletePerformanceMetrics(id);

    }

    @PutMapping
    public ResponseStructure<PerformanceMetricsEntity>  updatePerformanceMetrics(@RequestBody PerformanceMetricsEntity performanceMetrics, @RequestParam int id) {
        try {
            return performanceMetricsService.updatePerformanceMetrics(performanceMetrics, id);
        }catch (Exception error){
            return new ResponseStructure<>();
        }
    }

}
