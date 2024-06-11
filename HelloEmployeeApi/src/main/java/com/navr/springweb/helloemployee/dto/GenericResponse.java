package com.navr.springweb.helloemployee.dto;

import lombok.Data;

@Data
public class GenericResponse {
    private boolean isSuccess;
    private String message;

    public GenericResponse() {

    }

    public GenericResponse(boolean isSuccess, String message) {
        this.isSuccess = isSuccess;
        this.message = message;
    }
}
