package com.FitnessTrackingApplication.FitnessTrackingApp.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ProductDto {

    private int id;
    private String name;
    private String description;
    private Integer calories;
    private Double protein;
    private Double carbs;
    private Double fat;
}

