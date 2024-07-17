package com.FitnessTrackingApplication.FitnessTrackingApp.dao;

import com.FitnessTrackingApplication.FitnessTrackingApp.entity.ProductEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.entity.UserEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProductDao {

    @Autowired
    ProductRepo productRepo;


    public ProductEntity saveProduct(ProductEntity productEntity){
        return productRepo.save(productEntity);
    }


    public ProductEntity update(int id){
        Optional<ProductEntity> optionalProduct = productRepo.findById(id);
        return optionalProduct.orElse(null);
    }

    public ProductEntity delete(ProductEntity productEntity, int id) {
        ProductEntity product = findById(id);
        if(productEntity!=null){
            productRepo.delete(productEntity);
            return product;
        }
        return null;
    }

    public ProductEntity findById(int id) {
        Optional<ProductEntity> optionalProduct = productRepo.findById(id);
        return optionalProduct.orElse(null);
    }

}
