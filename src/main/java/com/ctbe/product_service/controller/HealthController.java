package com.ctbe.product_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.util.Map;
import java.time.Instant;

@RestController
public class HealthController {
    @GetMapping("/health")
    public ResponseEntity<Map<String, String>> health(){
        return ResponseEntity.ok(Map.of(
                "service", "product-service",
                "version", "1,0,0",
                "status", "UP",
                "timestamp", Instant.now().toString()
        ));
    }
}
