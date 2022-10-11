package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/random")
public class RandomObjectRestController {

    @PostMapping
    public ResponseEntity generate() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 25; i ++) {
            result.add("Hellos " + i);
        }
        return ResponseEntity.ok(result);
    }
}
