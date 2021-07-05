package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student satwik = new Student(
                    "Satwik",
                    "satwik@gmail.com",
                    LocalDate.of(2000, Month.SEPTEMBER, 5),
                    21
            );
            Student pranshu = new Student(
                    "Pranshu",
                    "pranshu@gmail.com",
                    LocalDate.of(2001, Month.SEPTEMBER, 5),
                    21
            );
            repository.saveAll(List.of(satwik, pranshu));
        };
    }


}
