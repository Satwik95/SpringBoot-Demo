package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController //-> makes the class serve rest end points
@RequestMapping(path="api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired //injection
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping //GET
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
