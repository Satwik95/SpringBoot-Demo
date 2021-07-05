package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service //tells spring that this is a bean that has to be initiated
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L, "Satwik",
                        "satwik.mishra1995@gmail.com",
                        LocalDate.of(1996, Month.SEPTEMBER, 21),
                        21
                )
        );
    }
}
