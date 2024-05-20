package com.FitnessTrackingApplication.FitnessTrackingApp.service;

import com.FitnessTrackingApplication.FitnessTrackingApp.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
    public class ProductService {

    @Autowired
    ProductDao productDao;



}
