package com.FitnessTrackingApplication.FitnessTrackingApp.service;

import com.FitnessTrackingApplication.FitnessTrackingApp.dao.ProductDao;
import com.FitnessTrackingApplication.FitnessTrackingApp.entity.ProductEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.repository.ProductRepo;
import com.FitnessTrackingApplication.FitnessTrackingApp.utill.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
    public class ProductService implements ProductDao {

    @Autowired
    ProductDao productDao;

    @Autowired
    ProductRepo productRepo;

    @Override
    public ResponseStructure<ProductEntity> saveProduct(ProductEntity productEntity) {
        ResponseStructure<ProductEntity> structure = new ResponseStructure<>();
        ProductEntity savedProduct = productRepo.save(productEntity);
        if(productEntity!=null){
            structure.setData(savedProduct);
            structure.setMessage("Product saved successfully");
            structure.setStatus(HttpStatus.OK.value());
            return structure;
        }
        return null;
    }
@Override
    public ResponseStructure<ProductEntity> findProduct(int id){
        ResponseStructure<ProductEntity> structure = new ResponseStructure<>();
        ProductEntity exProduct = productDao.findById(id);
        if(exProduct!=null){
            structure.setData(exProduct);
            structure.setMessage(("Product found with given id"));
            structure.setStatus(HttpStatus.OK.value());
            return structure;
        }
        return null;
    }
@Override
    public ResponseStructure<ProductEntity> updateProduct(ProductEntity productEntity, int id){
        ResponseStructure<ProductEntity> structure = new ResponseStructure<>();
        ProductEntity exProduct = productDao.findById(id);
        if(exProduct!=null){
            structure.setData(exProduct);
            structure.setMessage("Product updated successfully");
            structure.setStatus(HttpStatus.OK.value());
            return structure;
        }
        return  null;
    }
@Override
    public ResponseStructure<ProductEntity>  deleteProduct( int id){
        ResponseStructure<ProductEntity> structure = new ResponseStructure<>();
        ProductEntity exProduct = productDao.findById(id);
        if (exProduct != null) {

            structure.setData(exProduct);
            structure.setMessage("Product deleted successfully");
            structure.setStatus((HttpStatus.OK.value()));
            return structure;
        }
        return null;
    }

    @Override
    public ProductEntity findById(int id) {
        return null;
    }

}
