package com.example.cruddemo;

import com.example.cruddemo.controllers.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
