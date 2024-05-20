package com.FitnessTrackingApplication.FitnessTrackingApp.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class UserDto {

        private int id;
        private String fname;
        private String lname;
        private String email;
        private LocalDate dob;
}
