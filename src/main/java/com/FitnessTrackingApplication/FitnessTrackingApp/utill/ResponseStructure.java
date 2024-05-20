package com.FitnessTrackingApplication.FitnessTrackingApp.utill;

import com.FitnessTrackingApplication.FitnessTrackingApp.entity.PerformanceMetricsEntity;

public class ResponseStructure<T> {

    private String message;
    private int status;
    private T data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(PerformanceMetricsEntity data) {
        this.data = (T) data;
    }
}
