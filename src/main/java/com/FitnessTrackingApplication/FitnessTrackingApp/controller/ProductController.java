package com.FitnessTrackingApplication.FitnessTrackingApp.controller;


import com.FitnessTrackingApplication.FitnessTrackingApp.entity.ProductEntity;
import com.FitnessTrackingApplication.FitnessTrackingApp.service.ProductService;
import com.FitnessTrackingApplication.FitnessTrackingApp.utill.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseStructure<ProductEntity> saveProduct(@RequestBody ProductEntity productEntity){
        return productService.saveProduct(productEntity);
    }

    @PutMapping
    public ResponseStructure<ProductEntity> update(@RequestBody ProductEntity productEntity, @RequestParam int id){
        return productService.updateProduct(productEntity,id);
    }

    @GetMapping
    public ResponseStructure<ProductEntity> findProduct(@RequestParam int id){
        return productService.findProduct(id);
    }

    @DeleteMapping
    public ResponseStructure<ProductEntity> delete(@RequestParam int id){
        return productService.deleteProduct(id);
    }
}
