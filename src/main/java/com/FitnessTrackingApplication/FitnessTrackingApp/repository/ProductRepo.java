package com.FitnessTrackingApplication.FitnessTrackingApp.repository;

import com.FitnessTrackingApplication.FitnessTrackingApp.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {
}
