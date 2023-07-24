package com.github.manimovassagh.utility;

import jakarta.enterprise.context.ApplicationScoped;


public class CustomResponse <T>{
    private Status status;
    private T response;

    public CustomResponse(Status status, T response) {
        this.status = status;
        this.response = response;
    }

    public CustomResponse() {
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "CustomResponse{" +
                "status=" + status +
                ", response=" + response +
                '}';
    }
}
