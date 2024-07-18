package com.FitnessTrackingApplication.FitnessTrackingApp.dao;

import com.FitnessTrackingApplication.FitnessTrackingApp.entity.ProductEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.entity.UserEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.repository.ProductRepo;
import com.FitnessTrackingApplication.FitnessTrackingApp.utill.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public interface ProductDao {


    public ResponseStructure<ProductEntity> saveProduct(ProductEntity productEntity);
    public ResponseStructure<ProductEntity> findProduct(int id);
    public ResponseStructure<ProductEntity> updateProduct(ProductEntity productEntity, int id);
    public ResponseStructure<ProductEntity>  deleteProduct( int id);

        public ProductEntity findById(int id) ;

}
