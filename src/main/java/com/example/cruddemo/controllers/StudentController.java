package com.example.cruddemo.controllers;


import com.example.cruddemo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {


    @Autowired
    private StudentRepo studentRepo;

    @PostMapping
    public Student create(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @GetMapping
    public List<Student> getTwo() {
        return studentRepo.findAll();
    }

    @GetMapping("{id}")
    public Student getById(@PathVariable("id") Integer id){
        return studentRepo.findById(id).get();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id){
        studentRepo.deleteById(id);
    }
}
