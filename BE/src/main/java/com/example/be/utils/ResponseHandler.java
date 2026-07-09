package com.example.be.utils;

import org.springframework.http.HttpStatus;
import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {

    public static Map<String, Object> generateResponse(String message, HttpStatus status, Object data) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", message);
        response.put("status", status.value());
        response.put("data", data);
        return response;
    }
}