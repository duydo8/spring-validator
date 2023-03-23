package com.example.springvalidator.controller;

import com.example.springvalidator.entities.Student;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.BindException;

@RestController

public class StudentController {
    @GetMapping("data")
    private ResponseEntity<?> data(@Valid @RequestBody Student student){
        return ResponseEntity.ok(student);
    }
}
