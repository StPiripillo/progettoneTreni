package com.generation.rolling_stock_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class RollingStockMockController {

    @GetMapping("/trains")
    public ResponseEntity<List<Map<String, Object>>> getAllTrains() {
        return ResponseEntity.ok(List.of(Map.of("id", 1, "code", "IC123", "name", "Freccia Rossa")));
    }

    @GetMapping("/trains/{id}")
    public ResponseEntity<Map<String, Object>> getTrainById(@PathVariable int id) {
        return ResponseEntity.ok(Map.of("id", id, "code", "IC123", "name", "Freccia Rossa", "coaches", List.of()));
    }

    @GetMapping("/coaches/{id}")
    public ResponseEntity<Map<String, Object>> getCoachById(@PathVariable int id) {
        return ResponseEntity.ok(Map.of("id", id, "type", "STANDARD", "seats", 60));
    }

    @GetMapping("/trains/{id}/coaches")
    public ResponseEntity<List<Map<String, Object>>> getCoachesByTrainId(@PathVariable int id) {
        return ResponseEntity.ok(List.of(Map.of("id", 1, "type", "STANDARD", "seats", 60)));
    }
}
