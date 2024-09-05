package com.Mastan.project.Assignment.controller;


import com.Mastan.project.Assignment.dto.StudentDto;
import com.Mastan.project.Assignment.entity.Marks;
import com.Mastan.project.Assignment.repository.MarksRepository;
import com.Mastan.project.Assignment.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class MarksController {
    @Autowired
    private MarksRepository marksRepository;
    @Autowired
    private MarksService marksService;


    @PostMapping("/add")
    public ResponseEntity<String> addStudent(@RequestBody StudentDto studentDto) {
        Marks marks = marksService.convertDtoToEntity(studentDto);
        marksRepository.save(marks);
        return ResponseEntity.ok("Marks added successfully");
    }

    @GetMapping("/hello")
    public String hello(){
        return "Anil   !!!!!!!!!!!";
    }

}

